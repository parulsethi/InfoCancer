package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hstomach extends ActionBarActivity {
    
    ListView healthtips;
    String[] tips = {
            "Eat more fruits and vegetables.",
            "Exercise.",
            "Reduce the amount of salty and smoked foods you eat.",
            "Stop smoking.",
            "Ask your doctor about your risk of stomach cancer."
    };

    String[] description = {
            "Try to incorporate more fruits and vegetables into your diet each day. Choose a wide variety of colorful fruits and vegetables.",
            "Regular exercise is associated with a reduced risk of stomach cancer. Try to fit physical activity into your day most days of the week.",
            "Protect your stomach by limiting these foods.",
            "If you smoke, quit. If you don't smoke, don't start.Smoking increases your risk of stomach cancer, as well as many other types of cancer. Quitting smoking can be very difficult, so ask your doctor for help.",
            "Talk with your doctor if you have an increased risk of stomach cancer. Together you may consider periodic endoscopy to look for signs of stomach cancer."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hstomach);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htstomach);
        healthtips.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hstomach, menu);
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
