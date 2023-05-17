package com.sovisrushain.auth.service;

import com.sovisrushain.auth.dto.SuperHeroDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SuperHeroService {
    String saveHero(SuperHeroDTO dto);
    SuperHeroDTO getHero(int id);
    List<SuperHeroDTO> getAllHeroes();
    String removeHero(int id);
}
