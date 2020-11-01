package com.kramer.todolist;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

public interface ListeDAO {
    @Transaction
    @Query("Select * from Liste")
    List<Liste> lastAlleListerOgAnnent();

    @Query("Select * from liste")
    List<Liste> lastAlleLister();

    @Insert
    void insertListe(Liste liste);
    @Update
    void updateListe(Liste liste);
    @Delete
    void deleteListe(Liste liste);
}
