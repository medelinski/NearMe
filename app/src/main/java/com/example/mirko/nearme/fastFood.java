package com.example.mirko.nearme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.location.LocationListener;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fastFood extends AppCompatActivity {

    private Button Direction3;
    private String [] spots;
    private LocationManager locationManager;
    private LocationListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        Direction3 = (Button)findViewById(R.id.btnDirections3);

        final ListView lv = (ListView) findViewById(R.id.lstFastFood);
        spots = new String[]{"A&W","KFC", "Taco Bell", "Tim Hortons","Subway","Popeyes","Pizza Hut","Pizza Roma"};
        final List<String> MyList1 = new ArrayList<String>(Arrays.asList(spots));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, MyList1);
        lv.setAdapter(arrayAdapter);

        Direction3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri location = Uri.parse("geo:43.416058, -80.514504");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                startActivity(mapIntent);

            }
        });
    }
}
