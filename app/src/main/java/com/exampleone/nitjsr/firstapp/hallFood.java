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

public class hallFood extends AppCompatActivity {
    private ListView hallfood;

    private String food[]={"Mess-A", "Mess-B","Mess-C","Mess-D","Mess-E","Mess-F","Mess-G","Mess-H",
                   "Mess-I","Mess-J","Mess-K","Mess-RLB","Mess-Ambedkar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall_food);

        hallfood=(ListView)findViewById(R.id.hallfood);
        listhall Adapter = new listhall(this, food) ;
        hallfood.setAdapter(Adapter);
    }

    public class listhall extends BaseAdapter {

        private String food[];
        private Context context;
        private LayoutInflater layoutInflater;

        public listhall(Context context, String[] food) {
            this.food=food;
            this.context=context;

        }

        @Override
        public int getCount() {
            return food.length;
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

            View hallfoodlist=convertView;
            if (hallfoodlist == null) {
                layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                hallfoodlist = layoutInflater.inflate(R.layout.listhall, null);
            }

            TextView hallfood = (TextView) hallfoodlist.findViewById(R.id.foodhall);
            hallfood.setText(food[position]);

            return hallfoodlist;
        }
    }

}
