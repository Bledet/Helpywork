package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

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
         String email =et_email.getText().toString();
         String pass =et_password.getText().toString();
         if(email.matches("toto@gmail.com")&& pass.matches("toto")){
            Intent intent = new Intent(Login.this, Account.class);
            intent.putExtra("login", et_email.getText().toString());
            intent.putExtra("password", et_password.getText().toString());
            Login.this.startActivity(intent);
         } else
         {
             Toast. makeText(getApplicationContext(), "Identifiants incorrects", Toast. LENGTH_SHORT).show();
         }
    }

    public void createAccount(View v){
        Intent intent = new Intent(Login.this, CreateAccount.class);
        Login.this.startActivity(intent);
    }
}
