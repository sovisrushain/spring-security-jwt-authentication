package com.sovisrushain.auth.repository;

import com.sovisrushain.auth.model.SuperHero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperHeroRepository extends JpaRepository<SuperHero, Integer> {
}
