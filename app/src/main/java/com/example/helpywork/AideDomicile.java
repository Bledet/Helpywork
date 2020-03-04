package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AideDomicile extends AppCompatActivity {

    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid"
    };

    LinearLayout layoutList;
    Button btnPoster;
    private TextView matiere;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide_domicile);

        intent = getIntent();
        matiere = findViewById(R.id.matiere);
        matiere.setText("Aide à domicile en " + intent.getStringExtra("matiere"));

        Spinner spinnerNiveau = (Spinner) findViewById(R.id.spinnerNiveau);
        btnPoster = findViewById(R.id.poster);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.niveau_array, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNiveau.setAdapter(adapter);

    }

    public void onClick(View v){
        Intent intent = new Intent(AideDomicile.this, TypeAide.class);
        startActivity(intent);
    }

}
