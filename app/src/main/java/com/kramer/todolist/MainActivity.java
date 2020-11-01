package com.kramer.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Liste> lstListeoversikt = new ArrayList<>();
    private RecyclerView oversiktRecView;
    //private MyDatabase mDB;
    private TodoOversiktRecAdapter todoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oversiktRecView = findViewById(R.id.listeRecView);
        oversiktRecView.setLayoutManager(new LinearLayoutManager(this));

        todoAdapter = new TodoOversiktRecAdapter(this);
        oversiktRecView.setAdapter(todoAdapter);

    }

    protected void onResume() {
        super.onResume();
        lstListeoversikt.add(new Liste(1, "Testliste", "Dette her er innhold i lista",
                "2020-01-01", "2020-01-01", false));
        lstListeoversikt.add(new Liste(2, "Testliste2", "Dette her er innhold i lista",
                "2020-02-01", "2020-03-01", false));
        todoAdapter.setData(lstListeoversikt);
    }

    public void startInnstillinger(View view) {
        Intent intent = new Intent(this, InnstillingerActivity.class);
        startActivity(intent);
    }
}