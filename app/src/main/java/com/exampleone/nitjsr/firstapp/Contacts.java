package com.exampleone.nitjsr.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Contacts extends AppCompatActivity {

    private PDFView pdfview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        pdfview=(PDFView)findViewById(R.id.pdfview);
        pdfview.fromAsset("telephone_directory_min.pdf").load();
    }
}
