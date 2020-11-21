package com.example.my_to_do_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


   public ArrayList<String> titleName = new ArrayList<>();
    ArrayList<String> date = new ArrayList<>();
    RecyclerView recyclerView;
    Button add ,gotoadd;
    EditText Title;
    DatePicker datePicker;

    TextView showTitle, showDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Title = (EditText)findViewById(R.id.title);
        //String s = " "+Title.getText().toString();
        if(titleName.isEmpty()){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.empty_layout);
            gotoadd = (Button)findViewById(R.id.gotoadd);
            gotoadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(),Add_Data.class);
                    startActivity(intent);
                }
            });


        }
        else {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

            RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(linearLayoutManager);


            add = (Button)findViewById(R.id.add);

            datePicker = (DatePicker)findViewById(R.id.datepicker);

            showTitle = (TextView)findViewById(R.id.showtitle);
            showDate = (TextView)findViewById(R.id.showdate);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    titleName.add(Title.getText().toString());
                    date.add(datePicker.getDayOfMonth()+"/"+datePicker.getMonth()+"/"+datePicker.getYear());

                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
            });

            Adapter customAdapter = new Adapter(MainActivity.this, titleName, date);
            recyclerView.setAdapter(customAdapter);
        }




    }
}