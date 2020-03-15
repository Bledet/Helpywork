package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class create_account2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account2);

    }

    public void onClick(View v){
        Intent intent1 = getIntent();
        String name = intent1.getStringExtra("login");
        String pass = intent1.getStringExtra("password");

        Intent intent = new Intent(create_account2.this, Account.class);
        intent.putExtra("login", name);
        intent.putExtra("password", pass);

        startActivity(intent);
    }
}
