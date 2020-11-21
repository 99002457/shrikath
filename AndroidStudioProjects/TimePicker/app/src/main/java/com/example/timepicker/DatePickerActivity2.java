package com.example.timepicker;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class DatePickerActivity2 extends AppCompatActivity {

    DatePicker datePicker;
    TextView date;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker2);
        Intent intent = getIntent();
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        date = (TextView) findViewById(R.id.textView);



        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(getApplicationContext(), year+"-"+monthOfYear+"-"+dayOfMonth, Toast.LENGTH_SHORT).show();
                date.setText("Time is :: "+year+"-"+monthOfYear+"-"+dayOfMonth);
            }
        });
    }
}