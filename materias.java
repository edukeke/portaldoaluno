package com.example.logonrmlocal.nac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class materias extends AppCompatActivity {

    String items[] = new String [] {"Startup One", "Desenvolvimento Mobile", "Automação Industrial", "Inteligência Artificial","Iot","Sistemas Embarcado","Banco de dados"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materias);

        ListView listView = (ListView) findViewById(R.id.ListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }
}
