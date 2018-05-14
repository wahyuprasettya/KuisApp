package com.example.wahyuadjieprasetyo.proyek_indonesia_kejar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_quiz extends AppCompatActivity {

    EditText username;
    EditText pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_quiz);
        username=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.button);
        loginCoy();

    }

    public void loginCoy(){
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("admin")&& pass.getText().toString().equals("admin")){
                    Intent next = new Intent(login_quiz.this, halaman_utama.class);
                    startActivity(next);
                    finish();

                }
                else (Toast.makeText(login_quiz.this,"Login nya username: admin password: admin",Toast.LENGTH_LONG)).show();
            }

        });

    }
}