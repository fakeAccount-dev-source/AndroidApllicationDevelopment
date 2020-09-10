package com.example.androidversions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
Context ctx;
String titles[],vname[],vyear[];
int image[];

    public MyAdapter(Context ctx, String[] titles,String[] vname,String[] vyear, int[] image) {
        this.ctx = ctx;
        this.titles = titles;
        this.vname = vname;
        this.vyear = vyear;
        this.image = image;
    }
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.every_row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.txt1.setText(titles[position]);
        holder.txt2.setText(vname[position]);
        holder.txt3.setText(vyear[position]);
        holder.img.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt1,txt2,txt3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.vimage);
            txt1=itemView.findViewById(R.id.vname);
            txt2=itemView.findViewById(R.id.vnum);
            txt3=itemView.findViewById(R.id.vyear);
        }
    }
}
