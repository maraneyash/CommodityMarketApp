package com.example.farmerscommoditymarketapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button button_Watchlist = findViewById(R.id.Watchlist);
        button_Watchlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Watchlist.class);
                startActivity(intent);
            }
        });
        Button button_Portfolio = findViewById(R.id.Portfolio);
        button_Portfolio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Portfolio.class);
                startActivity(intent);
            }
        });
        Button button_Orders = findViewById(R.id.Orders);
        button_Orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Orders.class);
                startActivity(intent);
            }
        });
        Button button_Login = findViewById(R.id.BTLogin);
        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Login.class);
                startActivity(intent);
            }
        });
        Button button_Register = findViewById(R.id.BTRegister);
        button_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Register.class);
                startActivity(intent);
            }
        });
    }
}