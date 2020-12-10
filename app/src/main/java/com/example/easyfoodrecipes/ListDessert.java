package com.example.easyfoodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListDessert extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_dessert);

        Button btndessert1 = findViewById(R.id.btn_dessert1);
        btndessert1.setOnClickListener(this);
        Button btndessert2 = findViewById(R.id.btn_dessert2);
        btndessert2.setOnClickListener(this);
        Button btndessert3 = findViewById(R.id.btn_dessert3);
        btndessert3.setOnClickListener(this);
        Button btndessert4 = findViewById(R.id.btn_dessert4);
        btndessert4.setOnClickListener(this);
        Button btndessert5 = findViewById(R.id.btn_dessert5);
        btndessert5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dessert1:
                Intent move1 = new Intent(ListDessert.this, Pudding.class);
                startActivity(move1);
                break;
            case R.id.btn_dessert2:
                Intent move2 = new Intent(ListDessert.this, DessertBox.class);
                startActivity(move2);
                break;
            case R.id.btn_dessert3:
                Intent move3 = new Intent(ListDessert.this, Pancake.class);
                startActivity(move3);
                break;
            case R.id.btn_dessert4:
                Intent move4 = new Intent(ListDessert.this, KueCubit.class);
                startActivity(move4);
                break;
            case R.id.btn_dessert5:
                Intent move5 = new Intent(ListDessert.this, Tiramisu.class);
                startActivity(move5);
                break;

        }
    }
}