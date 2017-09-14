package com.exampleone.nitjsr.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class about extends AppCompatActivity {

    private String about[] ={"About","Vision","Goals","output","directions","googlle map","IIIT Ranchi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        CircleMenu menu_circle=(CircleMenu)findViewById(R.id.menu_circle);
        menu_circle.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.cmenu, R.drawable.cremove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.about)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.vision)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.goal)
                .addSubMenu(Color.parseColor("#93a9f4"),R.drawable.output)
                .addSubMenu(Color.parseColor("#4fffff"),R.drawable.directons)
                .addSubMenu(Color.parseColor("#841a23"),R.drawable.googlemap)
                .addSubMenu(Color.parseColor("#841a23"),R.drawable.iiit)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(about.this, "you selected"+about[index], Toast.LENGTH_LONG).show();
                    }
                });

        menu_circle.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                if (i == 0) {

                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/about.php"));
                    startActivity(intent1);
                }

                if (i == 1) {

                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/vision.php"));
                    startActivity(intent2);
                }

                if (i == 2){
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/goals_obj.php"));
                    startActivity(intent3);
                }

                if(i==3) {
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/output_indi.php"));
                    startActivity(intent4);
                }

                if(i==4) {
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/reach.php"));
                    startActivity(intent5);
                }
                if(i==5) {
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:22.7765695,86.1437391,15z"));
                    startActivity(intent6);
                }

                if(i==6) {
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://iiitranchi.ac.in/"));
                    startActivity(intent5);
                }
            }
        });
    }
}
