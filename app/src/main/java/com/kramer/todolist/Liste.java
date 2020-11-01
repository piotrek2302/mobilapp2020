package com.kramer.todolist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDateTime;

@Entity(tableName = "Liste")
public class Liste {
    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
        int listeId;
    @ColumnInfo
        String tittel;
    @ColumnInfo
        LocalDateTime dato_laget;
    @ColumnInfo
        LocalDateTime dato_endret;
    @ColumnInfo
        boolean ferdig;

    public Liste(int listeId, String tittel, LocalDateTime dato_laget, LocalDateTime dato_endret, boolean ferdig) {
        this.listeId = listeId;
        this.tittel = tittel;
        this.dato_laget = dato_laget;
        this.dato_endret = dato_endret;
        this.ferdig = ferdig;
    }

    public int getListeId() {
        return listeId;
    }


    public void setListeId(int listeId) {
        this.listeId = listeId;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel){
        this.tittel = tittel;
    }

    public LocalDateTime getdato_laget() {
        return dato_laget;
    }

    public void setdato_laget(LocalDateTime dato_laget) {
        this.dato_laget = dato_laget;
    }

    public LocalDateTime getdato_endret() {
        return dato_endret;
    }

    public void setdato_endret(LocalDateTime dato_endret) {
        this.dato_endret = dato_endret;
    }

    public boolean isFerdig() {
        return ferdig;
    }

    public void setFerdig(boolean ferdig) {
        this.ferdig = ferdig;
    }

    @Override
    public String toString() {
        return "Liste: \n" +
                "listeId = " + listeId +
                ", tittel = " + tittel +
                ", dato_laget = " + dato_laget.toString() +
                ", dato_endret = " + dato_endret.toString() +
                ", ferdig:" + ferdig;
    }

}
