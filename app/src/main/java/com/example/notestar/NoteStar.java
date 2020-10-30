package com.example.notestar;

import android.graphics.Bitmap;

public class NoteStar {
    private int position;
    private String name;
    private String description;
    //public Bitmap photo;
    private int imageResourceId;

    public NoteStar(int position, String name, String description, int imageResourceId) {
        this.position = position;
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
