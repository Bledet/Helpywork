package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.lang.reflect.Type;

public class Account extends AppCompatActivity {

    private TextView name;
    private TextView pw;

    private int CREATE = 1;
    private ImageButton selected;

    private ImageButton teacher_btn;
    private ImageButton student_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        teacher_btn = (ImageButton) findViewById(R.id.teacherButton);
        student_btn = (ImageButton) findViewById(R.id.studentButton);

        teacher_btn.setTag("enseignant");
        student_btn.setTag("etudiant");

        name = (TextView) findViewById(R.id.name);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("login"));
    }

    public void onClick(View v){
        selected = findViewById(v.getId());


        if(selected.getTag() == "enseignant"){
            Intent intent = new Intent(Account.this, TypeAide.class);
            intent.putExtra("statut", "enseignant");
            startActivity(intent);
        } else if ( selected.getTag() == "etudiant"){
            Intent intent = new Intent(Account.this, TypeAide.class);
            intent.putExtra("statut", "etudiant");
            startActivity(intent);
        }

    }
}