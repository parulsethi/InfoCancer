package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Diet extends ActionBarActivity {
    TextView garlic,turmeric,pomegranate,tomato,beans,grapes,kale,berry,brocolli,ginger,dates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        garlic = (TextView) findViewById(R.id.d_garlic);
        turmeric = (TextView) findViewById(R.id.d_turmeric);
        pomegranate = (TextView) findViewById(R.id.d_pomegranate);
        tomato = (TextView) findViewById(R.id.d_tomato);
        beans = (TextView) findViewById(R.id.d_beans);
        grapes = (TextView) findViewById(R.id.d_grapes);
        kale = (TextView) findViewById(R.id.d_kale);
        berry = (TextView) findViewById(R.id.d_berry);
        brocolli = (TextView) findViewById(R.id.d_brocolli);
        ginger = (TextView) findViewById(R.id.d_ginger);
        dates = (TextView) findViewById(R.id.d_dates);

        garlic.setText("Garlic contains sulfur compounds that may stimulate the immune system’s natural defenses against cancer, and may have the potential to reduce tumor growth. Studies suggest that garlic can reduce the incidence of stomach cancer by as much as a factor of 12!");
        turmeric.setText("Turmeric is the yellow-colored spice found in curry powder. Curcumin, the active ingredient in turmeric, functions as both an anti-inflammatory and an antioxidant, and it may help prevent cancer by interfering with aspects of cellular signaling. In laboratory animals, curcumin has been shown to help prevent cancer of the breast, colon, stomach, liver, and lung.");
        pomegranate.setText("Researchers at UCLA measured levels of patients' prostate-specific antigen (PSA), which help indicate the presence of cancer. They found that drinking 8 ounces of pomegranate juice daily significantly slowed rising PSA levels in patients previously treated for the disease.");
        tomato.setText("This juicy fruit is the best dietary source of lycopene, a carotenoid that gives tomatoes their red hue, Béliveau says. And that's good news, because lycopene was found to stop endometrial cancer cell growth in a study inNutrition and Cancer. Endometrial cancer causes nearly 8,000 deaths a year. \n" + "\n" + "Helps fight: endometrial, lung, prostate, and stomach cancers \n");
        beans.setText("A study out of Michigan State University found that black and navy beans significantly reduced colon cancer incidence in rats, in part because a diet rich in the legumes increased levels of the fatty acid butyrate, which in high concentrations has protective effects against cancer growth. Another study, in the journal Crop Science, found dried beans particularly effective in preventing breast cancer in rats. \n" + "\n" + "Helps fight: breast and colon cancers \n");
        grapes.setText("The skin of red grapes contains resveratrol, a potent phytochemical that is linked to a reduction in cancer, as well as heart disease and stroke. Grapes also contain ellagic acid, which is thought to protect lungs against environmental toxins.");
        kale.setText("Bioflavonoids, carotenoids, and other cancer-fighting compounds are abundant in cooking greens. They also contain indoles, compounds that can lessen the cancer-causing potential of estrogen and induce production of enzymes that protect against disease. ");
        berry.setText("All berries are packed with cancer-fighting phytonutrients. But black raspberries, in particular, contain very high concentrations of phytochemicals called anthocyanins, which slow down the growth of premalignant cells and keep new blood vessels from forming (and potentially feeding a cancerous tumor), according to Gary D. Stoner, PhD, a professor of internal medicine at The Ohio State University College of Medicine. \n" + "\n" + "Helps fight: colon, esophageal, oral, and skin cancers");
        brocolli.setText("All cruciferous veggies (think cauliflower, cabbage, kale) contain cancer-fighting properties, but broccoli is the only one with a sizable amount of sulforaphane, a particularly potent compound that boosts the body's protective enzymes and flushes out cancer-causing chemicals, says Jed Fahey, ScD. A recent University of Michigan study on mice found that sulforaphane also targets cancer stem cells—those that aid in tumor growth. \n" + "\n" + "Helps fight: breast, liver, lung, prostate, skin, stomach, and bladder cancers");
        ginger.setText("A number of studies point to cancer-fighting properties of ginger. In one from the University of Michigan, ginger was found to cause ovarian cancer cells to die; in another, gingerroot supplements reduced inflammation in the colon, which suggested that ginger may have potential as a preventive measure. Tumors induced in laboratory animals grow much more slowly if the animals are pretreated with beta-ionone, a compound found in ginger. Add a slice of ginger to tea as it brews, sprinkle chopped candied ginger over morning oatmeal, or stir a heaping spoonful of grated ginger into mashed sweet potatoes.");
        dates.setText("Dates are higher in total polyphenols than any of the most commonly consumed fruits or vegetables, according to the USDA. The reason? They grow in deserts, and the harsh environment causes polyphenols to provide protection from oxidative stress to the palm's fruit. The polyphenols, along with vitamin B6 and fiber, may help prevent certain types of cancer.");

    }

    public void tog_contentga(View v){
        garlic.setVisibility(garlic.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contenttu(View v){
        turmeric.setVisibility(turmeric.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentpo(View v){
        pomegranate.setVisibility(pomegranate.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentto(View v){
        tomato.setVisibility(tomato.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentbe(View v){
        beans.setVisibility(beans.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentgr(View v){
        grapes.setVisibility(grapes.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentka(View v){
        kale.setVisibility(kale.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentber(View v){
        berry.setVisibility(berry.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentbr(View v){
        brocolli.setVisibility(brocolli.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentgi(View v){
        ginger.setVisibility(ginger.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void tog_contentda(View v){
        dates.setVisibility(dates.isShown()
                ? View.GONE
                : View.VISIBLE );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_diet, menu);
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
