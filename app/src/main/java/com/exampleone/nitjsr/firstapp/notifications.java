package com.exampleone.nitjsr.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cuboid.cuboidcirclebutton.CuboidButton;

public class notifications extends AppCompatActivity implements View.OnClickListener {

   private CuboidButton AcademicNotify ,JobNotify;

    String notify[]={"Academic Notify","Job Notify"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        AcademicNotify=(CuboidButton)findViewById(R.id.AcademicNotify);
        JobNotify=(CuboidButton)findViewById(R.id.JobNotify);

        AcademicNotify.setOnClickListener(this);
        JobNotify.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.AcademicNotify:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/notice.php"));
                startActivity(intent1);
                break;

            case R.id.JobNotify:
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/jobs.php"));
                startActivity(intent6);
                break;
        }
    }
}
