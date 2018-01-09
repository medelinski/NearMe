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

public class Bar extends AppCompatActivity {

    private String[] spots;
    private Button Direction;
    private LocationManager locationManager;
    private LocationListener listener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);

        Direction = (Button) findViewById(R.id.btnDirections1);

        final ListView lv = (ListView) findViewById(R.id.lstBar);
        spots = new String[]{"Chicagos", "McCabes", "Pub on King", "Stampede", "Chainsaw", "Stark & Perris", "Hacks", "Beertown"};
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