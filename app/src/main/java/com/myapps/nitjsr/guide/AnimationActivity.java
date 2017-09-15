package com.myapps.nitjsr.guide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.View;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout animatelayout;
    private TextView placeText;
    private Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        placeText = (TextView) findViewById(R.id.placeText);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
         switch(view.getId()) {

             case R.id.b1:
                 Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/tap/portfolio/"));
                 startActivity(intent1);
                 break;

             case R.id.b2:
                 Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/tap/training.php"));
                 startActivity(intent2);
                 break;

             case R.id.b3:
                 Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/tap/companies.php"));
                 startActivity(intent3);
                 break;

             case R.id.b4:
                 Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/tap/stats.php"));
                 startActivity(intent4);
                 break;

             case R.id.b5:
                 Intent intent5 = new Intent(AnimationActivity.this,firstactivity.class);
                 startActivity(intent5);
                 break;

        }
    }
}


























