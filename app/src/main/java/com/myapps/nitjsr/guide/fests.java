package com.myapps.nitjsr.guide;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class fests extends AppCompatActivity {

    private String fests[] ={"culfest","Ojass","Technica","Sports meet","Alumini"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fests);

        CircleMenu circle_menu=(CircleMenu)findViewById(R.id.circle_menu);
        circle_menu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.cmenu, R.drawable.cremove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.culfest)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.ojass)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.tech)
                .addSubMenu(Color.parseColor("#93a9f4"),R.drawable.sportsmeet)
                .addSubMenu(Color.parseColor("#841a23"),R.drawable.alumni)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(fests.this, "you selected"+fests[index], Toast.LENGTH_LONG).show();
                    }
                });

        circle_menu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                if (i == 0) {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitjsr.ac.in/culfest"));
                    startActivity(intent1);
                }

                if (i == 1) {

                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ojass.in/"));
                    startActivity(intent2);
                }

                if (i == 2){
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sports.nitjsr.ac.in/"));
                    startActivity(intent3);
                }

                if(i==3) {
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://alumni.nitjsr.ac.in/"));
                    startActivity(intent4);
                }

                if(i==4) {
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/sw/technica.php"));
                    startActivity(intent5);
                }
            }
        });
    }
}
