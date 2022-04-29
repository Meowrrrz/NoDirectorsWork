package com.example.nodirectorswork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBordingScreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_bording_screen1);
    }

    public void swipe(View view) {
        Intent intent1 = new Intent(this, OnBordingScreen2.class);
        startActivity(intent1);
    }
}