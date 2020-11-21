package com.example.myapplicatin;

public class Table {
    String arr[] = new String[5];
    public static synchronized void print(int x)
    {
        for(int i = 0; i <= 5; i++)
        {
            String str="";
            MainActivity.tv1.setText(String.valueOf(i*x));
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ie) {
            }
        }
    }
}


