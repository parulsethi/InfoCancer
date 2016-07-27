package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hcolon extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
            "Maintain a healthy weight.",
            "Exercise most days of the week.",
            "Stop smoking.",
            "Drink alcohol in moderation, if at all.",
            "Eat a variety of fruits, vegetables and whole grains."
    };

    String[] description = {
            "If you are at a healthy weight, work to maintain your weight by combining a healthy diet with daily exercise. If you need to lose weight, ask your doctor about healthy ways to achieve your goal. Aim to lose weight slowly by increasing the amount of exercise you get and reducing the number of calories you eat.",
            "Try to get at least 30 minutes of exercise on most days. If you've been inactive, start slowly and build up gradually to 30 minutes. Also, talk to your doctor before starting any exercise program.",
            "Talk to your doctor about ways to quit that may work for you.",
            "If you choose to drink alcohol, limit the amount of alcohol you drink to no more than one drink a day for women and two for men.",
            "Fruits, vegetables and whole grains contain vitamins, minerals, fiber and antioxidants, which may play a role in cancer prevention. Choose a variety of fruits and vegetables so that you get an array of vitamins and nutrients."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcolon);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htcolon);
        healthtips.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hcolon, menu);
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
