package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner fromSpinner, toSpinner;
    EditText fromEditText, toEditText;
    Button Convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fromEditText = (EditText) findViewById(R.id.editText_from);
        toEditText = (EditText) findViewById(R.id.editText_to);
        Convert = (Button) findViewById(R.id.button_convert);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        fromSpinner = (Spinner) findViewById(R.id.spinner_from);
        toSpinner = (Spinner) findViewById(R.id.spinner_to);

        fromSpinner.setAdapter(adapter);
        toSpinner.setAdapter(adapter);

        Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fromSpinner = (Spinner) findViewById(R.id.spinner_from);
                toSpinner = (Spinner) findViewById(R.id.spinner_to);
                fromEditText = (EditText) findViewById(R.id.editText_from);
                toEditText = (EditText) findViewById(R.id.editText_to);

                // Get the string from the Spinners and number from the EditText
                String fromString = (String) fromSpinner.getSelectedItem();
                String toString = (String) toSpinner.getSelectedItem();

                if(fromEditText.getText().toString().equals("")) {
                    fromEditText.setText("Pls Enter text");

                }
                else {
                    double input = Double.valueOf(fromEditText.getText().toString());
                    Converter.Unit fromUnit = Converter.Unit.fromString(fromString);
                    Converter.Unit toUnit = Converter.Unit.fromString(toString);

                    // Create a converter object and convert!
                    Converter converter = new Converter(fromUnit, toUnit);
                    double result = converter.convert(input);
                    toEditText.setText(String.valueOf(result));
                }
                // Convert the strings to something in our Unit enu,

            }
        });


    }
}