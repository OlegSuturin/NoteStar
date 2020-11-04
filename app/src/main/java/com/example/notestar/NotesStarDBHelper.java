package com.example.notestar;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class NotesStarDBHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "notes_star.db";
    public static final int DB_VERSION = 1;


    public NotesStarDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(NotesStarContract.NotesEntry.CREATE_COMMAND);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(NotesStarContract.NotesEntry.DROP_COMMAND);
        onCreate(db);
    }
}
