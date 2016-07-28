package com.infocancer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;


public class HealthTips extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tips);

        ImageButton breast = (ImageButton) findViewById(R.id.cbreast);
        ImageButton cervical = (ImageButton) findViewById(R.id.ccervical);
        ImageButton colon = (ImageButton) findViewById(R.id.ccolon);
        ImageButton lung = (ImageButton) findViewById(R.id.clung);
        ImageButton mouth = (ImageButton) findViewById(R.id.cmouth);
        ImageButton prostate = (ImageButton) findViewById(R.id.cprostate);
        ImageButton skin = (ImageButton) findViewById(R.id.cskin);
        ImageButton stomach = (ImageButton) findViewById(R.id.cstomach);

        breast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hbreast.class);
                startActivity(intent);
            }
        });
        cervical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hcervical.class);
                startActivity(intent);
            }
        });
        colon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hcolon.class);
                startActivity(intent);
            }
        });
        lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hlung.class);
                startActivity(intent);
            }
        });
        mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hmouth.class);
                startActivity(intent);
            }
        });
        prostate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hprostate.class);
                startActivity(intent);
            }
        });
        skin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hskin.class);
                startActivity(intent);
            }
        });
        stomach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Hstomach.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_health_tips, menu);
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
