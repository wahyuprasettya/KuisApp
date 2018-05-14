package com.example.wahyuadjieprasetyo.iakkedua;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //untuk melakukan delay atau penundaan ke activity yang lainnya
        //activity yang lainnya
        Handler delay= new Handler();
        delay.postDelayed(new Runnable() {
            @Override
            public void run() {
                //akses class yang lain atau pindah activity
                //menggunakan intent
                startActivity(new Intent(SplashScreenActivity.this,MainActivity.class));
                finish();
            }
        },5000);
    }
}
