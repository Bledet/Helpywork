package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SelectMatiere extends AppCompatActivity {

    private int CREATE = 1;
    private String typeAide;
    private String statut;
    private String selectedMatiere;
    private ImageButton selected;

    private ImageButton mathButton;
    private ImageButton physiqueButton;
    private ImageButton chimieButton;
    private ImageButton svtButton;
    private ImageButton geoButton;
    private ImageButton histButton;
    private ImageButton francaisButton;
    private ImageButton anglaisButton;
    private ImageButton artButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_matiere);

        Intent intent = getIntent();
        typeAide = intent.getStringExtra("typeAide");
        statut = intent.getStringExtra("statut");

        mathButton = (ImageButton) findViewById(R.id.mathButton);
        physiqueButton = (ImageButton) findViewById(R.id.physiqueButton);
        chimieButton = (ImageButton) findViewById(R.id.chimieButton);
        svtButton = (ImageButton) findViewById(R.id.svtButton);
        histButton = (ImageButton) findViewById(R.id.histButton);
        geoButton = (ImageButton) findViewById(R.id.geoButton);
        francaisButton = (ImageButton) findViewById(R.id.francaisButton);
        anglaisButton = (ImageButton) findViewById(R.id.anglaisButton);
        artButton = (ImageButton) findViewById(R.id.artButton);

        mathButton.setTag("math");
        physiqueButton.setTag("physique");
        chimieButton.setTag("chimie");
        svtButton.setTag("svt");
        histButton.setTag("histoire");
        geoButton.setTag("geographie");
        francaisButton.setTag("francais");
        anglaisButton.setTag("anglais");
        artButton.setTag("art");
    }

    public void onClick(View v) {
        selected = findViewById(v.getId());

        goNextActivity(selected.getTag().toString(), typeAide);

    }

    public String generateMatiere(String tag){
        switch (tag){
            case "math" :
                return "Mathématique";
            case "physique" :
                return "Physique";
            case "chimie" :
                return "Chimie";
            case "histoire" :
                return "Histoire";
            case "geographie" :
                return "Géographie";
            case "svt" :
                return "SVT";
            case "francais" :
                return "Français";
            case "anglais" :
                return "Anglais";
            case "art" :
                return "Art";
            default:
                return "Empty";
        }
    }

    public void goNextActivity(String tag, String typeAide) {
        Intent intent;
        if (typeAide.matches("online")) {
            System.out.println("EN LIGNE");
            if(statut.matches("etudiant")){
                System.out.println("ETUDIANT EN LIGNE");
                intent = new Intent(SelectMatiere.this, AideEnLigne.class);
            } else {
                System.out.println("PROF EN LIGNE");
                intent = new Intent(SelectMatiere.this, ProposerEnLigne.class);
            }
        } else {
            System.out.println("HORS LIGNE");
            if(statut.matches("etudiant")) {
                System.out.println("ETUDIANT HORS LIGNE");
                intent = new Intent(SelectMatiere.this, AideDomicile.class);
            } else {
                System.out.println("PROF HORS LIGNE");
                intent = new Intent(SelectMatiere.this, ProposerDomicile.class);
            }
        }
        intent.putExtra("matiere", generateMatiere(tag));
        intent.putExtra("typeAide", typeAide);
        startActivity(intent);
    }
}

