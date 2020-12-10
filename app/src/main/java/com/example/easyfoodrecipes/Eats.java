package com.example.easyfoodrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eats extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eats);

        Button btnMoveActivity = findViewById(R.id.btn_main_course);
        btnMoveActivity.setOnClickListener(this);
        Button btnMove2 = findViewById(R.id.btn_move2);
        btnMove2.setOnClickListener(this);
        Button btnMove3 = findViewById(R.id.btn_move3);
        btnMove3.setOnClickListener(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Easy Food Recipes");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_course:
                Intent moveIntent = new Intent(Eats.this, ListFood.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move2:
                Intent move2 = new Intent(Eats.this, ListDessert.class);
                startActivity(move2);
                break;

            case R.id.btn_move3:
                Intent move3 = new Intent(Eats.this, ListBeverage.class);
                startActivity(move3);
                break;
        }
    }
}