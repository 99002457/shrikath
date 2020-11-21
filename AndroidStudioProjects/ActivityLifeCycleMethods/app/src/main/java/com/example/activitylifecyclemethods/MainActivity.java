package com.example.activitylifecyclemethods;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = MainActivity.class.getSimpleName();

    protected void showLog(String msg){

        Log.d(HOME_ACTIVITY_TAG,msg);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog("Activity Created");
        //Log.d(HOME_ACTIVITY_TAG, text);
    }
    @Override
    protected void onRestart(){
        super.onRestart();//visible
        showLog( "Activity Restarted");
    }
    @Override
    protected void onStart(){
        super.onStart();//soon be visible
        showLog("Activity Started");
    }
    @Override
    protected void onResume(){
        super.onResume();//visible
        showLog( "Activity Resumed");
    }
    @Override
    protected void onPause(){
        super.onPause();//invisible
        showLog( "Activity paused");
    }
    @Override
    protected void onStop(){
        super.onStop();//visible
        showLog("Activity Stopped");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();//visible
        showLog( "Activity Destroyed");
    }
}