package com.example.notestar;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NotesStarDao {

    @Query("SELECT * FROM note_star ORDER BY position DESC ")
    List<NoteStar> getAllNoteStar();

//    @Query("SELECT * FROM note_star WHERE id =='ids'")
//    NoteStar getOneNoteStar(int ids);

    @Insert
    void insertNoteStar(NoteStar noteStar);

    @Update
    void updateNoteStar(NoteStar noteStar);

    @Delete
    void deleteNoteStar(NoteStar noteStar);

    @Query("DELETE FROM note_star")
    void deleteAllNotes();

}
