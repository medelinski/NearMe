package com.example.mirko.nearme;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mall extends AppCompatActivity {

    private String [] spots;
    private Integer [] img;
    private Button Direction;
    private LocationManager locationManager;
    private LocationListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);

        Direction = (Button)findViewById(R.id.btnDirections4);

        final ListView lv = (ListView) findViewById(R.id.lstMall);
        spots = new String[]{"Moxies","Boston Pizza", "Kelseys", "Omega","Mels Diner","Chicagos","The Berlin","Charcoal Steak house"};
        final List<String> MyList1 = new ArrayList<String>(Arrays.asList(spots));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MyList1);
        lv.setAdapter(arrayAdapter);

        Direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri location = Uri.parse("geo:43.416058, -80.514504");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);

            }
        });
    }
}
