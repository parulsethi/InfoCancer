package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hlung extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
        "Don't smoke.",
        "Stop smoking.",
        "Avoid secondhand smoke.",
        "Test your home for radon.",
        "Avoid carcinogens at work.",
        "Eat a diet full of fruits and vegetables.",
        "Exercise most days of the week."
    };
    String[] description = {
            "If you've never smoked, don't start. Talk to your children about not smoking so that they can understand how to avoid this major risk factor for lung cancer. Begin conversations about the dangers of smoking with your children early so that they know how to react to peer pressure.",
            "Stop smoking now. Quitting reduces your risk of lung cancer, even if you've smoked for years. Talk to your doctor about strategies and stop-smoking aids that can help you quit. Options include nicotine replacement products, medications and support groups.",
            "If you live or work with a smoker, urge him or her to quit. At the very least, ask him or her to smoke outside. Avoid areas where people smoke, such as bars and restaurants, and seek out smoke-free options.",
            "Have the radon levels in your home checked, especially if you live in an area where radon is known to be a problem. High radon levels can be remedied to make your home safer. For information on radon testing, contact your local department of public health or a local chapter of the American Lung Association.",
            "Take precautions to protect yourself from exposure to toxic chemicals at work. Follow your employer's precautions. For instance, if you're given a face mask for protection, always wear it. Ask your doctor what more you can do to protect yourself at work. Your risk of lung damage from workplace carcinogens increases if you smoke.",
            "Choose a healthy diet with a variety of fruits and vegetables. Food sources of vitamins and nutrients are best. Avoid taking large doses of vitamins in pill form, as they may be harmful. For instance, researchers hoping to reduce the risk of lung cancer in heavy smokers gave them beta carotene supplements. Results showed the supplements actually increased the risk of cancer in smokers.",
            "If you don't exercise regularly, start out slowly. Try to exercise most days of the week."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hlung);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htlung);
        healthtips.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hlung, menu);
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
