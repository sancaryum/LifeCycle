package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        System.out.println("onStart");
        //Log.d("mesaj","started");
        super.onStart();
    }

    @Override
    protected void onStop() {
        System.out.println("onStop");
        //Log.d("mesaj","stopped");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy");
        //Log.d("mesaj","destroyed");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        System.out.println("onPause");
        //Log.d("mesaj","paused");
        super.onPause();
    }

    @Override
    protected void onResume() {
        System.out.println("onResume");
        //Log.d("mesaj","onresume");
        super.onResume();
    }
}
