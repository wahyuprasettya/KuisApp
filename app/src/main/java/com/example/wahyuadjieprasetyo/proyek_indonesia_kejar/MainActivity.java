package com.example.wahyuadjieprasetyo.proyek_indonesia_kejar;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(.layout.activity_main);

    }

    public void onBackPressed() {
        AlertDialog.Builder alertkeluar=new AlertDialog .Builder(this);
        alertkeluar.setIcon(.mipmap.ic_launcher);
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
}

