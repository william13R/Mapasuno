package com.example.mapasuno.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.mapasuno.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashMain2 extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main2);
        TimerTask time=(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(SplashMain2.this, SplashMain3.class);
                startActivity(intent);
                finish();

            }
        });

        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}


