package com.kramer.todolist;

import androidx.room.Embedded;
import androidx.room.Relation;

public class ListeElementOgPaaminnelserType {
    @Embedded
    public ListeElement listeElement;
    @Relation(
            parentColumn = "elementId",
            entityColumn = "paaminnelseId"
    )
    public Paaminnelse paaminnelse;
}