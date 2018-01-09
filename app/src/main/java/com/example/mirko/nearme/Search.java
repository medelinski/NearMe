package com.example.mirko.nearme;

import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    private Button Restaurant;
    private Button FastFood;
    private Button Mall;
    private Button Bar;
    private Button Direction;
    private Button Other;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Restaurant = (Button)findViewById(R.id.btnRestaurant);
        FastFood = (Button)findViewById(R.id.btnFastFood);
        Mall = (Button)findViewById(R.id.btnMall);
        Bar = (Button)findViewById(R.id.btnBar);
        Other = (Button)findViewById(R.id.btnOther);


        Restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Search.this,Restaurant.class);
                startActivity(intent);
            }
        });

        Bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Search.this,Bar.class);
                startActivity(intent);
            }
        });

        FastFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Search.this,fastFood.class);
                startActivity(intent);
            }
        });
        Mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Search.this,Mall.class);
                startActivity(intent);
            }
        });
        Other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.yelp.ca/kitchener-on-ca");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });


    }
}
