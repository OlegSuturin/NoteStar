package com.example.notestar;
// create POJO
import android.graphics.Bitmap;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_star")
public class NoteStar {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private int position;
    private String name;
    private String description;
    //public Bitmap photo;
    private int imageResourceId;

    public NoteStar(int id, int position, String name, String description, int imageResourceId) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    @Ignore
    public NoteStar(int position, String name, String description, int imageResourceId) {
        this.position = position;
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageResourceId(int imageResourceId) {
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
