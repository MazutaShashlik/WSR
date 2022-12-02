package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private Button btjoin;
    private Button btnhod;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singin);

        btjoin = (Button) findViewById(R.id.bt2);
        btnhod = (Button) findViewById(R.id.bt1);

        btnhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, pusto.class);
                setContentView(R.layout.activity_main);
            }
        });

        btjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, vhodac.class);
                setContentView(R.layout.signup);
            }
        });


    }
}