package com.kramer.todolist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ListeElement")
public class ListeElement {
    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
        private int elementId;
    @ColumnInfo
        private int type;
    @ColumnInfo
        private String innhold;
    @ColumnInfo
        private int listeid;

    public ListeElement(int id, int type, String innhold, int listeid) {
        this.elementId = id;
        this.type = type;
        this.innhold = innhold;
        this.listeid = listeid;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getInnhold() {
        return innhold;
    }

    public void setInnhold(String innhold) {
        this.innhold = innhold;
    }

    public int getListeid() {
        return listeid;
    }

    public void setListeid(int listeid) {
        this.listeid = listeid;
    }

    @Override
    public String toString() {
        return "ListeElementer{" +
                "elementId=" + elementId +
                ", type=" + type +
                ", innhold='" + innhold + '\'' +
                ", listeid=" + listeid +
                '}';
    }

}
