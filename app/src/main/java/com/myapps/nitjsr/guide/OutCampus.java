package com.myapps.nitjsr.guide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class OutCampus extends AppCompatActivity {

    private ListView outfood;

    private String[] name={"KFC","Blue Shappire","The Sonnet","Chinese Inn","Novelty","Anna's Kitchen","Mohiti Mahal","Hang out","Delhi Darbar",
            "Blue Diamond", "Sukh Sagar", "Pind Balluchi", "Beyond South","Biryani House", "Saffron","Dominos"};

    private String[] area={"Area:Sakchi","Area:Bistupur","Area:Bistupur","Area:Bistupur","Area:Bistupur","Area:Akasa Vani","Area:Bistupur",
            "Area:Bistupur","Area:Sakchi","Area:Bistupur","Area:Sakchi","Area:Sakchi", "Area:Bistupur","Area:Bistupur","Area:Sakchi",
            "Area:Bistupur"};

    private String[] phone={"Phone NO: 0657 656 6678","Phone NO: 0657-2321925","Phone NO: 0657 661 9000","Phone NO: 0657 222 4630","Phone NO: 0657 224 9776",
            "Phone NO: 0657 600 6009","Phone NO: 0657 224 9493","Phone NO: 0657 232 0299", "Phone NO: 0657-2421577","Phone NO: 0657 656 0448",
            "Phone NO: 0657 324 3222","Phone NO: 087970 09554","Phone NO: 087575 54040", "Phone NO: 0657 224 9215","Phone NO: 0657 600 5004",
            "Phone NO: 0657 265 1345"};

    private String[] rating={"Rating: 4.0","Rating: 4.8","Rating: 4.2","Rating: 4.0","Rating: 4.0","Rating: 4.7","Rating: 3.9","Rating: 3.7",
            "Rating: 4.0","Rating: 4.0","Rating: 4.1","Rating: 3.8","Rating: 4.1","Rating: 3.6","Rating: 3.7","Rating: 3.8"};

    private String[] time={"Every Day:11AM–11PM","Every Day:10:30AM-10:30PM","24 hours","Every Day:9:30AM–2:30,5–10PM","Every Day:10AM–11PM",
            "Every Day:11AM–10PM", "Every Day:11:30AM–11PM","Every Day:9:30AM–11PM","Every Day:07:00AM-11:00PM","Every Day:11AM–10PM",
            "Every Day:10AM–10:30PM", "Every Day:12PM–11PM","Every Day:07:00AM-11:00PM","Every Day:10:30AM-11:00PM","Every Day:10AM–09PM",
            "Every Day:11AM–11PM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_campus);

        outfood=(ListView)findViewById(R.id.outfood);
        outside Adapter=new outside(this, name,area,phone,rating,time);
        outfood.setAdapter(Adapter);
    }

    public class outside extends BaseAdapter {

        private String[] name;
        private String[] area;
        private String[] phone;
        private String[] rating;
        private String[] time;
        private Context context;
        private LayoutInflater layoutInflater;

        public outside(Context context, String[] name, String[] area, String[] phone, String[] rating,String[] time) {
            this.name = name;
            this.area = area;
            this.phone = phone;
            this.rating = rating;
            this.time = time;
            this.context = context;
        }

        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int position) {
            return name[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View outfoodlist = convertView;
            if (convertView == null) {

                layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                outfoodlist = layoutInflater.inflate(R.layout.outlist, null);
            }

            TextView textname = (TextView) outfoodlist.findViewById(R.id.textname);
            TextView textarea = (TextView) outfoodlist.findViewById(R.id.textarea);
            TextView textph = (TextView) outfoodlist.findViewById(R.id.textph);
            TextView textrating = (TextView) outfoodlist.findViewById(R.id.textrating);
            TextView texttime = (TextView) outfoodlist.findViewById(R.id.texttime);

            textname.setText(name[position]);
            textarea.setText(area[position]);
            textph.setText(phone[position]);
            textrating.setText(rating[position]);
            texttime.setText(time[position]);

            return outfoodlist;
        }
    }
}
