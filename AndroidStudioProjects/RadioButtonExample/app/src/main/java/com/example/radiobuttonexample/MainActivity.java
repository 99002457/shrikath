package com.example.radiobuttonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioButton option1,option2,option3,option4;

    Button submit;

    String storeSelectedOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        option1 = (RadioButton) findViewById(R.id.radioButton1) ;
        option2 = (RadioButton) findViewById(R.id.radioButton2) ;
        option3 = (RadioButton) findViewById(R.id.radioButton3) ;
        option4 = (RadioButton) findViewById(R.id.radioButton4) ;
        submit = (Button) findViewById(R.id.submit) ;

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option1.isChecked())
                {
                    storeSelectedOption = option1.getText().toString();
                }
                if(option2.isChecked())
                {
                    storeSelectedOption = option2.getText().toString();
                }
                if(option3.isChecked())
                {
                    storeSelectedOption = option3.getText().toString();
                }
                if(option4.isChecked())
                {
                    storeSelectedOption = option4.getText().toString();
                }
                Toast.makeText(getApplicationContext(),storeSelectedOption,Toast.LENGTH_LONG).show();
            }
        });



    }
}