package com.example.mapasuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mapasuno.MarravillaAntigua.Menumarravillaantigua;
import com.example.mapasuno.Menusitiosturisticos.Menusitioturistico;
import com.example.mapasuno.Splash.SplashMarravilla1;

public class MainActivity extends AppCompatActivity {
    Button irmapa,irmarravilla,irmarravillaantigua,irturistico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        irmapa= findViewById(R.id.btnmapa);
        irmarravilla=findViewById(R.id.btnmarravillas);
        irmarravillaantigua=findViewById(R.id.btnmarravillasantiguas);
        irturistico=findViewById(R.id.btnsitiosturisticos);
        irmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });


        irmarravilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, SplashMarravilla1.class);
                startActivity(intent);
            }
        });

        irmarravillaantigua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Menumarravillaantigua.class);
                startActivity(intent);
            }
        });
        irturistico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, Menusitioturistico.class);
                startActivity(intent);
            }
        });


    }
}
