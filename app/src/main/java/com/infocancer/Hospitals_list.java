package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Hospitals_list extends ActionBarActivity {

    TextView aims2,aims3,rgci2,rgci3,apollo2,apollo3,dharam2,dharam3,irch2,irch3,fortis2,fortis3,action2,action3,blk2,blk3,max2,max3,dsc2,dsc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals_list);

        aims2 = (TextView) findViewById(R.id.aiims2);
        aims3 = (TextView) findViewById(R.id.aiims3);
        rgci2 = (TextView) findViewById(R.id.rgci2);
        rgci3 = (TextView) findViewById(R.id.rgci3);
        apollo2 = (TextView) findViewById(R.id.apollo2);
        apollo3 = (TextView) findViewById(R.id.apollo3);
        dharam2 = (TextView) findViewById(R.id.dharam2);
        dharam3 = (TextView) findViewById(R.id.dharam3);
        irch2 = (TextView) findViewById(R.id.irch2);
        irch3 = (TextView) findViewById(R.id.irch3);
        fortis2 = (TextView) findViewById(R.id.fortis2);
        fortis3 = (TextView) findViewById(R.id.fortis3);
        action2 = (TextView) findViewById(R.id.action2);
        action3 = (TextView) findViewById(R.id.action3);
        blk2 = (TextView) findViewById(R.id.blk2);
        blk3 = (TextView) findViewById(R.id.blk3);
        max2 = (TextView) findViewById(R.id.max2);
        max3 = (TextView) findViewById(R.id.max3);
        dsc2 = (TextView) findViewById(R.id.dsc2);
        dsc3 = (TextView) findViewById(R.id.dsc3);

        aims2.setText("AIIMS\nSector – IRCH, Ansari Nagar East, New Delhi, Delhi, India\n" + "Phone – +91 11 2658 8500\n" + "Website:http://www.aiims.edu\n");
        aims3.setText("AIIMS is one of the best hospitals in India for treatment of cancer. The department of Surgical Oncology in AIIMS offers both outpatient and inpatient services for screening , diagnosis and treatment of cancer patients . Their cancer department offers both minor and major operation theater services including endoscopy for various kinds of cancer. On an average 3,500 to 4000 minor and major surgical procedures are performed every year. In addition to patient care the Surgical Oncology department is actively involved in teaching and research activities also .The department offers advanced training for surgical post graduates in the field of surgical oncology.");
        rgci2.setText("Rajiv Gandhi Cancer Institute\nSector – 5, Rohini\n" + "Delhi – 110 085\n" + "Website:http://www.rgcirc.org/\n");
        rgci3.setText("The Rajiv Gandhi Cancer Institute is a nonprofit institution that fully dedicates to treating cancer patients. You have patients coming here to treat and eliminate cancer with specialized treatment procedures. It has a team of highly qualified and experienced oncology team who look into treating the patients. Apart for the Cancer care they also have a research wing which look into finding the cause, symptoms and finally getting a cure for the disease. It is accredited by the NABH and NABL. Some of its achievements include the Greentech Environmental Excellence Award and the Golden Peacock Award for Environment Excellence.");
        apollo2.setText("Apollo Hospital\n" + "Sarita Vihar, Delhi Mathura Road,\n" + "New Delhi – 110076 (INDIA)\n" + "Phone No: + 91 – 11 – 2692 5858 / 2692 5801\n" + "Email ID: assistance@apollohospitalsdelhi.com,\n" + "Website: http://www.apollohospdelhi.com/cancer-care-institute-overview\n");
        apollo3.setText("The Indraprastha Apollo Hospital uses the latest and the advanced technology to combat cancer. It’s infrastructural facilities and support services include cytology, hematology, clinical genetics pathology, flowcytometry, hyperbaric oxygen unit, histopathology. Some of the radiology services including PET-CT, cath lab, physiotherapy, blood bank and many more. There is a Psycho-oncological counseling services that helps patients to be prepared for the treatment and even help them adjust with side effects.");
        dharam2.setText("Dharamshila Hospital and Research Centre\n" + "Near New Ashok Nagar Metro Station,\n" + "Vasundhara Enclave, Delhi – 110096\n" + "Tel: 011 – 43066353\n" + "Fax: 011 – 22617770 / 22619033 / 22618574\n" + "Email: contact@dhrc.in\n" + "Official website\n");
        dharam3.setText("Dharamshila Cancer Foundation and Research Centre was found in the year 1990 and up till today it continues offer cancer treatment to all its patients. It’s accredited by the NABH and the treatment procedures are highly advanced and up to date. The trained medical professional provide preventive, diagnostic, therapeutic and rehabilitative services for its patients. They also offer full time Doctorate courses in DNB Medical Oncology, DNB Surgical Oncology and Post Basic Diploma in Oncology Nursing.");
        irch2.setText("Institute Rotary Cancer Hospital  (I.R.C.H.)\n" + "Ansari Nagar\n" + "New Delhi- 110029\n");
        irch3.setText("This center started off in 1983-84 with a limited infrastructure but in 2003 it has been converted into 7 floor building with better facilities. It has a highly qualified team working with most advanced technology for the treatment. Radio therapy, intensity modulated radio therapy and advanced mammography are used at this Cancer hospital. It was one of the first hospitals to introduce the hematopoietic stem cell bone marrow transplant programme. The hospital also has a research department which does a study to prevent and also stop the cancer from progressing back.");
        action2.setText("Action Cancer Hospital\n" + "A – 4, Paschim Vihar\n" + "New Delhi – 110063\n" + "Tel.: +91-11-49222222\n" + "Fax. : + 91-11-4502 4287\n" + "Email: – ach@actioncancerhospital.com\n");
        action3.setText("Action Cancer Hospital looks to provide systematic diagnosis and treatment for cancer patients. Their treatment procedures include the chemotherapy, hormonal therapy,  targeted therapies, supportive care and bone marrow transplantation. They also run a supportive care clinic that looks to offer pain management and means to deal with side effects of treatment.");
        blk2.setText("BLK Super Specialty Hospital\n" + "Pusa Road, Karol Bagh\n" + "New Delhi-110005\n" + "International Helpline- 0091 -901-541-3040\n" + "Helpline- +91 -11-3040 3040\n");
        blk3.setText("BLK has the one best infrastructural facilities and most modern technology for cancer treatment. The treatment procedures include chemotherapy, targeted therapies and hormonal therapy. The cancer center has a team of highly qualified team that takes adequate efforts to diagnose and provide the appropriate treatment procedure for its patients. Some of the highlights of the hospital include Cyber-knife VSI, latest PET CT Scan, Trilogy Tx Linear Accelerator ,IGRT, IMRT, 3DCRT and Stereotactic RT");
        max2.setText("Max Super Speciality Hospital\n" + "Enclave Road, Saket\n" + "New Delhi 110 017\n" + "Phone: +91 11 2651 5050\n" + "Fax: +91 11 2651 0050\n" + "Emergency No : +91 11 4055 4055\n" + "Appointment Helpline No: 8860 444 888\n");
        max3.setText("Max HealthCare has a dedicated team which looks into the diagnosis and treatment of cancer patients. The oncology department is specialized in this field and aims to provide a comprehensive treatment under one roof. It follows the international cancer treatment protocols and has one of the advanced treatment procedures.");
        dsc2.setText("Delhi State Cancer Institute\n" + "Dilshad Garden, Delhi 110 095 (India)\n" + "Phone: +91-11-2213 5700\n" + "Tele Fax: +91-11-2211 0505\n" + "E-mail: dsci.delhi@yahoo.co.in\n");
        dsc3.setText("This institute offers a comprehensive plan to help patients who seek cancer treatments. It was established by the Government of NCT of Delhi and has a team of highly qualified oncologists. Highly advanced equipment’s with the latest technology help to diagnose and find an effective cure for cancer.");
        fortis2.setText("Fortis Flt. Lt. RajanDhall Hospital\n" + "Sector B, Pocket 1 Aruna Asaf Ali Marg,\n" + "Vasant Kunj ,New Delhi, 110070\n" + "Email:enquiries@fortishealthcare.com\n" + "Fax:+91 11 4277 6221\n");
        fortis3.setText("The Fortis healthcare looks into the diagnosis, prevention and rehabilitation programs for the cancer patients. The medical professionals are specialized in Medical Oncology, Surgical Oncology and Radiation Therapy.You can be also assured that the treatment is done with latest and most advanced technology available up to date.");
    }

    public void togggle_content1(View v){
        aims3.setVisibility(aims3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content2(View v){
        rgci3.setVisibility(rgci3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content3(View v){
        apollo3.setVisibility(apollo3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content4(View v){
        dharam3.setVisibility(dharam3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content5(View v){
        irch3.setVisibility(irch3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content6(View v){
        fortis3.setVisibility(fortis3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content7(View v){
        action3.setVisibility(action3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content8(View v){
        blk3.setVisibility(blk3.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void togggle_content9(View v){
        max3.setVisibility(max3.isShown()
                ? View.GONE
                : View.VISIBLE);
    }

    public void togggle_content10(View v){
        dsc3.setVisibility(v.isShown()
                ? View.GONE
                : View.VISIBLE );
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
