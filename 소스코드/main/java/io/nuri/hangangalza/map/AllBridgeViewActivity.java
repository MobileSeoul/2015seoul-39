package io.nuri.hangangalza.map;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import io.nuri.hangangalza.R;
import io.nuri.hangangalza.data.BridgeData;
import io.nuri.hangangalza.data.BridgeInfoData;
import io.nuri.hangangalza.data.BridgeInfoLoadData;
import io.nuri.hangangalza.data.BridgeLoadData;
import io.nuri.hangangalza.main.MainActivity;

/**
 * Created by chayongbin on 15. 10. 31..
 */
public class AllBridgeViewActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private double lat;
    private double lng;
    private String name;
    private Context context;
    private BridgeLoadData bridgeLoadData;
    private BridgeInfoLoadData bridgeInfoLoadData;
    private ArrayList<BridgeData> bridgeData = new ArrayList<BridgeData>();
    private ArrayList<BridgeInfoData> bridgeInfoData = new ArrayList<BridgeInfoData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        bridgeLoadData = new BridgeLoadData(this);
        bridgeInfoLoadData = new BridgeInfoLoadData(this);
        bridgeData = bridgeLoadData.getJsonData();
        bridgeInfoData = bridgeInfoLoadData.getJsonData();

        context = this;

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }



    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        // Add a marker in Sydney and move the camera

//        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom
//                (new LatLng(lat, lng), 12.0f));

        for (int i = 23; i >= 0 ; i--){

            Double lat = Double.valueOf(bridgeInfoData.get(i).getBridge_lat());
            Double lng = Double.valueOf(bridgeInfoData.get(i).getBridge_lng());

            LatLng sydney = new LatLng(lat,lng);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom
                    (sydney, 12.0f));
            mMap.getUiSettings().setZoomControlsEnabled(true);

            mMap.addMarker(new MarkerOptions().position(sydney).title(String.valueOf(i)).
                    icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

            final int finalI1 = 3;
            mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

                @Override
                public View getInfoWindow(Marker marker) {

                    int idx = Integer.parseInt(marker.getTitle());
                    View v = getLayoutInflater().inflate(R.layout.custom_infowindow, null);
                    TextView textView = (TextView) v.findViewById(R.id.textView12);
                    textView.setText("  " + bridgeData.get(idx).getBridge_kr() + "  ");

                    return v;
                }

                @Override
                public View getInfoContents(Marker marker) {
                    return null;
                }
            });
            mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(Marker marker) {
                    String idx = marker.getTitle();
                    Intent intent = new Intent(context, MainActivity.class);
                    intent.putExtra("id", idx);
                    context.startActivity(intent);
                    finish();

                }
            });

        }

    }
}