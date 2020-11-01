package com.kramer.todolist;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

public interface ListeElementDAO {
    @Transaction
    @Query("Select * from ListeElement")
    List<ListeElement> lastAlleListeE();

    @Insert
    void insertListeE(ListeElement listeElement);
    @Update
    void updateListeE(ListeElement listeElement);
    @Delete
    void deleteListeE(ListeElement listeElement);
}
