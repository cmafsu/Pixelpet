package com.example.petapp;

public class Pet {
    private String name;
    private String mood;
    private int hunger;
    private int health;

    public Pet(String name){
        this.name = name;
        this.mood = "happy";
        this.hunger = 0;
        this.health = 100;
    }


    public String getName()
    {
        return name;
    }
    public String setName(String name)
    {
        this.name = name;
        return name;
    }
    public String getMood()
    {
        return mood;
    }
    public int getHunger()
    {
        return hunger;
    }
    public int getHealth()
    {
        return health;
    }
}
