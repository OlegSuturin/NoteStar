package com.example.notestar;

import android.content.Context;
import android.view.inspector.StaticInspectionCompanionProvider;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {NoteStar.class}, version =1, exportSchema = false)
public abstract class NotesStarDatabase extends RoomDatabase {

    private static NotesStarDatabase database;
    private static final String DB_NAME = "notes_star2.db";
    private static final Object LOCK = new Object();

    public static NotesStarDatabase getInstance(Context context){
        synchronized (LOCK) {
            if (database == null) {
                database = Room.databaseBuilder(context, NotesStarDatabase.class, DB_NAME).allowMainThreadQueries().build(); //тестирование БД в главном потоке
            }
        }
        return database;
    }

    public abstract NotesStarDao notesStarDao();  //через данный метод реализован доступ к методам интерфейса

}
