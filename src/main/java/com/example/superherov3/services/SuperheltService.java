package com.example.superherov3.services;

import com.example.superherov3.model.Superhelt;
import org.springframework.stereotype.Service;
import com.example.superherov3.repositories.SuperheltRepository;

import java.util.List;

@Service
public class SuperheltService {
    private SuperheltRepository superheltRepository;

    public List <Superhelt> getSuperhelte() {
        return superheltRepository.getSuperhelte();
    }

    public List <Superhelt> searchForSuperhero(String searchTerm){
        return superheltRepository.searchForSuperhero(searchTerm);
    }

    public List <Superhelt> deleteSuperhero(String searchTerm){
        return superheltRepository.deleteSuperhero(searchTerm);
    }

    public Superhelt changeSuperhero (Superhelt superhelt) {
        return superheltRepository.changeSuperhero(superhelt);
    }

    public Superhelt createSuperhero(String realName, String heroName, int crationYear, String superPower,
    boolean isHuman, double power){
        return superheltRepository.createSuperHero(realName, heroName, crationYear, superPower, isHuman, power);
    }

    public SuperheltService(SuperheltRepository superheltRepository){
        this.superheltRepository = superheltRepository;
    }


}
