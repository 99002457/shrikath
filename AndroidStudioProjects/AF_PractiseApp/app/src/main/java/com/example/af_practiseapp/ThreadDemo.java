package com.example.af_practiseapp;


public class ThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(2000);
                MainActivity.tv1.setText(String.valueOf(i));
            }
            catch (InterruptedException ie) {

            }
        }
    }

}