package com.exampleone.nitjsr.firstapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private GridView customGridView;
    private String namesList[] = {"Overview","People","Departments","Admissions","Placements","Notifications","Student portal","Food",
            "Contacts", "SBI i-Collect","Quick links", "Bus Tracking","Halls","Fests","Social media"};


   private int nameIcon[] = {R.drawable.overview, R.drawable.pepole, R.drawable.departments,R.drawable.admissions,R.drawable.placements,
            R.drawable.notifications,R.drawable.studentportal,R.drawable.food,R.drawable.contacts,R.drawable.sbi,
            R.drawable.usefullinks, R.drawable.bus,R.drawable.halls,R.drawable.fests,R.drawable.socialwebsites};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        customGridView = (GridView) findViewById(R.id.customGridView);
        GridAdapter adapter = new GridAdapter(MainActivity.this, nameIcon, namesList);
        customGridView.setAdapter(adapter);

        customGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent0 = new Intent(MainActivity.this, about.class);
                    startActivity(intent0);
                }
                if (position == 1) {
                    Intent intent1 = new Intent(MainActivity.this, People.class);
                    startActivity(intent1);
                }
                if (position == 2) {
                    Intent intent2 = new Intent(MainActivity.this, Departments.class);
                    startActivity(intent2);
                }
                if (position == 3) {
                    Intent intent3 = new Intent(MainActivity.this, Admissions.class);
                    startActivity(intent3);
                }
                if (position == 4) {
                    Intent intent4 = new Intent(MainActivity.this, AnimationActivity.class);
                    startActivity(intent4);
                }
                if (position == 5) {
                    Intent intent5 = new Intent(MainActivity.this, notifications.class);
                    startActivity(intent5);
                }
                if (position == 6) {
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://14.139.205.172/web_new/Main.aspx"));
                    startActivity(intent6);
                }
                if (position == 7) {
                    Intent intent7 = new Intent(MainActivity.this, food.class);
                    startActivity(intent7);
                }
                if (position == 8) {
                    Intent intent8 = new Intent(MainActivity.this, Contacts.class);
                    startActivity(intent8);
                }
                if (position == 9) {
                    Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/fee_sbi/"));
                    startActivity(intent9);
                }
                if (position == 10) {
                    Intent intent10 = new Intent(MainActivity.this, Quicklinks.class);
                    startActivity(intent10);
                }
                if (position == 11) {
                    /*Intent intent11 = new Intent(MainActivity.this,Bustrack.class);
                    startActivity(intent11);*/
                    Toast.makeText(MainActivity.this, "Updating Ssssoooooonnn.....", Toast.LENGTH_LONG).show();
                }
                if (position == 12) {
                    Intent intent12 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/sw/hostel/"));
                    startActivity(intent12);
                }
                if (position == 13) {
                    Intent intent13 = new Intent(MainActivity.this, fests.class);
                    startActivity(intent13);
                }
                if (position == 14) {
                    Intent intent14 = new Intent(MainActivity.this, Social.class);
                    startActivity(intent14);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        GridView customGridView= (GridView) findViewById(R.id.customGridView);
        switch (item.getItemId()){
            case R.id.allabout:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent intent1=new Intent(MainActivity.this,aboutapp.class);
                startActivity(intent1);
                return true;

            case R.id.developer:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent intent2=new Intent(MainActivity.this,Developer.class);
                startActivity(intent2);
                return true;

            case R.id.rateapp:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent intent3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSe3__5EdPovDWN_8Xk7IiobIa4Ga_0nDxCtYWvQgYmi_-v6Gw/viewform?c=0&w=1"));
                startActivity(intent3);
                //activity_main.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.feedback:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Intent intent4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSd_72GU6_H0ZQsp5kt-mtn3XcbST7lfarMpNTnGZZjTN3V19A/viewform?c=0&w=1"));
                startActivity(intent4);
                //activity_main.setBackgroundColor(Color.BLUE);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public class GridAdapter extends BaseAdapter {

        private int icons[];
        private String names[];
        private Context context;
        private LayoutInflater inflater;

        public GridAdapter(Context context, int icons[], String names[]){

            this.context= context;
            this.icons= icons;
            this.names= names;
        }

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return names[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View customGridView= convertView;
            if(convertView==null){

                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                customGridView = inflater.inflate(R.layout.custom_grid, null);
            }
            ImageView icon =(ImageView) customGridView.findViewById(R.id.icons);
            TextView name =(TextView) customGridView.findViewById(R.id.names);

            icon.setImageResource(icons[position]);
            name.setText(names[position]);

            return customGridView;
        }
    }



}
