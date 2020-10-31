package com.example.notestar;

import java.util.ArrayList;

public class StarNomination {
    private String name;
    private String nomination;
    private int  place;

    public StarNomination(String name, String nomination, int place) {
        this.name = name;
        this.nomination = nomination;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public String getNomination() {
        return nomination;
    }

    public int getPlace() {
        return place;
    }
}
