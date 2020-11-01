package com.kramer.todolist;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface PaaminnelseDAO {
    @Query("Select * from Paaminnelse")
    List<Paaminnelse> lastAllePaaminnelser();
    @Insert
    void insertPaaminnelse(Paaminnelse paaminnelse);
    @Update
    void updatePaaminnelse(Paaminnelse paaminnelse);
    @Delete
    void deletePaaminnelse(Paaminnelse paaminnelse);
}
