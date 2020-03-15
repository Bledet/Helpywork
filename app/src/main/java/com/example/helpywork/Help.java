package com.example.helpywork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Help extends AppCompatActivity {

    private ListView lvAides;
    private ListView lvDemandes;

    private String[] aides = new String[]{
            "Camille - Terminale - Mathématiques",
            "Antoine - Seconde - Physique",
            "Laura - Première - Français",
            "Justine - Cinquième - Mathématiques",
            "Marc-Antoine - Sixième - Anglais"
    };

    private String[] demandesAide = new String[]{
            "Mathématiques - Intégrale",
            "Physique - Mécanique"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.aides);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),
                                Account.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.aides:
                        return true;
                    case R.id.aider:
                        startActivity(new Intent(getApplicationContext(),
                                Aider.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        lvAides = findViewById(R.id.listViewContribs);
        lvDemandes = findViewById(R.id.listViewHelps);

        final ArrayAdapter<String> adapterAides = new ArrayAdapter<String>(Help.this,
                android.R.layout.simple_list_item_1, aides);
        lvAides.setAdapter(adapterAides);

        final ArrayAdapter<String> adapterDemandes = new ArrayAdapter<String>(Help.this,
                android.R.layout.simple_list_item_1, demandesAide);
        lvDemandes.setAdapter(adapterDemandes);


        lvAides.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int position, long id) {

                Intent intent = new Intent(Help.this, Chat.class);
                intent.putExtra("name", aides[position]);
                startActivity(intent);
            }
        });

    }
}
