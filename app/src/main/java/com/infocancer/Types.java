package com.infocancer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Types extends ActionBarActivity {

    public final static String type = "c_type";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);

        Button breast = (Button) findViewById(R.id.tbreast);
        Button cervical = (Button) findViewById(R.id.tcervical);
        Button colon = (Button) findViewById(R.id.tcolon);
        Button lung = (Button) findViewById(R.id.tlung);
        Button mouth = (Button) findViewById(R.id.tmouth);
        Button prostate = (Button) findViewById(R.id.tprostate);
        Button skin = (Button) findViewById(R.id.tskin);
        Button stomach = (Button) findViewById(R.id.tstomach);

        breast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),CancerType.class);
                intent1.putExtra(type,"breast");
                startActivity(intent1);
            }
        });
        cervical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),CancerType.class);
                intent2.putExtra(type,"cervical");
                startActivity(intent2);
            }
        });
        colon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(getApplicationContext(),CancerType.class);
                intent3.putExtra(type,"colon");
                startActivity(intent3);
            }
        });
        stomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(getApplicationContext(),CancerType.class);
                intent4.putExtra(type,"stomach");
                startActivity(intent4);
            }
        });
        mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(getApplicationContext(),CancerType.class);
                intent5.putExtra(type,"mouth");
                startActivity(intent5);
            }
        });
        prostate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(getApplicationContext(), CancerType.class);
                intent6.putExtra(type, "prostate");
                startActivity(intent6);
            }
        });
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getApplicationContext(),CancerType.class);
                intent7.putExtra(type,"lung");
                startActivity(intent7);
            }
        });
        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(getApplicationContext(),CancerType.class);
                intent8.putExtra(type,"skin");
                startActivity(intent8);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_types, menu);
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
