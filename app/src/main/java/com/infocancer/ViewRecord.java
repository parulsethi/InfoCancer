package com.infocancer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;


public class ViewRecord extends ActionBarActivity {

    TextView title,date,doc,diagnose;
    ImageView r,p;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_record);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        intent = getIntent();

        title = (TextView) findViewById(R.id.v_title);
        date = (TextView) findViewById(R.id.v_date);
        doc = (TextView) findViewById(R.id.v_doctor);
        diagnose = (TextView) findViewById(R.id.v_diagnose);
        r = (ImageView) findViewById(R.id.v_report);
        p = (ImageView) findViewById(R.id.v_prescription);

        title.setText(intent.getStringExtra(Records.r_data1));
        date.setText(intent.getStringExtra(Records.r_data2));
        doc.setText(intent.getStringExtra(Records.r_data3));
        diagnose.setText(intent.getStringExtra(Records.r_data4));

        Bitmap bmp1 = BitmapFactory.decodeFile(loadFile(intent.getStringExtra(Records.r_data1)));
        r.setImageBitmap(bmp1);

        Bitmap bmp2 = BitmapFactory.decodeFile(loadFile(intent.getStringExtra(Records.r_data4)));
        p.setImageBitmap(bmp2);
    }

    public String loadFile(String fileName) {
        String sdcardPath = Environment.getExternalStorageDirectory().toString()+"/"+fileName+".jpeg";
        File imgFile = new  File(sdcardPath);
        return imgFile.getAbsolutePath();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_record, menu);
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
