package com.exampleone.nitjsr.firstapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Departments extends AppCompatActivity{
    private ListView Listdept;

    private String[] names = {"Chemistry", "Civil Engineering", "Computer Applications", "Computer Science&Eng.",
            "Electrical&Electronics Eng.", "Electronics&Communication", "Humanities,Social Sci.&Mgmt",
            "Mathematics", "Mechanical Engineering", "Metallurgical&Materials Eng.", "Physics", "Production Engineering"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);

        Listdept = (ListView) findViewById(R.id.Listdept);
        deptList CustomAdapter = new deptList(this, names);
        Listdept.setAdapter(CustomAdapter);

        Listdept.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            if (position == 0) {
                Intent intent0 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/chemistry/"));
                startActivity(intent0);
            }
            if (position == 1) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/civil/"));
                startActivity(intent1);
            }
            if (position == 2) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/mca/"));
                startActivity(intent2);
            }
            if (position == 3) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/cse/"));
                startActivity(intent3);
            }
            if (position == 4) {
                Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/eee/"));
                startActivity(intent4);
            }
            if (position == 5) {
                Intent intent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/ece/"));
                startActivity(intent5);
            }
            if (position == 6) {
                Intent intent6 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/humanities/"));
                startActivity(intent6);
            }
            if (position == 7) {
                Intent intent7 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/maths/"));
                startActivity(intent7);
            }
            if (position == 8) {
                Intent intent8 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/me/"));
                startActivity(intent8);
            }
            if (position == 9) {
                Intent intent9 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/meta/"));
                startActivity(intent9);
            }
            if (position == 10) {
                Intent intent10 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/physics/"));
                startActivity(intent10);
            }
            if (position == 11) {
                Intent intent11 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nitjsr.ac.in/academics/departments/prod/"));
                startActivity(intent11);
            }

        }
    });
    }

    public class deptList extends BaseAdapter {

        private String[] names;
        private Context context;
        private LayoutInflater layoutInflater;


        public deptList(Context context, String[] names) {

            this.context = context;
            this.names = names;

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

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View customlist = convertView;
            if (customlist == null) {
                layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                customlist = layoutInflater.inflate(R.layout.deptlist, null);
            }
            TextView depttext = (TextView) customlist.findViewById(R.id.depttext);

            depttext.setText(names[position]);

            return customlist;
        }
    }

}



