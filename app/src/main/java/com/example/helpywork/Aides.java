package com.example.helpywork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Aides extends AppCompatActivity {

    private ListView lvAides;
    private ListView lvDemandes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contributions);

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
    }
}
