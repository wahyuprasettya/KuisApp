package com.example.wahyuadjieprasetyo.proyek_indonesia_kejar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler delay= new Handler();
        delay.postDelayed(new Runnable() {
            @Override
            public void run() {
                //akses class yang lain atau pindah activity
                //menggunakan intent
                startActivity(new Intent(splash_screen.this,login_quiz.class));
                finish();
            }
        },5000);


    }
}
