package com.example.app_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class APP_2 extends AppCompatActivity {
    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_2);
        button = (Button) findViewById(R.id.b1);
        button1 = (Button) findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }
    public void openActivity3(){
        Intent intent = new Intent(getApplicationContext(),App_3.class);
        startActivity(intent);
    }
    public void openActivity4(){
        Intent intent = new Intent(getApplicationContext(),APP_4.class);
        startActivity(intent);
    }
}
