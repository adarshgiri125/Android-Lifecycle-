package com.company.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    // This is the sequence of the android lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate() method is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() method is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() method is called", Toast.LENGTH_LONG).show();
    }
 
    @Override
    protected void onRestart() {
        // onRestart method is called when app is previously not in the
        // foreground but in the background in the stack memory
        // when app is opened it restart then start and resume then
        super.onRestart();
        Toast.makeText(this, "onRestart() method is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() method is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        // when app is gone to the background then stop method is called
        super.onStop();
        Toast.makeText(this, "onStop() method is called", Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onDestroy() { // onDestroy method is call when app is closed and remove
        // from the stack memory of OS.
        super.onDestroy();
        Toast.makeText(this, "onDestro() method is called", Toast.LENGTH_LONG).show();
    }
}