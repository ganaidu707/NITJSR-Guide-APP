package com.exampleone.nitjsr.firstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class InsideCampus extends AppCompatActivity {
    private String[] food={"Annapurna Canteen", "Pradeep Hotel","Gupta Hotel", "Shyam daa Canteen", "Amul Parlor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_campus);

        ListView inside =(ListView)findViewById(R.id.inside);
        listinside CustomAdapter=new listinside(food, this);
        inside.setAdapter(CustomAdapter);
    }
    public class listinside extends BaseAdapter {

        private String[] insidefoodlist;
        private Context context;
        private LayoutInflater layoutInflater;


        public listinside(String[] insidefoodlist, Context context) {
            this.insidefoodlist = insidefoodlist;
            this.context = context;
        }

        @Override
        public int getCount() {
            return insidefoodlist.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View insidelist = convertView;
            if (insidelist == null) {
                layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                insidelist = layoutInflater.inflate(R.layout.listinside, null);
            }

            TextView insidefood = (TextView) insidelist.findViewById(R.id.insidefood);
            insidefood.setText(insidefoodlist[position]);

            return insidelist;
        }
    }

}
