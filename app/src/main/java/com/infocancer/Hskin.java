package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hskin extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
            "Avoid the sun during the middle of the day. ",
            "Wear sunscreen year-round.",
            "Wear protective clothing.",
            "Avoid tanning beds.",
            "Be aware of sun-sensitizing medications.",
            "Check your skin regularly and report changes to your doctor. "
    };

    String[] description = {
            " For many people in North America, the sun's rays are strongest between about 10 a.m. and 4 p.m. Schedule outdoor activities for other times of the day, even in winter or when the sky is cloudy." + "\n" + "You absorb UV radiation year-round, and clouds offer little protection from damaging rays. Avoiding the sun at its strongest helps you avoid the sunburns and suntans that cause skin damage and increase your risk of developing skin cancer. Sun exposure accumulated over time also may cause skin cancer.",
            "Sunscreens don't filter out all harmful UV radiation, especially the radiation that can lead to melanoma. But they play a major role in an overall sun protection program." + "\n" + "Use a broad-spectrum sunscreen with an SPF of at least 15. Apply sunscreen generously, and reapply every two hours — or more often if you're swimming or perspiring. Use a generous amount of sunscreen on all exposed skin, including your lips, the tips of your ears, and the backs of your hands and neck.",
            "Sunscreens don't provide complete protection from UV rays. So cover your skin with dark, tightly woven clothing that covers your arms and legs, and a broad-brimmed hat, which provides more protection than a baseball cap or visor does." + "\n" + "Some companies also sell photoprotective clothing. A dermatologist can recommend an appropriate brand." + "\n" + "Don't forget sunglasses. Look for those that block both types of UV radiation — UVA and UVB rays.",
            "Lights used in tanning beds emit UV rays and can increase your risk of skin cancer.",
            "Some common prescription and over-the-counter drugs, including antibiotics, can make your skin more sensitive to sunlight." + "\n" + "Ask your doctor or pharmacist about the side effects of any medications you take. If they increase your sensitivity to sunlight, take extra precautions to stay out of the sun in order to protect your skin.",
            "Examine your skin often for new skin growths or changes in existing moles, freckles, bumps and birthmarks." + "\n" + "With the help of mirrors, check your face, neck, ears and scalp. Examine your chest and trunk, and the tops and undersides of your arms and hands. Examine both the front and back of your legs, and your feet, including the soles and the spaces between your toes. Also check your genital area and between your buttocks."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hskin);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htskin);
        healthtips.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hskin, menu);
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
