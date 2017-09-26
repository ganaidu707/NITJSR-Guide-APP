package com.myapps.nitjsr.guide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class People extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        ListView Listview = (ListView) findViewById(R.id.Listview);

        ArrayList<Object> list = new ArrayList<>();

        list.add(new String("Director"));
        list.add(new peopleitem("Dr. Y.P. Yadav", "Director", "director@nitjsr.ac.in", "0657-2373407(O)", R.drawable.dir));

        list.add(new String("Registrar"));
        list.add(new peopleitem("Dr.M.K.Agarwal", "Registrar", "registrar@nitjsr.ac.in", "0657-23736299(O)", R.drawable.maheshkumar));

        list.add(new String("Deans"));
        list.add(new peopleitem("Prof.A.M. Tigga", "Administration&Faculty welfare", "amtigga.prod@nitjsr.ac.in", "+91-9835381340", R.drawable.anandmukut));
        list.add(new peopleitem("Prof.M.M. Prasad", "Planning&Development", "mmprasad.ce@nitjsr.ac.in", "------", R.drawable.mandan));
        list.add(new peopleitem("Dr.Danish Ali Khan", "Academic&e-Governance", "dakhan.ca@nitjsr.ac.in", "+91-9835546792", R.drawable.alikhan));
        list.add(new peopleitem("Dr.Sripati Jha", "Students Welfare", "sjha.math@nitjsr.ac.in", "+91-9934532473", R.drawable.sripathija));
        list.add(new peopleitem("Prof.H.N. Singh", "Research and Consultancy", "hnsingh.me@nitjsr.ac.in", "+91-9431934051", R.drawable.hnsingh));
        list.add(new peopleitem("Prof.Sanjay", "Industry&Alumni", "sanjay.me@nitjsr.ac.in", "+91-9430738551", R.drawable.sanjay));

        list.add(new String("Associate Deans"));
        list.add(new peopleitem("Dr.Raj Ballav", "Faculty Welfare", "rballav.prod@nitjsr.ac.in", "+91-9835702810", R.drawable.rajballavmanu));
        list.add(new peopleitem("Dr.M.K.Agarwal", "Planning&Development", "mkagarwal.met@nitjsr.ac.in", "0657-2373629", R.drawable.maheshkumar));
        list.add(new peopleitem("Dr.S.Bhushan Prasad", "Housekeeping&Green Campus", "sbprasad.prod@nitjsr.ac.in", "-------", R.drawable.sashibushan));
        list.add(new peopleitem("Mr.Nigam Prakash", "Planning&Development", "nigamprakash.civil@nitjsr.ac.in", "+91-9973771555", R.drawable.nigam_prakash));
        list.add(new peopleitem("Mr.R.P. Singh", "Planning&Development", "rpsingh.ce@nitjsr.ac.in", "--------", R.drawable.rakeshpratap));
        list.add(new peopleitem("Mr.Amit Prakash", "Electrical Works", "amitprakash.ece@nitjsr.ac.in", "+91-9431905737", R.drawable.amitprakash));
        list.add(new peopleitem("Dr.Tarni Mandal", "Digital Campus", "tmandal.math@nitjsr.ac.in", "+91-9431752766", R.drawable.tmandal));
        list.add(new peopleitem("Mr.R.Ranjan Suman", "Digital Campus", "rrsuman.cse@nitjsr.ac.in", "+91-8434765977", R.drawable.rajivranjan));
        list.add(new peopleitem("Dr.Amaresh Kumar", "Academic: UG", "akumar.prod@nitjsr.ac.in", "---------", R.drawable.amreshkumar));
        list.add(new peopleitem("Mr.B.N.S.Munda", "Students Welfare", "bsmunda.ece@nitjsr.ac.in", "+91-9472786704", R.drawable.bsmunda));
        list.add(new peopleitem("Dr.M.K. Sinha", "Research&Consultancy", "mksinha.me@nitjsr.ac.in", "+91-9006771843", R.drawable.mkinha));
        list.add(new peopleitem("Dr.A.K. Sinha", "Industry&Alumni", "aksinha.ce@nitjsr.ac.in", "+91 9576578533", R.drawable.studentportal));
        list.add(new peopleitem("Dr.Ch.M.S. Rao", "Recognition&Accre.", "chmadhurao.ce@nitjsr.ac.in", "+91-7870344602", R.drawable.madhusudana));
        list.add(new peopleitem("Dr.Balram Ambade", "Students Welfare", "bambade.chem@nitjsr.ac.in", "+91-9122056501", R.drawable.balaramambade));

        list.add(new String("Placement Cell"));
        list.add(new peopleitem("Prof.Sanjay", "In-Charge,TAP Cell", "tap@nitjsr.ac.in", "91-9430738551", R.drawable.sanjay));
        list.add(new peopleitem("Ms.Pankhuri Yadav", "Officer,TAP Cell", "pankhuri.tap@nitjsr.ac.in", "+91-9430239390", R.drawable.pankhuri));

        list.add(new String("Chief Warden"));
        list.add(new peopleitem("Dr.Ashok Kumar", "Hostel Governance", "akumar.met@nitjsr.ac.in", "+91-9470525571", R.drawable.chiefwarden));

        customAdapter CustomAdapter = new customAdapter(this, list);
        Listview.setAdapter(CustomAdapter);
    }


    public class customAdapter extends BaseAdapter {

        private ArrayList<Object> list;
        private Context context;
        private LayoutInflater layoutInflater;
        private static final int PEOPLE = 0;
        private static final int HEADER = 1;

        public customAdapter(Context context, ArrayList<Object> list) {
            this.list = list;
            this.context = context;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getItemViewType(int position) {
            if (list.get(position) instanceof peopleitem) {
                return PEOPLE;
            } else {
                return HEADER;
            }
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                switch (getItemViewType(position)) {
                    case PEOPLE:
                        convertView = layoutInflater.inflate(R.layout.custom_row, null);
                        break;

                    case HEADER:
                        convertView = layoutInflater.inflate(R.layout.sectional_people, null);
                        break;
                }
            }
            switch (getItemViewType(position)) {
                case PEOPLE:
                    ImageView customimage = (ImageView) convertView.findViewById(R.id.customimage);
                    TextView customtext = (TextView) convertView.findViewById(R.id.customtext);
                    TextView customtext1 = (TextView) convertView.findViewById(R.id.customtext1);
                    TextView customtext2 = (TextView) convertView.findViewById(R.id.customtext2);
                    TextView customtext3 = (TextView) convertView.findViewById(R.id.customtext3);

                    customimage.setImageResource(((peopleitem) list.get(position)).getIcons());
                    customtext.setText(((peopleitem) list.get(position)).getNames());
                    customtext1.setText(((peopleitem) list.get(position)).getJobs());
                    customtext2.setText(((peopleitem) list.get(position)).getEmails());
                    customtext3.setText(((peopleitem) list.get(position)).getNums());

                    break;
                case HEADER:
                    TextView header = (TextView) convertView.findViewById(R.id.header);
                    header.setText(((String) list.get(position)));
                    break;
            }
            return convertView;
        }
    }
    public class peopleitem {

        private String names;
        private String jobs;
        private String emails;
        private String nums;
        private int icons;

        public peopleitem(String names, String jobs, String emails, String nums, int icons) {
            this.names = names;
            this.jobs = jobs;
            this.emails = emails;
            this.nums = nums;
            this.icons = icons;
        }

        public String getNames() {return names;}

        public void setNames(String names) {this.names = names;}

        public String getJobs() {return jobs;}

        public void setJobs(String jobs) {this.jobs = jobs;}

        public String getEmails() {return emails;}

        public void setEmails(String emails) {this.emails = emails;}

        public String getNums() {return nums;}

        public void setNums(String nums) {this.nums = nums;}

        public int getIcons() {return icons;}

        public void setIcons(int icons) {this.icons = icons;}
    }

}









