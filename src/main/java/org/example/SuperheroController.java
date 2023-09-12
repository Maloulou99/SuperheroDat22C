package org.example;

import java.time.LocalDate;
import java.util.List;

public class SuperheroController {
    private SuperheroDatabase database;

    public SuperheroController(SuperheroDatabase database) {
        this.database = database;
    }

    public boolean addSuperhero(String name, String realName, String superpower, LocalDate yearCreated, boolean isHuman, int strength){
        return database.addSuperheroes(name, realName, superpower, yearCreated, isHuman,strength);
    }

    public void showSuperhero(){
        database.showSuperheroes();
    }

    public boolean removeSuperhero(String superheroName){
        return database.removeSuperhero(superheroName);
    }
}
