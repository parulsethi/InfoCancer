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


public class ViewRecord extends ActionBarActivity {

    TextView title,date,doc,diagnose;
    ImageView r,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_record);

        Intent intent = getIntent();
        byte[] ir = intent.getByteArrayExtra(Records.r_data5);
        byte[] ip = intent.getByteArrayExtra(Records.r_data6);

        title.setText(intent.getStringExtra(Records.r_data1));
        date.setText(intent.getStringExtra(Records.r_data2));
        doc.setText(intent.getStringExtra(Records.r_data3));
        diagnose.setText(intent.getStringExtra(Records.r_data4));

        Bitmap bmp1 = BitmapFactory.decodeByteArray(ir, 0,ir.length);
        r.setImageBitmap(bmp1);

        Bitmap bmp2 = BitmapFactory.decodeByteArray(ip, 0, ip.length);
        p.setImageBitmap(bmp2);
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
