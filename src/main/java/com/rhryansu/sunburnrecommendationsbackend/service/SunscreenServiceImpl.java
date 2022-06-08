package com.rhryansu.sunburnrecommendationsbackend.service;

import com.rhryansu.sunburnrecommendationsbackend.model.Sunscreen;
import com.rhryansu.sunburnrecommendationsbackend.repository.SunscreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@Service
public class SunscreenServiceImpl implements SunscreenService{

    @Autowired
    private SunscreenRepository sunscreenRepository;

    @Override
    public Sunscreen saveSunscreen(Sunscreen sunscreen) {
        return sunscreenRepository.save(sunscreen);
    }

    @Override
    public List<Sunscreen> getAllSunscreen() {
        return sunscreenRepository.findAll();
    }

    @Override
    public Sunscreen getSunscreenById(int id) {
        return sunscreenRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSunscreen(Sunscreen sunscreen) {
        sunscreenRepository.delete(sunscreen);
    }

    @Override
    public void deleteAllSunscreen() {
        sunscreenRepository.deleteAll();
    }

    @Override
    public void deleteSunscreenById(int id) {
        sunscreenRepository.deleteById(id);
    }

    @Override
    public void updateSunscreenById(int id, Sunscreen s) {
        Sunscreen sunscreen = sunscreenRepository.findById(id).orElse(null);
        Objects.requireNonNull(sunscreen).setName(s.getName());
        sunscreen.setPrice(s.getPrice());
        sunscreen.setSpf(s.getSpf());
        sunscreen.setDescription(s.getDescription());
        sunscreen.setImageLink(s.getImageLink());
        sunscreen.setReviewLink(s.getReviewLink());
        sunscreenRepository.save(sunscreen);
    }

    @Override
    public void updateSunscreen(Sunscreen sunscreen) {
        sunscreenRepository.save(sunscreen);
    }
}
