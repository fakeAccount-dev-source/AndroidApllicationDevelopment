package com.example.myrecyclerview;

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
    String titles[];
    int image[];

    public MyAdapter(Context ctx, String[] titles, int[] image) {
        this.ctx = ctx;
        this.titles = titles;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(ctx).inflate(R.layout.every_row_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txt.setText(titles[position]);
        holder.img.setImageResource(image[position]);

    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            img=itemView.findViewById(R.id.iv);
            txt=itemView.findViewById(R.id.tv);
        }
    }
}
