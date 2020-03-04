package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {

    private EditText et_name;
    private EditText et_ville;
    private EditText et_email;
    private EditText et_password;
    private EditText et_repassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        et_name = (EditText) findViewById(R.id.et_name);
        et_ville = (EditText) findViewById(R.id.et_ville);
        et_email = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
        et_repassword = (EditText) findViewById(R.id.et_repassword);
    }

    public void onClick(View v){
        Intent intent = new Intent(CreateAccount.this, Account.class);
        intent.putExtra("login", et_name.getText().toString());
        if(et_password.getText().toString().matches(et_repassword.getText().toString())) {
            intent.putExtra("password", et_password.getText().toString());
        }
        startActivity(intent);
    }
}
