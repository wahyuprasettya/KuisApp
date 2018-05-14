package com.example.wahyuadjieprasetyo.iakkedua;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by wahyu adjie prasetyo on 11/5/2017.
 */

public class ListBuahAdapter extends BaseAdapter {
    Activity act;
    String [] nama_buah;
    int[] gambarbuah;
    public ListBuahAdapter(ListBuahActivity listBuahActivity, String[] nama_buah, int[] gambar_buah) {
       act=listBuahActivity;
        this.nama_buah=nama_buah;
        gambarbuah=gambar_buah;

    }
//menghitung jumlah array yang akan di tampilkan
    @Override
    public int getCount() {
        return gambarbuah.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    //menampilkan item yang ada
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //layanan dalam bentuk popup
        LayoutInflater inflater=(LayoutInflater)act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.tampilanlist,null);
        ImageView imgbuah=(ImageView)view.findViewById(R.id.imgbuah);
        TextView txtbuah=(TextView)view.findViewById(R.id.txtbuah);

        txtbuah.setText(nama_buah[i]);
        imgbuah.setImageResource(gambarbuah[i]);
        return view;
    }
}
