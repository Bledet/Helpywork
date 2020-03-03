package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProposerAide extends AppCompatActivity {


    private int CREATE = 1;
    private ImageButton selected;

    private ImageButton aideEnLigne;
    private ImageButton aideADomicile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposer_aide);


        aideEnLigne = (ImageButton) findViewById(R.id.aideEnLigne);
        aideADomicile = (ImageButton) findViewById(R.id.aideADomicile);

        aideEnLigne.setTag("online");
        aideADomicile.setTag("offline");

    }

    public void onClick(View v){
        selected = findViewById(v.getId());


        if(selected.getTag() == "online"){
            Intent intent = new Intent(ProposerAide.this, SelectMatiere.class);
            intent.putExtra("typeAide", "online");
            startActivityForResult(intent, CREATE);
        } else if ( selected.getTag() == "offline"){
            Intent intent = new Intent(ProposerAide.this, SelectMatiere.class);
            intent.putExtra("typeAide","offline");
            startActivityForResult(intent, CREATE);
        }

    }
}
