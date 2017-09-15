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


import java.util.ArrayList;


public class firstactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstactivity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView list_view = (ListView) findViewById(R.id.list_view);

        ArrayList<Object> list1 = new ArrayList<>();

        list1.add(new String("Faculty"));
        list1.add(new placeitem("Prof. Sanjay", "In-Charge,Training&Placement", "tap@nitjsr.ac.in", "+91-9430738551"));
        list1.add(new placeitem("Ms. Pankhuri Yadav", "Placement Officer,Training&Placement", "pankhuri.tap@nitjsr.ac.in", "+91-9430239390"));

        list1.add(new String("UG TEAM"));
        list1.add(new placeitem("Rahul Kumar Meena", "Computer Science and Eng.", "rahul.nitjsr1994@gmail.com", "9530476929/7870854822"));
        list1.add(new placeitem("Raj Ranjan", "Computer Science and Eng.", "raj18021997@gmail.com", "8507118002/7992301435"));
        list1.add(new placeitem("Aadarsh kumar singh", "Mechanical Eng.", "aadarshthebest97@gmail.com", "7992374709/7209384140"));
        list1.add(new placeitem("Abhinav Utkarsh", "Mechanical Eng.", "abhi.utkarsh26@gmail.com", "9709009226/8863903311"));
        list1.add(new placeitem("Kaushik Komanduri", "Electronics & Communication Eng.", "kaushikh96@gmail.com", "8008458784/8555893215"));
        list1.add(new placeitem("Nawnit Lodha", "Electronics & Communication Eng.", "nawnitlodha@gmail.com", "9708926868/7992278050"));
        list1.add(new placeitem("Arnav Sarkar", "Electrical & Electronics Eng.", "arnavsarkar7@gmail.com", "7070654097/7004600604"));
        list1.add(new placeitem("Rahul Kumar singh", "Electrical & Electronics Eng.", "rahulkrsingh053@gmail.com", "7870855937/7004031892)"));
        list1.add(new placeitem("Gaurav Kumar", "Civil Eng.", "gaurav787024@gmail.com", "8271913081/8789084218"));
        list1.add(new placeitem("Sneh Sparsh", "Civil Eng.", "snehsparsh1996@gmail.com", "9525072067/7004117699"));
        list1.add(new placeitem("Pranav bhardwaj", "Metallurgical & Materials Engg", "pranavbh16@gmail.com", "8406814309/8851406463"));
        list1.add(new placeitem("Siddharth Bhusanshetty", "Metallurgical & Materials Engg", "bsiddarth96@gmail.com", "7981276047/9905305531"));
        list1.add(new placeitem("Raghav Arora", "Production & Industrial Eng.", "raghavaroranetwork@gmail.com", "9410191100/8218067729"));
        list1.add(new placeitem("Ajit Kumar Gupta", "Manufacturing Eng.", "ajitgupta18th@gmail.com", "8083951624/8409869332"));


        list1.add(new String("PG TEAM-MCA"));
        list1.add(new placeitem("Sany Rawat", "MCA", "sanyrawat@gmail.com", "9415005761/9140661253)"));
        list1.add(new placeitem("Vishal Khare", "MCA", "vishalkhare39@gmail.com", "7319706481/8630096494"));
        list1.add(new placeitem("Kriti Duggal", "MCA", "duggalkriti94@gmail.com", "9830126572"));

        list1.add(new String("PG TEAM-M.Tech."));
        list1.add(new placeitem("Prabhakar Kumar", "Computer Science Engg", "tap.pgr@nitjsr.ac.in", "9708338455/7903655699 "));
        list1.add(new placeitem("Gollu Appala Naidu", "Embedded Systems", "tap.pgr@nitjsr.ac.in", "9666978171"));
        list1.add(new placeitem("Saurav Kumar", "Communication", "tap.pgr@nitjsr.ac.in", "7004081832 "));
        list1.add(new placeitem("Kaushik Saha", "ISSE", "tap.pgr@nitjsr.ac.in", "9749532355"));
        list1.add(new placeitem("Ajmat raja", "Water Resources engg", "tap.pgr@nitjsr.ac.in", "9803579848"));
        list1.add(new placeitem("Sejhal", "Geo Tech", "tap.pgr@nitjsr.ac.in", "7209879035 "));
        list1.add(new placeitem("Jagtap Sanket ramchandra", "Structural", "tap.pgr@nitjsr.ac.in", "9619467296 "));
        list1.add(new placeitem("Shuvam Sahay", "Power System", "tap.pgr@nitjsr.ac.in", "8809930328"));
        list1.add(new placeitem("Shiv Kumar", "Power Electronics & Drives", "tap.pgr@nitjsr.ac.in", "8882947693"));
        list1.add(new placeitem("vijay Gajraj", "Manufacturing System", "tap.pgr@nitjsr.ac.in", "9799400370"));
        list1.add(new placeitem("Rashi Gupta", "CIDM", "tap.pgr@nitjsr.ac.in", "7643001753"));
        list1.add(new placeitem("Akshay Narhere", "Thermal Engineering", "tap.pgr@nitjsr.ac.in", "7519970631"));
        list1.add(new placeitem("Abhinav Ranjan", "Energy Systems", "tap.pgr@nitjsr.ac.in", "9472936501"));
        list1.add(new placeitem("Patel Azahar", "Material Technology", "tap.pgr@nitjsr.ac.in", "9429477975 "));
        list1.add(new placeitem("Aditya Anand", "Foundry Technology", "tap.pgr@nitjsr.ac.in", "7004789318/9661229002"));
        list1.add(new placeitem("Keshav Kundan", "Surface Science", "tap.pgr@nitjsr.ac.in", "7274012587"));

        OtherActivity placeAdapter = new OtherActivity(this, list1);
        list_view.setAdapter(placeAdapter);
    }


    public class OtherActivity extends BaseAdapter {

        private ArrayList<Object> list1;
        private Context context;
        private LayoutInflater layoutInflater;
        private static final int PLACE = 0;
        private static final int HEADER1 = 1;

        public OtherActivity(Context context,ArrayList<Object> list1) {
            this.list1 = list1;
            this.context = context;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getItemViewType(int position) {
            if(list1.get(position) instanceof placeitem){
                return PLACE;
            }
            else {
                return HEADER1;
            }
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        @Override
        public int getCount() {
            return list1.size();
        }

        @Override
        public Object getItem(int position) {
            return list1.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (convertView == null) {
                switch (getItemViewType(position)){
                    case PLACE:
                        convertView = layoutInflater.inflate(R.layout.activity_other, null);
                        break;

                    case HEADER1:
                        convertView = layoutInflater.inflate(R.layout.sectionalplace, null);
                        break;
                }
            }
            switch (getItemViewType(position)){
                case PLACE:

                    TextView text = (TextView) convertView.findViewById(R.id.text);
                    TextView text1 = (TextView) convertView.findViewById(R.id.text1);
                    TextView text2 = (TextView) convertView.findViewById(R.id.text2);
                    TextView text3 = (TextView) convertView.findViewById(R.id.text3);

                    text.setText(((placeitem)list1.get(position)).getNames());
                    text1.setText(((placeitem)list1.get(position)).getJobs());
                    text2.setText(((placeitem)list1.get(position)).getEmails());
                    text3.setText(((placeitem)list1.get(position)).getNums());

                    break;
                case HEADER1:

                    TextView headerplace= (TextView)convertView.findViewById(R.id.headerplace);
                    headerplace.setText(((String)list1.get(position)));
                    break;
            }
            return convertView;
        }

    }

    public class placeitem {
        private String names;
        private String jobs;
        private String emails;
        private String nums;

        public placeitem(String names, String jobs, String emails, String nums) {
            this.names = names;
            this.jobs = jobs;
            this.emails = emails;
            this.nums = nums;
        }

        public String getNames() {return names;}

        public void setNames(String names) {this.names = names;}

        public String getJobs() {return jobs;}

        public void setJobs(String jobs) {this.jobs = jobs;}

        public String getEmails() {return emails;}

        public void setEmails(String emails) {this.emails = emails;}

        public String getNums() {return nums;}

        public void setNums(String nums) {this.nums = nums;}
    }




}







