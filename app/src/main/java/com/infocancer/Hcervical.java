package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hcervical extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
            "Get vaccinated against HPV.",
            "Have routine Pap tests.",
            "Practice safe sex.",
            "Don't smoke."
    };

    String[] description = {
            "Vaccination is available for girls and women ages 9 to 26. The vaccine is most effective if given to girls before they become sexually active.",
            "Pap tests can detect precancerous conditions of the cervix, so they can be monitored or treated in order to prevent cervical cancer. Most medical organizations suggest women begin routine Pap tests at age 21 and repeat them every few years.",
            "Using a condom, having fewer sexual partners and delaying intercourse may reduce your risk of cervical cancer.",
            "If you smoke, quit. If you don't smoke, don't start.Smoking increases your risk of cervical cancer, as well as many other types of cancer."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hcervical);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htcervical);
        healthtips.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hcervical, menu);
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
