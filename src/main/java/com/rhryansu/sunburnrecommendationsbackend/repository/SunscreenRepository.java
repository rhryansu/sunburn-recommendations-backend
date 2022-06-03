package com.rhryansu.sunburnrecommendationsbackend.repository;

import com.rhryansu.sunburnrecommendationsbackend.model.Sunscreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SunscreenRepository extends JpaRepository<Sunscreen, Integer> {
}
