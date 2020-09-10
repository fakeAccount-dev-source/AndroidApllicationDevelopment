package com.example.androidversions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyler;
String titles[],vname[],vyear[];
int img[];
MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyler=findViewById(R.id.recyclerview);
        titles=getResources().getStringArray(R.array.titles);
        vname=getResources().getStringArray(R.array.vname);
        vyear=getResources().getStringArray(R.array.vyear);
        img=new int[]{
                R.drawable.alpha,
                R.drawable.beta,
                R.drawable.cupcake,
                R.drawable.donut,
                R.drawable.eclair,
                R.drawable.froyo,
                R.drawable.gingerbread,
                R.drawable.honeycomb,
                R.drawable.icecream,
                R.drawable.jellybean,
                R.drawable.kitkat,
                R.drawable.lollipop,
                R.drawable.marshmallow,
                R.drawable.nougat,
                R.drawable.oreo,
                R.drawable.qandroid10,
                R.drawable.qandroid11,
        };
        adapter=new MyAdapter(this,titles,vname,vyear,img);
        recyler.setLayoutManager(new LinearLayoutManager(this));
        recyler.setAdapter(adapter);


        //LinearLayoutManager layoutManager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //recyler.setLayoutManager(layoutManager);


    }
}