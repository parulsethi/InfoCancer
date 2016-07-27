package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hmouth extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
            "Stop using tobacco or don't start.",
            "Drink alcohol only in moderation, if at all.",
            "Eat a variety of fruits and vegetables.",
            "Avoid excessive sun exposure to your lips.",
            "See your dentist regularly."
    };
    String[] description = {
            "If you use tobacco, stop. If you don't use tobacco, don't start. Using tobacco, whether smoked or chewed, exposes the cells in your mouth to dangerous cancer-causing chemicals",
            "Chronic excessive alcohol use can irritate the cells in your mouth, making them vulnerable to mouth cancer. If you choose to drink alcohol, limit yourself to one drink a day if you're a woman or two drinks a day if you're a man.",
            "Choose a diet rich in fruits and vegetables. The vitamins and antioxidants found in fruits and vegetables may help reduce your risk of mouth cancer.",
            "Protect the skin on your lips from the sun by staying in the shade when possible. Wear a broad-brimmed hat that effectively shades your entire face, including your mouth. Apply a sunscreen lip product as part of your routine sun protection regimen.",
            "As part of a routine dental exam, ask your dentist to inspect your entire mouth for abnormal areas that may indicate mouth cancer or precancerous changes."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmouth);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htmouth);
        healthtips.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hmouth, menu);
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

