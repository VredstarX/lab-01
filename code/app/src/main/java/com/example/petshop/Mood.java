package com.example.petshop;

import java.util.Date;

public abstract class Mood {


    private Date moodDate;
    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }
    public Mood(){
        this.moodDate = new Date();
    }
    public Mood(Date date){
        this.moodDate = date;
    }
}
