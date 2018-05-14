package com.example.wahyuadjieprasetyo.iakkedua;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Selamat datang",Toast.LENGTH_SHORT).show();

    }


    //fugsi onbaccres saat tombol back di pilih
    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertkeluar=new AlertDialog .Builder(this);
        alertkeluar.setIcon(R.mipmap.ic_launcher);
        alertkeluar.setTitle("informasi keluar");
        alertkeluar.setMessage("do you want to exit");
        alertkeluar.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               //keluar aplikasi
                System.exit(0);
                moveTaskToBack(true);
            }
        });

        alertkeluar.show();

    }

    public void onlistbuah(View view) {
        startActivity(new Intent(MainActivity.this,ListBuahActivity.class));
    }
}
