package com.kramer.todolist;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class MyDatabase extends RoomDatabase {
    public  static final String DBNAME = "ListeAppDatabase";
    private static MyDatabase INSTANCE;

    public abstract ListeDAO mylisteDao();
    public abstract ListeElementDAO myListeElementDao();
    public abstract ElementTypeDAO ElementTypeDao();
    public abstract PaaminnelseDAO PaaminnelseDao();

    static MyDatabase getDatabase(final Context context){

        if(INSTANCE ==null){
            synchronized (MyDatabase.class){
                if(INSTANCE==null){
                    INSTANCE= Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class,DBNAME)
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
