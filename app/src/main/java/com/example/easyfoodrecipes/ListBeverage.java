package com.example.easyfoodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListBeverage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_beverage);

        Button btnFood1 = findViewById(R.id.btn_bev1);
        btnFood1.setOnClickListener(this);

        Button btnFood2 = findViewById(R.id.btn_bev2);
        btnFood2.setOnClickListener(this);

        Button btnFood3 = findViewById(R.id.btn_bev3);
        btnFood3.setOnClickListener(this);

        Button btnFood4 = findViewById(R.id.btn_bev4);
        btnFood4.setOnClickListener(this);

        Button btnFood5 = findViewById(R.id.btn_bev5);
        btnFood5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bev1:
                Intent move1 = new Intent(ListBeverage.this, EsCampur.class);
                startActivity(move1);
                break;

            case R.id.btn_bev2:
                Intent move2 = new Intent(ListBeverage.this, BobaThai.class);
                startActivity(move2);
                break;


            case R.id.btn_bev3:
                Intent move3 = new Intent(ListBeverage.this, DalgonaCoffee.class);
                startActivity(move3);
                break;

            case R.id.btn_bev4:
                Intent move4 = new Intent(ListBeverage.this, EsKopi.class);
                startActivity(move4);
                break;


            case R.id.btn_bev5:
                Intent move5 = new Intent(ListBeverage.this, JusAlpukat.class);
                startActivity(move5);
                break;

        }
    }
}