package com.rhryansu.sunburnrecommendationsbackend.service;

import com.rhryansu.sunburnrecommendationsbackend.model.Sunscreen;

import java.util.List;

public interface SunscreenService {

    public Sunscreen saveSunscreen(Sunscreen sunscreen);

    public List<Sunscreen> getAllSunscreen();

    public Sunscreen getSunscreenById(int id);

    public void deleteSunscreenById(int id);

    public void deleteAllSunscreen();

    public void deleteSunscreen(Sunscreen sunscreen);

    public void updateSunscreenById(int id, Sunscreen s);

    public void updateSunscreen(Sunscreen sunscreen);
}
