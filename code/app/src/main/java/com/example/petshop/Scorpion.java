package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet{
    public Scorpion(String name){ //constructor
        super(name);
    }
    public Scorpion(String name, Date birthDate){
        super(name, birthDate); //maps cat class constructor to pet constructor

    }
    @Override
    public String speak(){
        return "hiss";
    }
}
