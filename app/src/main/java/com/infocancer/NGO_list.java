package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class NGO_list extends ActionBarActivity {

    TextView ngo1,ngo2,ngo3,ngo4,ngo5,ngo6,ngo7,ngo8,ngo9,ngo10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo_list);

        ngo1 = (TextView) findViewById(R.id.ngo1);
        ngo2 = (TextView) findViewById(R.id.ngo2);
        ngo3 = (TextView) findViewById(R.id.ngo3);
        ngo4 = (TextView) findViewById(R.id.ngo4);
        ngo5 = (TextView) findViewById(R.id.ngo5);
        ngo6 = (TextView) findViewById(R.id.ngo6);
        ngo7 = (TextView) findViewById(R.id.ngo7);
        ngo8 = (TextView) findViewById(R.id.ngo8);
        ngo9 = (TextView) findViewById(R.id.ngo9);


        ngo1.setText("CanSupport\n" + "Kanak Durga Basti Vikas Kendra\n" + "Sector 12, R. K. Puram\n" + "New Delhi ?110022\n" + "Ph. 011?26102851/69\n" + "Email: cansup_india@hotmail.com\n");
        ngo2.setText("Cancer Sahyog\n" +
                "C/o Indian Cancer Society,\n" +
                "Q5A Jangpura Extn.,\n" +
                "New Delhi ? 110014\n" +
                "Phone number: 4319572, 4314907\n");
        ngo3.setText("Mastectomee Association\n" +
                "Sahi Hospital Building,\n" +
                "1A Jangpura Mathura Road,\n" +
                "New Delhi ? 110024\n" +
                "Phone number: 6410962, 6121856, 3019328\n");
        ngo4.setText(" Global Cancer Concern India (GCCI)\n" +
                "S?18/4, DLF Phase III\n" +
                "Gurgaon 122002, Haryana\n" +
                "Phone: 0124?2564473?75\n" +
                "Fax: 0124?2564476\n" +
                "Email: gcci@vsnl.com\n" +
                "Website: www.globalcancer.org\n");
        ngo5.setText("Tej Ram Memorial Cancer Society\n" +
                "28/1, East Punjabi Bagh,\n" +
                "New Delhi\n");
        ngo6.setText("Indian Cancer Society\n" +
                "86/1 GF, Shahpur Jat, New Delhi 110 049\n" +
                "Email: incansoc3_cancer@yahoo.co.in website:\n" +
                "www.indiancancersocietydelhi.in\n" +
                "Tel: +91 11 26499572(O),Telefax: +91 11\n" +
                "26499572\n");
        ngo7.setText("Cancer Patients Aid Association\n" +
                "H/1572, Chittaranjan Park, New Delhi - 110 019\n" +
                "Tel: +91 11 2627 0470 / 2627 2298\n" +
                "E-mail: kiran.hukku@cancer.org.in\n");
        ngo8.setText("CanKids Kidscan\n"+"Address: Vasant Vihar, New Delhi\n"+"Delhi 110057\n" +
                "Phone:011 4166 3670\n");
        ngo9.setText("Cancer Aid Society\n"+"163, Naharpur, Rohini\n"+"Sector 7, Delhi -110085\n" +
                "Email: delhi@canceraidsocietyindia.org\n");


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
