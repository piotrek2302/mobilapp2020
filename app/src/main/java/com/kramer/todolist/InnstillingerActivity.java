package com.kramer.todolist;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

public class InnstillingerActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);
        //getFragmentManager().beginTransaction().replace(android.R.elementId.content, new InnstillingerFragment()).commit();
    }
}
