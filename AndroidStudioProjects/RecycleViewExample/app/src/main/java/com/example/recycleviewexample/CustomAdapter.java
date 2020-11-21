package com.example.recycleviewexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<String> personName;
    ArrayList<String> LastName;
    ArrayList<Integer> Image;

    Context context;

    public CustomAdapter(Context context, ArrayList<String> personName,    ArrayList<String> LastName,ArrayList<Integer> Image){
                this.context = context;
                this.personName = personName;
                this.LastName= LastName;
                this.Image = Image;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayoutnew,parent,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.name.setText(personName.get(position));
        holder.lastName.setText(LastName.get(position));
        holder.image.setImageResource(Image.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,personName.get(position)+" " +LastName.get(position),Toast.LENGTH_LONG).show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return personName.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView lastName;
        ImageView image;
        public MyViewHolder(View itemView){
            super(itemView);
            this.name = (TextView) itemView.findViewById(R.id.name);
            this.lastName = (TextView) itemView.findViewById(R.id.version);
            this.image = (ImageView) itemView.findViewById(R.id.image);
        }

    }

}
