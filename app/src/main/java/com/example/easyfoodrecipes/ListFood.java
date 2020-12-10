package com.example.easyfoodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListFood extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);

        Button btnFood1 = findViewById(R.id.btn_food1);
        btnFood1.setOnClickListener(this);

        Button btnFood2 = findViewById(R.id.btn_food2);
        btnFood2.setOnClickListener(this);

        Button btnFood3 = findViewById(R.id.btn_food3);
        btnFood3.setOnClickListener(this);

        Button btnFood4 = findViewById(R.id.btn_food4);
        btnFood4.setOnClickListener(this);

        Button btnFood5 = findViewById(R.id.btn_food5);
        btnFood5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_food1:
                Intent moveFood1 = new Intent(ListFood.this, NasiGoreng.class);
                startActivity(moveFood1);
                break;

            case R.id.btn_food2:
                Intent moveFood2 = new Intent(ListFood.this, AyamGeprek.class);
                startActivity(moveFood2);
                break;


            case R.id.btn_food3:
                Intent moveFood3 = new Intent(ListFood.this, Seblak.class);
                startActivity(moveFood3);
                break;

            case R.id.btn_food4:
                Intent moveFood4 = new Intent(ListFood.this, MieGoreng.class);
                startActivity(moveFood4);
                break;


            case R.id.btn_food5:
                Intent moveFood5 = new Intent(ListFood.this, TahuGejrot.class);
                startActivity(moveFood5);
                break;

        }
    }
}