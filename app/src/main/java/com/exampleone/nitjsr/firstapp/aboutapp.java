package com.exampleone.nitjsr.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class aboutapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapp);

        TextView apphead = (TextView) findViewById(R.id.apphead);
        TextView appabout = (TextView) findViewById(R.id.appabout);
        appabout.setText("It guides and gives much info\n" +
                "for who want know about tech\n" +
                "world NIT JSR.This app is very\n" +
                "handy and all necessary info\n" +
                "get from offline.All contacts\n" +
                "info on eateries,Fests,Academia\n" +
                "of NIT JSR On-The-Go!!!\n" +
                "                              \n" +
                "Information provided has been \n" +
                "collected from various sources\n" +
                "and true to best of my knowledge.\n" +
                "I am not responsible for any of \n" +
                "contradiction on the information \n" +
                "provided or opinions established.\n" +
                "Images  used in the  app  are\n" +
                "downloaded from internet.I am\n" +
                "not violating copy rights law.\n " +
                "If anything is against law or \n" +
                "rules kindly report at my email-\n" +
                "ganaidu707@gmail.com.\n" +
                "                        \n" +
                "Thank you for downloading…");

        appabout.setMovementMethod(new ScrollingMovementMethod());
    }
}




