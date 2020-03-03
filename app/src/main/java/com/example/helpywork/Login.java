package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private int NEW = 1;

    private EditText et_email;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_email = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
    }

    public void onClick(View v){
        Intent intent = new Intent(Login.this, Account.class);
        intent.putExtra("login", et_email.getText().toString());
        intent.putExtra("password", et_password.getText().toString());
        Login.this.startActivity(intent);
    }

    public void createAccount(View v){
        Intent intent = new Intent(Login.this, CreateAccount.class);
        Login.this.startActivity(intent);
    }
}
