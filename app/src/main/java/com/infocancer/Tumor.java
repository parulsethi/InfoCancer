package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Tumor extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tumor);

        TextView bdesc1 = (TextView) findViewById(R.id.b_desc1);
        TextView bdesc2 = (TextView) findViewById(R.id.b_desc2);
        TextView mdesc1 = (TextView) findViewById(R.id.m_desc1);
        TextView mdesc2 = (TextView) findViewById(R.id.m_desc2);
        bdesc1.setText("If you are told your tumor is benign, that means it is not cancerous. It is similar to cancer because the growth is a result of abnormal cells. However, unlike cancer, it is unable to spread to other areas of the body (such as the brain or lungs) and it does not affect nearby tissue. It is a contained mass that stays where it grows.\n" + "\n" + "On its own, a benign tumor is not dangerous. However, the location of the tumor is what poses the threat. If the mass puts pressure on a primary nerve, a main artery, or compresses brain matter, even a benign tumor can cause serious problems.");
        bdesc2.setText("Some suspected causes of benign tumors include a traumatic injury at the tumor location, chronic inflammation (or long-term stress that leads to inflammation), an undetected infection, or diet.\n" + "\n" + "Most Common Types of Benign Tumors:\n" + "\n" + "Adenomas (epithelial tissue that covers the organs and glands)\n" + "Meningiomas (brain and spinal cord)\n" + "Fibromas or fibroids (connective tissue of any organ, most commonly found in the uterus)\n" + "Papillomas (skin, breast, cervix, and mucus membranes)\n" + "Lipomas (fat cells)\n" + "Nevi (moles)\n"+"\n"+"Benign tumors are often surrounded by a protective sac, a mechanism performed by your immune system, that segregates it from the rest of your body and enables it to be easily removed.\n");
        mdesc1.setText("If your doctor determines that you have a malignant tumor, that means the mass is cancerous. The word malignant is Latin for badly born. This type of tumor has the ability to multiply uncontrollably, to metastasize (spread) to various parts of the body and invade surrounding tissue.\n" + "\n" + "Malignant tumors are formed from abnormal cells that are highly unstable and travel via the blood stream, circulatory system and lymphatic system. Malignant cells do not have chemical adhesion molecules to anchor  them to the original growth site that benign tumors possess.");
        mdesc2.setText("There are many suspected causes of cancer, some are widely accepted by the medical community while others are not. Obesity, smoking, alcohol consumption, poor diet, environmental pollution, heavy metal exposure and household toxins are a few culprits that may lead to cancer in your body.\n" + "\n" + "Most Common Types of Malignant Tumors:\n" + "\n" + "Sarcomas (connective tissues such as muscle, tendon, fat, and cartilage)\n" + "Carcinomas (organs and gland tissue such as the breast, cervix, prostate, lung, and thyroid)\n" + "Malignant tumors may not have symptoms initially and the first indication that something isn't right may be the detection of a painless lump. These types of tumors are elastic, which enables them to grow fairly large before they are detected.\n" + "\n" + "As they grow and begin to press against organs, blood vessels and nerves, pain and general soreness at the site may occur.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tumor, menu);
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
