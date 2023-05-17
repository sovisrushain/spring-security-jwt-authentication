package com.sovisrushain.auth.service;

import com.sovisrushain.auth.dto.SuperHeroDTO;
import com.sovisrushain.auth.model.SuperHero;
import com.sovisrushain.auth.repository.SuperHeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SuperHeroServiceImpl implements SuperHeroService {

    private final SuperHeroRepository superHeroRepository;

    @Override
    public String saveHero(SuperHeroDTO dto) {
        SuperHero hero = new SuperHero(dto.getId(), dto.getName());
        superHeroRepository.save(hero);
        return "Saved";
    }

    @Override
    public SuperHeroDTO getHero(int id) {
        Optional<SuperHero> hero = superHeroRepository.findById(id);
        SuperHeroDTO dto = new SuperHeroDTO();
        if(hero.isPresent()) {
            dto.setId(hero.get().getId());
            dto.setName(hero.get().getName());
        }
        return dto;
    }

    @Override
    public List<SuperHeroDTO> getAllHeroes() {
        List<SuperHero> heroes = superHeroRepository.findAll();
        List<SuperHeroDTO> dtoList = new ArrayList<>();
        heroes.forEach(superHero -> dtoList.add(new SuperHeroDTO(superHero.getId(), superHero.getName())));
        return dtoList;
    }

    @Override
    public String removeHero(int id) {
        superHeroRepository.deleteById(id);
        return "Deleted";
    }
}
