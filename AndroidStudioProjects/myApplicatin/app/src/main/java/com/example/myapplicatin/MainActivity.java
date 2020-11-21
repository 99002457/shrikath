package com.example.myapplicatin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
public static TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = (Button)findViewById(R.id.button);
        EditText ed1=(EditText)findViewById(R.id.editview1);
        //EditText ed2=(EditText)findViewById(R.id.edittext2);
        tv1 = (TextView)findViewById(R.id.textView3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(ed1.getText().toString());
                /*
                int b = Integer.parseInt(ed2.getText().toString());
                int result = Calc.add(a,b);
                Toast.makeText(MainActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();

                 */
                Table tb1=new Table();
                tb1.print(a);
                Thread1 th1 = new Thread1();
                Thread2 th2 = new Thread2();
                th1.start();
                th2.start();
                //ThreadDemo th1 = new ThreadDemo();
                //th1.start();
            }
        });
    }
}
