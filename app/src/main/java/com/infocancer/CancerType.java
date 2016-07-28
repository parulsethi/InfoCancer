package com.infocancer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class CancerType extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancer_type);

        TextView desc1 = (TextView) findViewById(R.id.ctdesc1);
        ImageView img = (ImageView) findViewById(R.id.type_diagram);
        TextView desc2 = (TextView) findViewById(R.id.ctdesc2);

        Intent intent = getIntent();
        String typ = intent.getStringExtra(Types.type);
        if (typ.equals("breast")) {
            desc1.setText("Breast cancer starts when cells in the breast begin to grow out of control. These cells usually form a tumor that can often be seen on an x-ray or felt as a lump. The tumor is malignant (cancerous) if the cells can grow into (invade) surrounding tissues or spread (metastasize) to distant areas of the body. Breast cancer occurs almost entirely in women, but men can get it, too.");
            desc2.setText("Breast cancers can start from different parts of the breast. Most breast cancers begin in the ducts that carry milk to the nipple (ductal cancers). Some start in the glands that make breast milk (lobular cancers).There are also other types of breast cancer that are less common.\n" + "\n" + "A small number of cancers start in other tissues in the breast. These cancers are called sarcomas and lymphomas and are not really thought of as breast cancers.\n" + "\n" + "Although many types of breast cancer can cause a lump in the breast, not all do. There are other symptoms of breast cancer you should watch out for and report to a health care provider.\n" + "\n" + "It's also important to understand that most breast lumps are not cancer, they are benign. Benign breast tumors are abnormal growths, but they do not spread outside of the breast and they are not life threatening. But some benign breast lumps can increase a woman's risk of getting breast cancer. Any breast lump or change needs to be checked by a health care provider to determine whether it is benign or cancer, and whether it might impact your future cancer risk. ");
            img.setImageResource(R.drawable.dbreast);
        }
        if (typ.equals("colon")) {
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dcolon);
        }
        if (typ.equals("mouth")){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dmouth);
        }
        if (typ.equals("cervical")){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dcervical);
        }
        if (typ.equals("prostate")){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dprostate);
        }
        if (typ.equals("stomach")){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dstomach);
        }
        if (typ.equals("lung")){
            desc1.setText("");
            desc2.setText("");
            img.setImageResource(R.drawable.dlung);
        }
        if (typ.equals("skin")){
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
