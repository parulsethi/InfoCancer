package com.infocancer;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class Hospitals_list extends ActionBarActivity {

    HospitalsListAdaptor adaptor,adaptor1,adaptor2,adaptor3;
    RecyclerView hosp,hosp1,hosp2,hosp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals_list);

        hosp = (RecyclerView) findViewById(R.id.hosp_rv);
        hosp.setLayoutManager(new GridLayoutManager(this, 1));
        hosp1 = (RecyclerView) findViewById(R.id.hosp_rv1);
        hosp1.setLayoutManager(new GridLayoutManager(this, 1));
        hosp2 = (RecyclerView) findViewById(R.id.hosp_rv2);
        hosp2.setLayoutManager(new GridLayoutManager(this, 1));
        hosp3 = (RecyclerView) findViewById(R.id.hosp_rv3);
        hosp3.setLayoutManager(new GridLayoutManager(this, 1));

        hosp.setNestedScrollingEnabled(false);
        hosp1.setNestedScrollingEnabled(false);
        hosp2.setNestedScrollingEnabled(false);
        hosp3.setNestedScrollingEnabled(false);

        ArrayList<String> arraylist0 = new ArrayList<String>();
        arraylist0.add("AIIMS\nSector - IRCH, Ansari Nagar East, New Delhi, Delhi, India " + "\nPhone - +91 11 2658 8500\n" + "Website:http://www.aiims.edu");
        arraylist0.add("Lord Dhanwantri Ayurvedic Cancer Hospital Rohtak, Haryana\n" +
                "Address: Jhang Colony Near Bajrang Bhawan Rohtak 124001 (Haryana),\n" +
                "Website- http://www.ayurveda.in/centers/lord-dhanwantri-ayurvedic-cancer-hospital-rohtak-631.html\n" +
                "Phone: +91. 9253873567");
        arraylist0.add("Dr Yeshi Dhonden Cancer Treatment Clinic\n" +
                "Dr Yeshi Dhonden Tibetan Herbal Clinic,\n" +
                "Ashoka Niwas , Mcleod Ganj - 176219\n" +
                "Dharamsala, (H.P.),India");
        arraylist0.add("Hakim Sanaullah Specialist Hospital & Cancer Center\n" +
                "Mazbugh Road (Near Fruit Mandi), Sopore,\n" +
                "J&K, India Pin: 193201 \n" +
                "Tel: (+91) 1954 220631 / 224827\n" +
                "email: shadsalim@hsshcc.org");
        arraylist0.add("Dr. Chaturvedi Cancer Hospital and Research Institute Pvt. Ltd.\n" +
                "Address: 189-c, Medical College Road\nBasharatpur , Gorakhpur");
        arraylist0.add("Rajiv Gandhi Cancer Institute\nSector - 5, Rohini\n" + "Delhi - 110 085\n" + "Website:http://www.rgcirc.org/");
        arraylist0.add("Apollo Hospital\n" + "Sarita Vihar, Delhi Mathura Road,\n" + "New Delhi - 110076 (INDIA)\n" + "Phone No: + 91 - 11 - 2692 5858 / 2692 5801\n" + "Email ID: assistance@apollohospitalsdelhi.com,\n" + "Website: http://www.apollohospdelhi.com/cancer-care-institute-overview");
        arraylist0.add("Dharamshila Hospital and Research Centre\n" + "Near New Ashok Nagar Metro Station,\n" + "Vasundhara Enclave, Delhi - 110096\n" + "Tel: 011 - 43066353\n" + "Fax: 011 - 22617770 / 22619033 / 22618574\n" + "Email: contact@dhrc.in");
        arraylist0.add("Action Cancer Hospital\n" + "A - 4, Paschim Vihar\n" + "New Delhi - 110063\n" + "Tel.: +91-11-49222222\n" + "Fax. : + 91-11-4502 4287\n" + "Email: - ach@actioncancerhospital.com");
        arraylist0.add("Max Super Speciality Hospital\n" + "Enclave Road, Saket\n" + "New Delhi 110 017\n" + "Phone: +91 11 2651 5050\n" + "Fax: +91 11 2651 0050\n" + "Emergency No : +91 11 4055 4055\n" + "Appointment Helpline No: 8860 444 888");
        arraylist0.add("Delhi State Cancer Institute\n" + "Dilshad Garden, Delhi 110 095 (India)\n" + "Phone: +91-11-2213 5700\n" + "Tele Fax: +91-11-2211 0505\n" + "E-mail: dsci.delhi@yahoo.co.in");
        arraylist0.add("Fortis Flt. Lt. RajanDhall Hospital\n" + "Sector B, Pocket 1 Aruna Asaf Ali Marg,\n" + "Vasant Kunj ,New Delhi, 110070\n" + "Email:enquiries@fortishealthcare.com\n" + "Fax:+91 11 4277 6221");

        ArrayList<String> arraylist1 = new ArrayList<String>();
        arraylist1.add("Mahatma Gandhi Cancer Hospital and Research Institute\n" +
                "1/7, MVP Colony, Visakhapatnam – 530017\n" +
                "Ph : +91-891- 2878787, 2551811\n" +
                "Fax : +91-891-6525403\n" +
                "Website : www.mgcancerhospital.com\n" +
                "Email : info@mgcancerhospital.com");
        arraylist1.add("Sanjeevani CBCC USA cancer hospital\n" +
                "Dawada Colony, Pachpedhi Naka,\n" +
                "Raipur, Chhattisgarh.\n" +
                "Pin - 492001.\n" +
                "Ph: +91 771 4061010, Fax: +91 771 4013120\n" +
                "website: http://www.scch.co.in\n" +
                "Email: info@scch.co.in");
        arraylist1.add("Manipal Hospital Goa\n" +
                "Dr. E. Borges Road,\n" +
                "Dona Paula, Panaji,\n" +
                "Goa 403 004.\n" +
                "Ph : 1800 3001 4000");
        arraylist1.add("Sri Shankara Cancer Hospital and Research Centre\n" +
                "Address: 1st Cross, Shankara Matt Premises\n Shankarapuram, Basavanagudi, Bengaluru, Karnataka 560004\n" +
                "Phone: 080 2698 1101");
        arraylist1.add("Regional Cancer Centre\n" +
                "Address: Medical College Campus, Chalakkuzhi, Thiruvananthapuram, Kerala 695011\n" +
                "Phone: 0471 244 2541");
        arraylist1.add("Nargis Dutt Memorial Cancer Hospital\n" +
                "Shri Navalmal Firodia Memorial\n" +
                "Linear Accelerator and Diagnostic Center\n" +
                "Support – Tata Memorial Center\n" +
                "Agalgaon Road, BARSHI – 413 401\n" +
                "Dist. Solapur,Maharashtra,India\n" +
                "Mob - +91 7709 825 889\n" +
                "Tel - +91 2184222699");
        arraylist1.add("Acharya Harihar Regional Cancer Centre\n" +
                "Address: Professors Colony, Cuttack, Odisha 753007\n" +
                "Phone: 0671 230 3780");
        arraylist1.add("Cancer Institute(WIA)\n" +
                "Sardar Patel Road, Adyar,\n" +
                "Chennai - 600 020\n" +
                "Phone No-044 22209150");
        arraylist1.add("MNJ Institute of Oncology & Regional Cancer Centre,\n" +
                "Red Hills, Lakadikapul,\n" +
                "Hyderabad 500004\n" +
                "TELANGANA - INDIA\n" +
                "Phone: 040-23318422 / 414 / 424 / 23397000 \n" +
                "Telefax: 040-23314063\n" +
                "E-Mail: director@mnjiorcc.org");

        ArrayList<String> arraylist2 = new ArrayList<String>();
        arraylist2.add("The Gujarat Cancer & Research Institute\n" +
                "Civil Hospital Campus, Asarwa, \n" +
                "Ahmedabad-380 016. \n" +
                "Gujarat, INDIA \n" +
                "Phone :+91-79- 2268 8000 (Hunting) \n" +
                "Fax : +91-79-2268 5490\n" +
                "E-mail : gcriad1@bsnl.in / contact@gcriindia.org\n" +
                "Website : www.gcriindia.org");
        arraylist2.add("Jawaharlal Nehru Cancer Hospital and Reasearch Centre\n" +
                "Idgah Hills, P.B. No. 32, Bhopal - 462 001 (M.P.)\n" +
                "Ph. 2665720, 2666374 ,4255680, 4255682  Fax: (0755) 2738 325    \n" +
                "Email: jnchcancer@gmail.com");
        arraylist2.add("Bhagwan Mahaveer Cancer Hospital and Research Centre\n" +
                "Jawahar Lal Nehru Marg, Jaipur 302017, India\n" +
                "Phone No: 91-141-2700107, 2702106, 2702120, 2702899,\n" +
                "Emergency Toll Free No :1800-121-1711\n" +
                "Fax No: 91-141-2702021\n" +
                "Email: info@bmchrc.org, bmchrc@hotmail.com | www.bmchrc.org");

        ArrayList<String> arraylist3 = new ArrayList<String>();
        arraylist3.add("North east cancer hospital and research institute\n" +
                " NECHRI (North East Cancer Hospital & Research Institute)\n" +
                "11th Mile, Amerigog, Jorabat, G.S Road\n" +
                "Guwahati:-781023\n" +
                "Assam, India");
        arraylist3.add("Mahavir Cancer Sansthan & Research Centre (MCSRC)\n" +
                "Phulwarisharif, Patna - 801505\n" +
                "Phone No: +91 - 612 - 2250127 / 2253956/ 3222583 \n" +
                "Fax No: +91 – 612 – 2253957, \n" +
                "E-Mail: mcspatna98@gmail.com, directormahavircancersansthan@gmail.com");
        arraylist3.add("Meherbai Tata memorial Hospital\n" +
                "Stocking Road, Northern Town,\n" +
                "Bistupur, Jamshedpur, Jharkhand\n" +
                "INDIA - 831001\n" +"Phone: +91 657 2427933, 2427944\n" +
                "Internal Phone: 0657 2143311 ");
        arraylist3.add("Chittaranjan National Cancer Institute\n" +
                "37,S.P.Mukherjee Road,Kolkata-700 026.INDIA\n" +
                "Tel :(Off.)2475-9313/2475-8057\n" +
                "(EPABX) :2476-5101,5102,5104\n" +
                "Fax : 91-33-2475-7606\n" +
                "Email : cncist@giascl01.vsnl.net.in\n" +
                "cncinst@vsnl.com");

        adaptor = new HospitalsListAdaptor(Hospitals_list.this, arraylist0);
        adaptor1 = new HospitalsListAdaptor(Hospitals_list.this, arraylist1);
        adaptor2 = new HospitalsListAdaptor(Hospitals_list.this, arraylist2);
        adaptor3 = new HospitalsListAdaptor(Hospitals_list.this, arraylist3);
        hosp.setAdapter(adaptor);
        hosp1.setAdapter(adaptor1);
        hosp2.setAdapter(adaptor2);
        hosp3.setAdapter(adaptor3);
    }

    class HospitalsListAdaptor extends RecyclerView.Adapter<HospitalsListAdaptor.MyViewHolder> {

        ArrayList<String> data;
        Context context;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView title;

            public MyViewHolder(View view) {
                super(view);
                title = (TextView) view.findViewById(R.id.hosp_desc);
            }
        }
        public HospitalsListAdaptor(Context mcontext, ArrayList<String> arraylist) {
            this.context = mcontext;
            this.data = arraylist;
        }

        @Override
        public MyViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.hospital_list_item, parent, false);

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
        getMenuInflater().inflate(R.menu.menu_hospitals_list, menu);
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
