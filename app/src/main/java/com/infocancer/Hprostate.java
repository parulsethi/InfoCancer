package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hprostate extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
            "Choose a healthy diet full of fruits and vegetables.",
            "Choose healthy foods over supplements.",
            "Exercise most days of the week.",
            "Maintain a healthy weight.",
            "Talk to your doctor about increased risk of prostate cancer."
    };
    String[] description = {
            "Avoid high-fat foods and instead focus on choosing a variety of fruits, vegetables and whole grains. Fruits and vegetables contain many vitamins and nutrients that can contribute to your health.",
            "No studies have shown that supplements play a role in reducing your risk of prostate cancer. Instead, choose foods that are rich in vitamins and minerals so that you can maintain healthy levels of vitamins in your body.",
            "Exercise improves your overall health, helps you maintain your weight and improves your mood. There is some evidence that men who don't exercise have higher PSA levels, while men who exercise may have a lower risk of prostate cancer." + "\n" + "Try to exercise most days of the week. If you're new to exercise, start slow and work your way up to more exercise time each day.",
            "If your current weight is healthy, work to maintain it by exercising most days of the week. If you need to lose weight, add more exercise and reduce the number of calories you eat each day. Ask your doctor for help creating a plan for healthy weight loss.",
            "Men with a high risk of prostate cancer may consider medications or other treatments to reduce their risk. Some studies suggest that taking 5-alpha reductase inhibitors, including finasteride (Propecia, Proscar) and dutasteride (Avodart), may reduce the overall risk of developing prostate cancer. These drugs are used to control prostate gland enlargement and hair loss in men."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hprostate);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htprostate);
        healthtips.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hprostate, menu);
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
