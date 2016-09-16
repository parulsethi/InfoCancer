package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class Hbreast extends ActionBarActivity {

    ListView healthtips;
    String[] tips = {
            "Maintain a healthy weight.",
            "Choose a healthy diet.",
            "Limit postmenopausal hormone therapy.",
            "Exercise most days of the week.",
            "Drink alcohol in moderation, if at all.",
            "Become familiar with your breasts through breast self-exam for breast awareness.",
            "Ask your doctor about breast cancer screening."
    };
    String[] description = {
            "If your weight is healthy, work to maintain that weight. If you need to lose weight, ask your doctor about healthy strategies to accomplish this. Reduce the number of calories you eat each day and slowly increase the amount of exercise.",
            "Women who eat a Mediterranean diet supplemented with extra-virgin olive oil and mixed nuts may have a reduced risk of breast cancer. The Mediterranean diet focuses mostly on plant-based foods, such as fruits and vegetables, whole grains, legumes and nuts. People who follow the Mediterranean diet choose healthy fats, like olive oil, over butter and fish instead of red meat.",
            "Combination hormone therapy may increase the risk of breast cancer. Talk with your doctor about the benefits and risks of hormone therapy." +"\n" + "Some women experience bothersome signs and symptoms during menopause and, for these women, the increased risk of breast cancer may be acceptable in order to relieve menopause signs and symptoms." + "\n" + "To reduce the risk of breast cancer, use the lowest dose of hormone therapy possible for the shortest amount of time.",
            "Aim for at least 30 minutes of exercise on most days of the week. If you haven't been active lately, ask your doctor whether it's OK and start slowly.",
            "Limit the amount of alcohol you drink to less than one drink a day, if you choose to drink.",
            "Women may choose to become familiar with their breasts by occasionally inspecting their breasts during a breast self-exam for breast awareness. If there is a new change, lumps or other unusual signs in your breasts, talk to your doctor promptly." + "\n" +"Breast awareness can't prevent breast cancer, but it may help you to better understand the normal changes that your breasts undergo and identify any unusual signs and symptoms.",
            "Discuss with your doctor when to begin breast cancer screening exams and tests, such as clinical breast exams and mammograms." + "\n" + "Talk to your doctor about the benefits and risks of screening. Together, you can decide what breast cancer screening strategies are right for you."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hbreast);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,tips,description);
        healthtips = (ListView)findViewById(R.id.htbreast);
        healthtips.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hbreast, menu);
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
