package com.infocancer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class CancerType extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancer_type);

        TextView desc1 = (TextView) findViewById(R.id.desc1);
        ImageView img = (ImageView) findViewById(R.id.type_diagram);
        TextView desc2 = (TextView) findViewById(R.id.desc2);

        Intent intent = getIntent();
        String typ = intent.getStringExtra(Types.type);

        if (typ == "breast") {
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dbreast);
        }
        if (typ == "colon") {
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dcolon);
        }
        if (typ == "mouth"){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dmouth);
        }
        if (typ == "cervical"){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dcervical);
        }
        if (typ == "prostate"){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dprostate);
        }
        if (typ == "stomach"){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dstomach);
        }
        if (typ == "lung"){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dlung);
        }
        if (typ == "skin"){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dskin);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cancer_type, menu);
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
