package com.example.notestar;

import android.graphics.Bitmap;

public class NoteStar {
    public int position;
    public String name;
    public String description;
    public Bitmap photo;

    public NoteStar(int position, String name, String description, Bitmap photo) {
        this.position = position;
        this.name = name;
        this.description = description;
        this.photo = photo;
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

    public Bitmap getPhoto() {
        return photo;
    }
}
