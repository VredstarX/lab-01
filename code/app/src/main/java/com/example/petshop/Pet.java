package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    public Pet(String name){ //init func
        this.name = name;
        this.birthDate = new Date(); // creates default date
    }
    public Pet(String name, Date birthDate){ //second init, for flex.
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String speak(){
        return "";
    }
}



