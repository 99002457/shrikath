package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
           TimePicker timePicker;
           TextView time;
           Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        time = (TextView) findViewById(R.id.time);
        button = (Button) findViewById(R.id.button);

        timePicker.setIs24HourView(false);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getApplicationContext(), hourOfDay+"  "+minute, Toast.LENGTH_SHORT).show();
                time.setText("Time is :: "+hourOfDay+" : "+minute);
            }
        });

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DatePickerActivity2.class);
                startActivity(intent);
            }
        });

    }
}







