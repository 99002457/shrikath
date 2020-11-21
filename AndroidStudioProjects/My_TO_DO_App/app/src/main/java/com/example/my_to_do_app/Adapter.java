package com.example.my_to_do_app;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<String> TitleName;
    ArrayList<String> Date;


    Context context;

    public Adapter(Context context, ArrayList<String> title,    ArrayList<String> date){
        this.context = context;
        this.TitleName = title;
        this.Date= date;

    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_layout,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.name.setText(TitleName.get(position));
        holder.lastName.setText(Date.get(position));


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,TitleName.get(position)+" " +Date.get(position),Toast.LENGTH_LONG).show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return TitleName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView lastName;

        public MyViewHolder(View itemView){
            super(itemView);
            this.name = (TextView) itemView.findViewById(R.id.showtitle);
            this.lastName = (TextView) itemView.findViewById(R.id.showdate);

        }

    }

}
