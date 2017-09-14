package com.exampleone.nitjsr.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Admissions extends AppCompatActivity implements View.OnClickListener {

    private  TextView textView;
    private Button button1, button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions);

        textView=(TextView) findViewById(R.id.textView);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button1:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://josaa.nic.in/webinfocms/public/view.aspx?page=46") );
                startActivity(intent1);
                break;

            case R.id.button6:
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dasanit.org/dasa2017/") );
                startActivity(intent6);
                break;

            case R.id.button2:
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ccmt.nic.in/webinfo/Public/Home.aspx") );
                startActivity(intent2);
                break;

            case R.id.button3:
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nimcet2017.nitdgp.ac.in/home/index.php") );
                startActivity(intent3);
                break;

            case R.id.button4:
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ccmn.in/") );
                startActivity(intent4);
                break;

            case R.id.button5:
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/programmes/phd.php") );
                startActivity(intent5);
                break;
        }
    }
}
