package com.example.mapasuno.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.mapasuno.MainActivity;
import com.example.mapasuno.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashMain3 extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY =2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main3);
        TimerTask time=(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(SplashMain3.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        Timer timer = new Timer();
        timer.schedule(time,SPLASH_SCREEN_DELAY);
    }
}

