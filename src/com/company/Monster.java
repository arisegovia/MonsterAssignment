package com.company;

public class Monster {

    //fields
    private String name;

    //constructors
    public Monster(String name) {
        this.name = name;
    }

    //methods
    public String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}