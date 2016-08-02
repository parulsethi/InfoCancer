package com.infocancer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;


public class ViewRecord extends ActionBarActivity {

    TextView title,date,doc,diagnose;
    ImageView r,p;
    byte[] ird,ipd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_record);

        title = (TextView) findViewById(R.id.v_title);
        date = (TextView) findViewById(R.id.v_date);
        doc = (TextView) findViewById(R.id.v_doctor);
        diagnose = (TextView) findViewById(R.id.v_diagnose);
        r = (ImageView) findViewById(R.id.v_report);
        p = (ImageView) findViewById(R.id.v_prescription);

        Intent intent = getIntent();
        byte[] ir = intent.getByteArrayExtra(Records.r_data5);
//        byte[] ip = intent.getByteArrayExtra(Records.r_data6);
        title.setText(intent.getStringExtra(Records.r_data1));
        date.setText(intent.getStringExtra(Records.r_data2));
        doc.setText(intent.getStringExtra(Records.r_data3));
        diagnose.setText(intent.getStringExtra(Records.r_data4));

        try {
            ird = decompress(ir);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DataFormatException e) {
            e.printStackTrace();
        }

//        try {
//            ipd = decompress(ip);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (DataFormatException e) {
//            e.printStackTrace();
//        }

        Bitmap bmp1 = BitmapFactory.decodeByteArray(ird,0,ird.length);
        r.setImageBitmap(bmp1);

//        Bitmap bmp2 = BitmapFactory.decodeByteArray(ipd, 0, ipd.length);
//        p.setImageBitmap(bmp2);
    }

    public byte[] decompress(byte[] data) throws IOException, DataFormatException {
        Inflater inflater = new Inflater();
        inflater.setInput(data);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
        byte[] buffer = new byte[1024];
        while (!inflater.finished()) {
            int count = inflater.inflate(buffer);
            outputStream.write(buffer, 0, count);
        }
        outputStream.close();
        byte[] output = outputStream.toByteArray();
        return output;
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
