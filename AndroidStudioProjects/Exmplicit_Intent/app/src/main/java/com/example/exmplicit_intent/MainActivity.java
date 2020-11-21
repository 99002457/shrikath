package com.example.exmplicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttton = (Button) findViewById(R.id.button);
        final EditText editext = (EditText) findViewById(R.id.editext);
buttton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String url = editext.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
});
    }


}