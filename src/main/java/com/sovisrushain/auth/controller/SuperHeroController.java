package com.sovisrushain.auth.controller;

import com.sovisrushain.auth.dto.SuperHeroDTO;
import com.sovisrushain.auth.service.SuperHeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/heroes")
@RequiredArgsConstructor
public class SuperHeroController {

    private final SuperHeroService superHeroService;

    @PostMapping
    public String saveHero(@RequestBody SuperHeroDTO dto) {
        return superHeroService.saveHero(dto);
    }

    @GetMapping("/{id}")
    public SuperHeroDTO getHero(@PathVariable int id) {
        return superHeroService.getHero(id);
    }

    @GetMapping
    public List<SuperHeroDTO> getAllHeroes() {
        return superHeroService.getAllHeroes();
    }

    @DeleteMapping("/{id}")
    public String removeHero(@PathVariable int id) {
        return superHeroService.removeHero(id);
    }

}
