package com.exampleone.nitjsr.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class Social extends AppCompatActivity {

   private String Social[] ={"face book","Linked In","Research Gate","Youtube"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        CircleMenu circle_menu=(CircleMenu)findViewById(R.id.circle_menu);
        circle_menu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.cmenu, R.drawable.cremove)
                .addSubMenu(Color.parseColor("#258CFF"),R.drawable.fb)
                .addSubMenu(Color.parseColor("#6d4c41"),R.drawable.liin)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.rg)
                .addSubMenu(Color.parseColor("#93a9f4"),R.drawable.ytube)

                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(Social.this, "you selected"+Social[index], Toast.LENGTH_LONG).show();

                    }
                });

        circle_menu.setOnMenuSelectedListener(new OnMenuSelectedListener() {
            @Override
            public void onMenuSelected(int i) {
                if (i == 0) {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nitjam"));
                    startActivity(intent1);
                }

                if (i == 1) {

                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/edu/school?id=161215&trk=tyah&trkInfo=clickedVertical%3Aschool%2Cidx%3A3-1-3%2CtarId%3A1426847801836%2Ctas%3ANATIONAL+INSTITUTE+OF+TECHNOLOGY+JA"));
                    startActivity(intent2);
                }

                if (i == 2){
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.researchgate.net/institution/National_Institute_of_Technology_Jamshedpur"));
                startActivity(intent3);
            }

                if(i==3) {
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCesG9jkyP9fpJhJKvGdx9fA"));
                    startActivity(intent4);
                }

            }
        });
    }
}
