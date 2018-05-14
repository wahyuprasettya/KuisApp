package com.example.wahyuadjieprasetyo.iakkedua;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class DetailBuahActivity extends AppCompatActivity {
ImageView imgbuah;
    TextView txtnama,txtharga,txtdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        imgbuah=(ImageView) findViewById(R.id.imgbuah);
        txtnama=(TextView) findViewById(R.id.txtbuah);
        txtharga=(TextView) findViewById(R.id.txthargabuah);

        //untuk menangkap data
        Intent tangkapdata=getIntent();
        txtnama.setText(tangkapdata.getStringExtra("nB"));
        txtharga.setText(tangkapdata.getStringExtra("hB"));
        imgbuah.setImageResource(
                tangkapdata.getIntExtra("gB",0)
        );

        MediaPlayer mp=new MediaPlayer();
        Uri Lokasi = Uri.parse("android.resource://"
        +getPackageName()+"/"+tangkapdata.getIntExtra("sB",0));
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try{
                mp.setDataSource(DetailBuahActivity.this,Lokasi );
                mp.prepare();
           mp.start();

        }
        catch (IOException e){
            e.printStackTrace();
            FloatingActionButton fab =(FloatingActionButton) findViewById(R.id.fab);
        }



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
