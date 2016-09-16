package com.infocancer;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class NGO_list extends ActionBarActivity {

    NGOListAdaptor adaptor,adaptor1,adaptor2,adaptor3;
    RecyclerView ngos,ngos1,ngos2,ngos3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_list);


        ngos = (RecyclerView) findViewById(R.id.ngo_rv);
        ngos.setLayoutManager(new GridLayoutManager(this, 1));
        ngos1 = (RecyclerView) findViewById(R.id.ngo_rv1);
        ngos1.setLayoutManager(new GridLayoutManager(this, 1));
        ngos2 = (RecyclerView) findViewById(R.id.ngo_rv2);
        ngos2.setLayoutManager(new GridLayoutManager(this, 1));
        ngos3 = (RecyclerView) findViewById(R.id.ngo_rv3);
        ngos3.setLayoutManager(new GridLayoutManager(this, 1));

        ngos.setNestedScrollingEnabled(false);
        ngos1.setNestedScrollingEnabled(false);
        ngos2.setNestedScrollingEnabled(false);
        ngos3.setNestedScrollingEnabled(false);

        ArrayList<String> arraylist0 = new ArrayList<String>();
        arraylist0.add("CanSupport\n" + "Kanak Durga Basti Vikas Kendra\n" + "Sector 12, R. K. Puram\n" + "New Delhi -110022\n" + "Ph. 011-26102851/69\n" + "Email: cansup_india@hotmail.com");
        arraylist0.add("Cancer Sahyog\n" +"C/o Indian Cancer Society,\n" + "Q5A Jangpura Extn.,\n" +"New Delhi - 110014\n" +"Phone number: 4319572, 4314907");
        arraylist0.add("Mastectomee Association\n" +"Sahi Hospital Building,\n" + "1A Jangpura Mathura Road,\n" +"New Delhi - 110024\n" +"Phone number: 6410962, 6121856, 3019328");
        arraylist0.add("Global Cancer Concern India (GCCI)\n" + "S-18/4, DLF Phase III\n" + "Gurgaon 122002, Haryana\n" + "Phone: 0124-2564473-75\n" + "Fax: 0124-2564476\n" + "Email: gcci@vsnl.com\n" + "Website: www.globalcancer.org");
        arraylist0.add("Tej Ram Memorial Cancer Society\n" + "28/1, East Punjabi Bagh,\n" + "New Delhi");
        arraylist0.add("Indian Cancer Society\n" + "86/1 GF, Shahpur Jat, New Delhi 110049\n" + "Email: incansoc3_cancer@yahoo.co.in website:\n" + "www.indiancancersocietydelhi.in\n" + "Tel: +91 11 26499572(O),Telefax: +91 11\n" + "26499572");
        arraylist0.add("Cancer Patients Aid Association\n" + "H/1572, Chittaranjan Park, New Delhi - 110 019\n" + "Tel: +91 11 2627 0470 / 2627 2298\n" + "E-mail: kiran.hukku@cancer.org.in");
        arraylist0.add("CanKids Kidscan\n" + "Address: Vasant Vihar, New Delhi\n" + "Delhi 110057\n" + "Phone:011 4166 3670");
        arraylist0.add("Cancer Aid Society\n" + "163, Naharpur, Rohini\n" + "Sector 7, Delhi -110085\n" + "Email: delhi@canceraidsocietyindia.org");

        ArrayList<String> arraylist1 = new ArrayList<String>();

        arraylist1.add("Cancer Support Group Cancer Institute Adyar,\n" +
                "Chennai ‐ 600 020.\n" +
                "Email: anitachandra@yahoo.co.in");
        arraylist1.add("SAHAAYIKA\n" +
                "Mrs. Girija Sudhreendran\n" +
                "AH 60, New 32, 5th Street,\n" +
                "Anna Nagar\n" +
                "Chennai 600036\n" +
                "Tel: 044‐42171217/Mobile: 91‐9840053520");
        arraylist1.add("Lakshmi Pain and Palliative Care Clinic Dr Mallika Tiruvadanan Sundaravadanan Nursing Home\n" +
                "136, Poonamallee High Road\n" +
                "Chennai ‐ 600 084.\n" +
                "Tel: 044‐2641 1597\n" +
                "Email: m_tiruvadanan@hotmail.com");
        arraylist1.add("CANSTOP\n" +
                "AC 64 Annanagar West, Chennai ‐ 600 040.\n" +
                "Phone: 044‐26220108 E‐mail: canstop@vsnl.com Website: www.canstop.org");
        arraylist1.add("Atma Sanjivini Foundation Chennai, India.\n" +
                "Mobile: 91‐9840241444\n" +
                "Email: atmasanjivini@yahoo.co.in");
        arraylist1.add("Age Care\n 39/5370, 4th Cross Road\n" +
                "Panampilly Nagar\n" +
                "Ernakulam (Kochi)\n" +
                "Kerala - 682036\n" +
                "Ph.: 0484-2310836/4036118\n" +
                "Mobile: 09447209678\n" +
                "E-mail: kochi@helpageindia.org, Biju.Mathew@helpageindia.org\n" +
                "Toll Free Elder Help Line: 1800-180-1253");
        arraylist1.add("Tamaraikulam Elders Village\n" +
                "Periyakankanankuppam (Opp.RK ITI)\n" +
                "Subauppalavadi Post\n" +
                "Cuddalore - 607002\n" +
                "Tamil Nadu\n" +
                "Ph.: 04142-212352/53/54\n" +
                "Mobile: 09840696445\n" +
                "E-mail:V.Ramalingam@helpageindia.org");
        arraylist1.add("Coimbatore Cancer Foundation GKNM Hospital,\n" +
                "Pappanaicken Palayam, Coimbatore – 641 037.\n" +
                "Tamilnadu, India.\n" +
                "Tel: 91‐422‐216211\n" +
                "Fax: 91‐422‐211611\n" +
                "Email: cancerfdn@coimbatore.com");
        arraylist1.add("Atma Sanjivini Foundation Chennai, India.\n" +
                "Mobile: 91‐9840241444\n" +
                "Email: atmasanjivini@yahoo.co.in");



        ArrayList<String> arraylist2 = new ArrayList<String>();
        arraylist2.add("COURAGE INDIA\n" +
                "The Cancer Aid Foundation,\n" +
                "Mr. Venkat Iyer (Founder President)\n" +
                "Prithvi Palace, Ocean Wing,\n" +
                "Link Road, Dahisar (W).\n" +
                "Mumbai - 400 068.\n" +
                "Website: http://www.courageindia.org/contact.htm");
        arraylist2.add("Cancer Aid & Research Foundation\n" +
                "Admin Office: Byculla Municipal School Bldg, Ground Floor, Room No. 15‐18,\n" +
                "Near 'S' Bridge, Byculla(W),\n" +
                "N.M.Joshi Marg,\n" +
                "Mumbai‐400 011. INDIA\n" +
                "Phone: 091‐22‐2300 5000/2300 7000/2300 8000 Phone: 091‐22‐3953 8800/2301 6000");
        arraylist2.add("BELGAUM CANCER FOUNDATION \n" +
                "9666a-2/D, Ashok Nagar, Belgaum - 590 010");
        arraylist2.add("CHHATRAPATI SHAHU CANCER RESEARCH FOUNDATION \n" +
                "& KOLHAPUR CANCER CENTRE\n" +
                "1182/98, E, Mali Colony, Takala,\n" +
                "Kolhapur - 416 008");
        arraylist2.add("VASANTRAO R. NAGARKAR MEDICAL FOUNDATION'S \n" +
                "MANAVATA CANCER CENTRE \n" +
                "Opp. Mahamarg Bus Stand Mumbai Naka, \n" +
                "Nashik");
        arraylist2.add("GRANT MEDICAL FOUNDATION RUBY HALL CLINIC\n" +
                "40, Sassoon road,post box no. 70,\n" +
                "Pune - 411 001");
        arraylist2.add("RAJASTHAN CANCER SOCIETY\n" +
                "17,Uniara Garden, Pushpa path,\n" +
                "JLN Marg, Jaipur - 302 004");
        arraylist2.add("OSTOMY ASSOCIATION OF INDIA\n" +
                "74, Jerbai Wadia Road, Parel,\n" +
                "Mumbai - 400012");
        arraylist2.add("The Gujarat Cancer & Research Institute\n" +
                "The Gujarat Cancer Society\n" +
                "Civil Hospital Campus, Asarwa, Ahmedabad - 380 016 Gujarat, India\n" +
                "Main Phone: +91 79 2268 8000 \n" +
                "Direct: +91 79 2268 1433/2268 8017 \n" +
                "Fax: +91 79 2268 5490 E-mail: gcriad1@bsnl.in");

        ArrayList<String> arraylist3 = new ArrayList<String>();
        arraylist3.add("Cancer Foundation of India\n47/2D Selimpur Road, \n" +
                "Kolkata - 700031\n" +
                "Phone: +91 33 2405 3131\n" +
                "Fax: +91 33 2405 6161\n" +
                "Email: cancer.foundation.india@gmail.com\n" +
                "Website: www.cancerfoundationofindia.org");
        arraylist3.add("Help Age\n17, Rukminigaon, Bylane No.6 (1st floor)\n" +
                "Guwahati – 781022\n" +
                "Assam\n" +
                "Ph.: +91 361 222 8330\n" +
                "Mobile: +91 8011527423\n" +
                "E-mail: guwahati@helpageindia.org\n" +
                "Toll Free Elder Help Line: 1800-345-1253");
        arraylist3.add("Netaji Subhas Chandra Bose Cancer Research Institute\n" +
                "16 A Park Lane , Kolkata , West Bengal , India , 700016");
        arraylist3.add("Cancer Aid Society\n1st Floor Property No. 23 \nBaluhakak Lane, PS Karaya, Kolkata -\n" +
                "kolkata@canceraidsocietyindia.org");
        arraylist3.add("Global Cancer Trust Onco Care Clinic\n P49, CIT Road, Sch - VII M\n Kankurgachi, Kolkata, West Bengal 700054");
        arraylist3.add("Help Age\nFlat No 406, 162- B\n" +
                "4th Floor, A.J.C. Bose Road\n" +
                "Kolkata - 700014\n" +
                "West Bengal\n" +
                "Ph.: 033-32904121/ 22492526\n" +
                "E-mail: kolkata@helpageindia.org\n" +
                "Toll Free Elder Help Line: 1800-345-1253");




        adaptor = new NGOListAdaptor(NGO_list.this, arraylist0);
        adaptor1 = new NGOListAdaptor(NGO_list.this, arraylist1);
        adaptor2 = new NGOListAdaptor(NGO_list.this, arraylist2);
        adaptor3 = new NGOListAdaptor(NGO_list.this, arraylist3);
        ngos.setAdapter(adaptor);
        ngos1.setAdapter(adaptor1);
        ngos2.setAdapter(adaptor2);
        ngos3.setAdapter(adaptor3);

    }

    class NGOListAdaptor extends RecyclerView.Adapter<NGOListAdaptor.MyViewHolder> {

        ArrayList<String> data;
        Context context;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.ngo_desc);
            }
        }
        public NGOListAdaptor(Context mcontext, ArrayList<String> arraylist) {
            this.context = mcontext;
            this.data = arraylist;
        }

        @Override
        public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.ngo_list_item, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder (MyViewHolder holder,int position){
            holder.title.setText(data.get(position));
        }

        @Override
        public int getItemCount () {
            return data.size();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ngo_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}