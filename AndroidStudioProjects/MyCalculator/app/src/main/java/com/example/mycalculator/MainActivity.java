package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonDot,buttonAdd,buttonSub,buttonMul,buttonDiv,buttonEqu,buttonCancel;
    EditText editText ;
    float oneValue , twoValue;
    boolean add,sub,mul,div,eql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonEqu = (Button) findViewById(R.id.buttoneql);
        buttonCancel = (Button) findViewById(R.id.buttonC);
        editText = (EditText) findViewById(R.id.show1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"5");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"8");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"7");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+"9");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneValue = Float.parseFloat(editText.getText().toString());
                add = true;
                editText.setText(editText.getText()+"9");
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneValue = Float.parseFloat(editText.getText().toString());
                sub = true;
                editText.setText("");
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneValue = Float.parseFloat(editText.getText().toString());
                div = true;
                editText.setText("");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneValue = Float.parseFloat(editText.getText().toString());
                mul = true;
                editText.setText("");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eql == true){
                    editText.setText(null);
                    eql = false;
                }
                editText.setText(editText.getText()+".");
            }
        });
        buttonEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoValue = Float.parseFloat(editText.getText().toString());
                if(add == true){
                    editText.setText((oneValue+twoValue)+"");
                    add = false;


                }
                if(sub == true){
                    editText.setText((oneValue-twoValue)+"");
                    sub = false;

                }
                if(mul == true){
                    editText.setText((oneValue*twoValue)+"");
                    mul = false;

                }
                if(div == true){
                    editText.setText((oneValue/twoValue)+"");
                    div = false;

                }
                eql = true;

            }
        });
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);

            }
        });


    }
}