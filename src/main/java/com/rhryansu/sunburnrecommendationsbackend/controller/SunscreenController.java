package com.rhryansu.sunburnrecommendationsbackend.controller;

import com.rhryansu.sunburnrecommendationsbackend.model.Sunscreen;
import com.rhryansu.sunburnrecommendationsbackend.service.SunscreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sunscreen")
@CrossOrigin
public class SunscreenController {

    @Autowired
    private SunscreenService sunscreenService;

    @PostMapping(value = "/add")
    public String add(@RequestBody Sunscreen sunscreen) {
        sunscreenService.saveSunscreen(sunscreen);
        return "New Sunscreen Added.";
    }

    @GetMapping(value = "/getAll")
    public List<Sunscreen> getAllSunscreen() {
        return sunscreenService.getAllSunscreen();
    }

    @GetMapping(value = "/get/{id}")
    public Sunscreen getSunscreenById(@PathVariable int id) {
        return sunscreenService.getSunscreenById(id);
    }

    @PutMapping(value = "/edit")
    public String updateSunscreenById(@RequestBody Sunscreen sunscreen) {
        sunscreenService.updateSunscreenById(sunscreen.getId(), sunscreen);
        return "Update Success.";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteSunscreenById(@PathVariable int id) {
        sunscreenService.deleteSunscreenById(id);
        return "Delete Success.";
    }
}
