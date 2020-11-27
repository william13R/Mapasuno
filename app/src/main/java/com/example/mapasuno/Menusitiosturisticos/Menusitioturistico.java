package com.example.mapasuno.Menusitiosturisticos;

import android.content.Intent;
import android.os.Bundle;

import com.example.mapasuno.MainActivity;
import com.example.mapasuno.MapsActivity;
import com.example.mapasuno.Mapsturisticos;
import com.example.mapasuno.R;
import com.example.mapasuno.Splash.SplashMarravilla1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Menusitioturistico extends AppCompatActivity {
    Button ircusco,irpuno,irmapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menusitioturistico);
        ircusco=findViewById(R.id.btncusco);
        irpuno=findViewById(R.id.btnpuno);
        irmapa= findViewById(R.id.btnmapa);
        irmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menusitioturistico.this, Mapsturisticos.class);
                startActivity(intent);
            }
        });



        ircusco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menusitioturistico.this, color.class);
                startActivity(intent);
            }
        });


        irpuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menusitioturistico.this, titicaca.class);
                startActivity(intent);
            }
        });










        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
