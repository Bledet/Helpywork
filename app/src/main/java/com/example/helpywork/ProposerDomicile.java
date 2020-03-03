package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ProposerDomicile extends AppCompatActivity {

    Spinner spinnermatiere, spinnerniveau;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposer_domicile);


        spinnerniveau = (Spinner) findViewById(R.id.spinnerniveau);
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
                R.layout.spinner_item,
                niveauarray
        );

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerniveau.setAdapter(adapter2);

    }

    public void onClick(View v){

        Intent intent = new Intent(ProposerDomicile.this, Account.class);
        startActivityForResult(intent, 1);

    }
}
