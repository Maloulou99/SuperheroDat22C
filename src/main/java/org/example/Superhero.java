package org.example;

import java.time.LocalDate;

public class Superhero {

    private String name;
    private String realName;
    private String superpower;
    private LocalDate yearCreated;
    private boolean isHuman;
    private int strength;
    private String weapon;

    public Superhero(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public Superhero(String name, String realName, String superpower, LocalDate yearCreated, boolean isHuman, int strength) {
        this.name = name;
        this.realName = realName;
        this.superpower = superpower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public LocalDate getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(LocalDate yearCreated) {
        this.yearCreated = yearCreated;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superpower='" + superpower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHuman=" + isHuman +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
