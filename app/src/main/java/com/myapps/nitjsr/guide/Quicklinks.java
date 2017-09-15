package com.myapps.nitjsr.guide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Quicklinks extends AppCompatActivity {

    private ListView customGrid;
    private String namesList[] = {"Facilities","Academic Calender","Time Table","Fee Structure","Holidays","Alumini","FAQs","Find People",
            "Manthan", "Collect Degree Certificate","Scholorships", "Digital Library","Access e-books","Photo Gallery","Download Forms"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quicklinks);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        customGrid = (ListView) findViewById(R.id.customGrid);
        quickGrid adapter = new quickGrid(Quicklinks.this, namesList);
        customGrid.setAdapter(adapter);

        customGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/facility/index.php"));
                    startActivity(intent0);
                }
                if(position==1){
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/common_calendar.php"));
                    startActivity(intent2);
                }
                if(position==2){
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/timetable.php"));
                    startActivity(intent3);
                }
                if(position==3){
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/fee_structure.php"));
                    startActivity(intent4);
                }
                if(position==4){
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/uploads/holidays.pdf"));
                    startActivity(intent5);
                }

                if(position==5){
                    Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://alumni.nitjsr.ac.in/"));
                    startActivity(intent5);
                }
                if(position==6){
                    Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/faq.php"));
                    startActivity(intent6);
                }
                if(position==7){
                    Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/find_people.php"));
                    startActivity(intent7);
                }
                if(position==8){
                    Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://manthan.nitjsr.ac.in/"));
                    startActivity(intent8);
                }
                if(position==9){
                    Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/degree.php"));
                    startActivity(intent9);
                }
                if(position==10){
                    Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/institute/scholarships.php"));
                    startActivity(intent10);
                }
                if(position==11){
                    Intent intent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ndl.iitkgp.ac.in/index.php"));
                    startActivity(intent11);
                }
                if(position==12){
                    Intent intent12 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://nitjsr.ac.in/library/ebooks.php"));
                    startActivity(intent12);
                }
                if(position==13){
                    Intent intent13 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/gallery/"));
                    startActivity(intent13);
                }
                if(position==14){
                    Intent intent14 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/forms.php"));
                    startActivity(intent14);
                }
            }
        });
    }

    public class quickGrid extends BaseAdapter {

        private String names[];
        private Context context;
        private LayoutInflater inflater;

        public quickGrid(Context context,String names[]){

            this.context= context;
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

            View customGrid= convertView;
            if(convertView==null){

                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                customGrid = inflater.inflate(R.layout.quickgrid, null);
            }

            TextView name =(TextView) customGrid.findViewById(R.id.names);

            name.setText(names[position]);

            return customGrid;
        }
    }

}
