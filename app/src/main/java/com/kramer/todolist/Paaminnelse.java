package com.kramer.todolist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;

@Entity(tableName = "Paaminnelse")
public class Paaminnelse {
    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
        private int paaminnelseId;
    @ColumnInfo
        private LocalDateTime tid;
    @ColumnInfo
        private String tidForPamminelse;
    @ColumnInfo
        private int elementId;

    public Paaminnelse(int id, LocalDateTime tid, String tidForPamminelse) {
        this.paaminnelseId = id;
        this.tid = tid;
        this.tidForPamminelse = tidForPamminelse;
        this.elementId = elementId;
    }

    public int getpaaminnelseId() {
        return paaminnelseId;
    }

    public void setpaaminnelseId(int id) {
        this.paaminnelseId = id;
    }

    public LocalDateTime getTid() {
        return tid;
    }

    public void setTid(LocalDateTime tid) {
        this.tid = tid;
    }

    public String getTidForPamminelse() {
        return tidForPamminelse;
    }

    public void setTidForPamminelse(String tidForPamminelse) {
        this.tidForPamminelse = tidForPamminelse;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    @Override
    public String toString() {
        return "Paaminnelse{" +
                "paaminnelseId=" + paaminnelseId +
                ", tid=" + tid +
                ", tidForPamminelse='" + tidForPamminelse + '\'' +
                ", elementId=" + elementId +
                '}';
    }
}
