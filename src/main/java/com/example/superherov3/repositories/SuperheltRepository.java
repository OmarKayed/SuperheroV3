package com.example.superherov3.repositories;

import com.example.superherov3.model.Superhelt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class SuperheltRepository {

    Superhelt superhelt1 = new Superhelt("omar", "omar", 2000, "Stærk", false, 3.0);
    Superhelt superhelt2 = new Superhelt("Bruce Wayne", "batman", 1990, "Rig", true, 2.0);
    Superhelt superhelt3 = new Superhelt("Barry Allen", "The Flash", 1990, "Hurtig", true, 1.5);

    List <Superhelt> superhelte = new ArrayList<>(Arrays.asList(superhelt1, superhelt2, superhelt3));

    public List<Superhelt> getSuperhelte () {
        return superhelte;
    }

    // creating superhero from parameters
    public Superhelt createSuperHero(String realName, String heroName,
                                     int creationYear, String superPower, boolean isHuman, double power) {
        Superhelt newSuperHero = new Superhelt(realName, heroName, creationYear, superPower, isHuman, power);
        superhelte.add(newSuperHero);

        return newSuperHero;
    }


    public List<Superhelt> searchForSuperhero(String searchTerm) {
        List<Superhelt> searchResults = new ArrayList<>(); // creating arraylist of superheroes

        // Loop through arraylist of superheroes, return if matching searchTerm
        for (Superhelt superhero : superhelte) {
            String name = superhero.getHeroName().toLowerCase(); // making all characters in superhero name lower case
            if (name.contains(searchTerm.toLowerCase().trim())) { // if superhero contains searchTerm, add superhero to arraylist
                searchResults.add(superhero);
            }
        }
        // return searchResult
        return searchResults;
    }

    public List<Superhelt> deleteSuperhero(String searchTerm) {
        List<Superhelt> searchResault = new ArrayList<>();

        searchResault = searchForSuperhero(searchTerm);

        for (Superhelt superhelt : searchResault) {
            getSuperhelte().remove(superhelt);
        }

        return searchResault;
    }

    public Superhelt changeSuperhero (Superhelt superhelt){

        if (superhelt.getHeroName().equals(superhelt.getHeroName())) {

            String newSuperheroName = superhelt.getHeroName();
            superhelt.setHeroName(newSuperheroName);

            String newSuperheroRealName = superhelt.getRealName();
            superhelt.setRealName(newSuperheroRealName);

            double newSuperheroPower = superhelt.getPower();
            superhelt.setPower(String.valueOf(newSuperheroPower));

            int newSuperheroCreationyear = superhelt.getCreationYear();
            superhelt.setCreationYear(String.valueOf(newSuperheroCreationyear));

            boolean newSuperheroIsHuman = superhelt.isHuman();
            superhelt.setHuman(newSuperheroIsHuman);

        }
        return superhelt;
    }

}
