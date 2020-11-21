package com.example.recycleviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> personNames = new ArrayList<>(Arrays.asList("cupcake","froyo","gingerbread","honeycomb","marsh","ics","jellybean","kitkat"));
    ArrayList<String> lastNames = new ArrayList<>(Arrays.asList("1.1","1.2","1.3","1.4","1.5","1.6","1.7","1.8"));
    ArrayList<Integer> imageArray = new ArrayList<Integer>(Arrays.asList(R.drawable.cupcake,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,
            R.drawable.marsh,R.drawable.ics,R.drawable.jellybean,R.drawable.kitkat));
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerView);

      RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,personNames,lastNames, imageArray);
            recyclerView.setAdapter(customAdapter);

    }
}