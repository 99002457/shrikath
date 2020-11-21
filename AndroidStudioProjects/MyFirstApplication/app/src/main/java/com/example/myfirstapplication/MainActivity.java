package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapplication";

    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

            public void onClick(View view) {
                Intent intent = new Intent(this, MainActivity2.class);
                EditText editText = (EditText) findViewById(R.id.editText1);
                String message = editText.getText().toString();
               intent.putExtra(EXTRA_MESSAGE,message);
                startActivity(intent);
            }
}