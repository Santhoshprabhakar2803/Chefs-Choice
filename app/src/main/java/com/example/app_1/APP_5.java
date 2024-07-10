package com.example.app_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class APP_5 extends AppCompatActivity {
    ImageButton ib1,ib4,ib6,ib2,ib5,ib3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_5);
        ib1 = (ImageButton) findViewById(R.id.ib1); //veg
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),APP_6.class);
                startActivity(intent);
            }
        });
        ib4 = (ImageButton)findViewById(R.id.ib4); //non veg
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),APP_9NV.class);
                startActivity(intent1);
            }
        });

        ib6 = (ImageButton)findViewById(R.id.ib6); // juice
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),APP_10juice.class);
                startActivity(intent2);
            }
        });

        ib2 = (ImageButton)findViewById(R.id.ib2); //fast food
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),APP_11FASTFOOD.class);
                startActivity(intent3);
            }
        });

        ib5 = (ImageButton)findViewById(R.id.ib5); //ice
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(),APP_12ICE.class);
                startActivity(intent4);
            }
        });

        ib3 = (ImageButton)findViewById(R.id.ib3); // cake
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(),APP_13CAKE.class);
                startActivity(intent5);
            }
        });

        Snackbar.make(findViewById(android.R.id.content), "You can order individual categories due to hygiene purposes", Snackbar.LENGTH_LONG).show();


    }
}
