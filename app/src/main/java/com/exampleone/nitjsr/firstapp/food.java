package com.exampleone.nitjsr.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class food extends AppCompatActivity implements View.OnClickListener {

    private CuboidButton inbutton,hallbutton,outbutton;

    String food[]={"inbutton","hallbutton","outbutton"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        inbutton=(CuboidButton)findViewById(R.id.inbutton);
        hallbutton=(CuboidButton)findViewById(R.id.hallbutton);
        outbutton=(CuboidButton)findViewById(R.id.outbutton);

        inbutton.setOnClickListener(this);
        hallbutton.setOnClickListener(this);
        outbutton.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.inbutton:
                Intent intent = new Intent(food.this,InsideCampus.class);
                startActivity(intent);
                break;

            case R.id.hallbutton:
                Intent intent1 = new Intent(food.this, hallFood.class);
                startActivity(intent1);
                break;

            case R.id.outbutton:
                Intent intent2 = new Intent(food.this,OutCampus.class);
                startActivity(intent2);
                break;
        }
    }
}
