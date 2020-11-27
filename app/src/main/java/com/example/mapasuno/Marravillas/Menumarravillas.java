package com.example.mapasuno.Marravillas;

import android.content.Intent;
import android.os.Bundle;

import com.example.mapasuno.MainActivity;
import com.example.mapasuno.MapsActivity;
import com.example.mapasuno.MapsMarravilla;
import com.example.mapasuno.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Menumarravillas extends AppCompatActivity {
Button ircristo,irmurrlla,irmapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumarravillas);
        ircristo=findViewById(R.id.btnbrasil);
        irmurrlla=findViewById(R.id.btnchina);
        irmapa= findViewById(R.id.btnmapas);

        irmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menumarravillas.this, MapsMarravilla.class);
                startActivity(intent);
            }
        });



        ircristo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menumarravillas.this, Cristos.class);
                startActivity(intent);
            }
        });


        irmurrlla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Menumarravillas.this, Murralla.class);
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
