package com.example.farmerscommoditymarketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Portfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Button button_Watchlist = findViewById(R.id.Watchlist);
        button_Watchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Portfolio.this, Watchlist.class);
                startActivity(intent);
            }
        });
        Button button_Orders = findViewById(R.id.Orders);
        button_Orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Portfolio.this, Orders.class);
                startActivity(intent);
            }
        });
        Button button_Profile = findViewById(R.id.Profile);
        button_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Portfolio.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}