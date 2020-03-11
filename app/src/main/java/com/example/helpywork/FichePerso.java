package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FichePerso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_perso);

        TextView name = (TextView) findViewById(R.id.name);
        ImageView img = (ImageView) findViewById(R.id.img);

        Intent intent = getIntent();

        int convert = Integer.parseInt(intent.getStringExtra("img"));


        name.setText(intent.getStringExtra("name"));
        img.setImageResource(convert);

    }
    public void onClick(View v){
        String ville = "coquelles";
        String uri = "google.navigation:q=" + ville;
        Uri gmmIntentUri = Uri.parse(uri);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}


