package com.example.wahyuadjieprasetyo.iakkedua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class ListBuahActivity extends AppCompatActivity {
//deklarasi variabel secara global
    ListView listbuah;
    //data array
    String nama_buah[]={"apel"
            ,"alpukat"
            ,"jambu"
            ,"manggis"
            ,"ceri"
            ,"durian"
            ,"strawberry"};

    int gambar_buah[]={R.drawable.apel
            ,R.drawable.alpukat
            ,R.drawable.jambuair
            ,R.drawable.manggis
            ,R.drawable.ceri
            ,R.drawable.durian
            ,R.drawable.strawberry};

    int suara_buah[]={R.raw.apel
            ,R.raw.alpukat
            ,R.raw.jambuair
            ,R.raw.manggis
            ,R.raw.ceri
            ,R.raw.durian
            ,R.raw.strawberry};


    String harga_buah[]={"apel"
            ,"alpukat"
            ,"jambu"
            ,"manggis"
            ,"ceri"
            ,"durian"
            ,"strawberry"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_buah);
        //inisialisasi atau link
        listbuah=(ListView)findViewById(R.id.listbuah);
        ListBuahAdapter buahAdapter=new ListBuahAdapter(
                ListBuahActivity.this,nama_buah,gambar_buah);
        //isi view dengan data adapter
        listbuah.setAdapter(buahAdapter);
        //aksi
        listbuah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//ngirim data dengan intent
                Intent kirimdata = new Intent(ListBuahActivity.this,DetailBuahActivity.class);
                kirimdata.putExtra("nB",nama_buah[i]);
                kirimdata.putExtra("gB",gambar_buah[i]);
                kirimdata.putExtra("sB",suara_buah[i]);
                kirimdata.putExtra("hB",harga_buah[i]);
                startActivity(kirimdata);


            }
        });
    }
}
