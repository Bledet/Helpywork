package com.example.helpywork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Aider extends AppCompatActivity {

    private ImageButton enseignant_btn;
    private ImageButton etudiant_btn;
    private ImageButton selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribute);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.aider);

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
                        startActivity(new Intent(getApplicationContext(),
                                Aides.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.aider:
                        return true;
                }
                return false;
            }
        });

        enseignant_btn = (ImageButton) findViewById(R.id.teacherButton);
        etudiant_btn = (ImageButton) findViewById(R.id.studentButton);

        enseignant_btn.setTag("enseignant");
        etudiant_btn.setTag("etudiant");
    }

    public void onClick(View v) {
        selected = findViewById(v.getId());


        if (selected.getTag() == "enseignant") {
            Intent intent = new Intent(Aider.this, TypeAide.class);
            intent.putExtra("statut", "enseignant");
            startActivity(intent);
        } else if (selected.getTag() == "etudiant") {
            Intent intent = new Intent(Aider.this, TypeAide.class);
            intent.putExtra("statut", "etudiant");
            startActivity(intent);
        }
    }
}
