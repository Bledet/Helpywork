package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ProposerEnLigne extends AppCompatActivity {

    Spinner spinnermatiere, spinnerniveau1, spinnerniveau2;
    private TextView chosen;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposer_en_ligne);

        intent = getIntent();

        chosen = findViewById(R.id.chosen);
        chosen.setText("Aider en " + intent.getStringExtra("matiere"));

        spinnerniveau1 = (Spinner) findViewById(R.id.spinnerniveau1);
        List niveauArray = new ArrayList();
        niveauArray.add("6ème");
        niveauArray.add("5ème");
        niveauArray.add("4ème");
        niveauArray.add("3ème");
        niveauArray.add("2nd");
        niveauArray.add("1ère");
        niveauArray.add("Terminale");

        ArrayAdapter adapter2 = new ArrayAdapter(
                this,
                R.layout.spinner_item,
                niveauArray
        );

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerniveau1.setAdapter(adapter2);


        spinnerniveau2 = (Spinner) findViewById(R.id.spinnerniveau2);


        ArrayAdapter adapter3 = new ArrayAdapter(
                this,
                R.layout.spinner_item,
                niveauArray
        );

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerniveau2.setAdapter(adapter3);

    }

    public void onClick(View v){

        Intent sendIntent = new Intent(ProposerEnLigne.this, ListePostes.class);
        sendIntent.putExtra("matiere", intent.getStringExtra("matiere"));
        startActivity(sendIntent);

    }
}
