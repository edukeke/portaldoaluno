package com.example.logonrmlocal.nac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class principal extends AppCompatActivity {
    private Button btnMateria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnMateria = (Button) findViewById(R.id.btnMateria);
        btnMateria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmaterias();
            }
        });
    }

    public void openmaterias() {
        Intent intent = new Intent(this, materias.class);
        startActivity(intent);
    }
}
