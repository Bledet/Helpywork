package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ProposerEnLigne extends AppCompatActivity {

    Spinner spinnermatiere, spinnerniveau1, spinnerniveau2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposer_en_ligne);


        spinnermatiere = (Spinner) findViewById(R.id.spinnermatiere);
        List matierearray = new ArrayList();
        matierearray.add("Mathèmatiques");
        matierearray.add("Français");
        matierearray.add("Anglais");
        matierearray.add("Histoire");
        matierearray.add("Géographie");
        matierearray.add("SVT");
        matierearray.add("Physique");
        matierearray.add("Chimie");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                matierearray
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnermatiere.setAdapter(adapter);



        spinnerniveau1 = (Spinner) findViewById(R.id.spinnerniveau1);
        List niveauarray = new ArrayList();
        niveauarray.add("6ème");
        niveauarray.add("5ème");
        niveauarray.add("4ème");
        niveauarray.add("3ème");
        niveauarray.add("2nd");
        niveauarray.add("1ère");
        niveauarray.add("Terminale");

        ArrayAdapter adapter2 = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                niveauarray
        );

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerniveau1.setAdapter(adapter2);


        spinnerniveau2 = (Spinner) findViewById(R.id.spinnerniveau2);


        ArrayAdapter adapter3 = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                niveauarray
        );

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerniveau2.setAdapter(adapter3);

    }

    public void onClick(View v){

        Intent intent = new Intent(ProposerEnLigne.this, ListePostes.class);
        startActivityForResult(intent, 1);

    }
}
