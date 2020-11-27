package com.example.mapasuno;

import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // verificar si los servicios de google np funcionan bien
        int status = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
        if (status == ConnectionResult.SUCCESS) {
            // Obtain the SupportMapFragment and get notified when the map is ready to be used.
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        } else {
            Dialog dialog=GooglePlayServicesUtil.getErrorDialog(status,(Activity)getApplicationContext(),10);
            dialog.show();
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //para seleccionar el tipo de mapa que queremos
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //habilitar mapas ya que estan desabilitadas
        UiSettings uiSettings =mMap.getUiSettings();
        uiSettings.setZoomControlsEnabled(true);
        //marcar posicion
        // Add a marker in Sydney and move the camera

        LatLng peru = new LatLng(-12.6241496, -72.6925356);
        //titulo del marcador
        mMap.addMarker(new MarkerOptions().position(peru).title("Peru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(peru));
        //colocar Zoom
        float zooevel =16;
    }
}
