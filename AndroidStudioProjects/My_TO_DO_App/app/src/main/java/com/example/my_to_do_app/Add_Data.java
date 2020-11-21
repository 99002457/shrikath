package com.example.my_to_do_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class Add_Data extends AppCompatActivity {


    Button add;
    EditText Title;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__data);
        add = (Button)findViewById(R.id.add);
        Title = (EditText)findViewById(R.id.title);
        datePicker = (DatePicker)findViewById(R.id.datepicker);

       add.setOnClickListener(new View.OnClickListener() {
      @Override
       public void onClick(View v) {

    }
});

    }
}
/*<ImageView
                android:id="@+id/image"
                android:layout_width="82dp"
                android:layout_height="101dp"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent" />*/