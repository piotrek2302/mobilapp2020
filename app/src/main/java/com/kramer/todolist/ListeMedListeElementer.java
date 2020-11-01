package com.kramer.todolist;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class ListeMedListeElementer {
    @Embedded
    public Liste liste;
    @Relation(
            parentColumn = "listeId",
            entityColumn = "elementId"
    )
    public List<ListeElement> listeElementer;
}