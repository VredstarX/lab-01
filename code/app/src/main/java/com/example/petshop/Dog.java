package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable{
    public Dog(String name){ //constructor
        super(name);
    }
    public Dog(String name, Date birthDate){
        super(name, birthDate); //maps cat class constructor to pet constructor

    }
    @Override
    public String speak(){
        return "bark";
    }

    @Override
    public void pet() {

    }
}
