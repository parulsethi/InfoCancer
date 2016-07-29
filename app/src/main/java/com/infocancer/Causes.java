package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Causes extends ActionBarActivity {

    TextView obesity;
    TextView smoking;
    TextView diet;
    TextView workplace;
    TextView pollution;
    TextView alcohol;
    TextView genes;
    TextView hpv;
    TextView sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_causes);

        obesity = (TextView) findViewById(R.id.c_obesity);
        smoking = (TextView) findViewById(R.id.c_smoking);
        diet = (TextView) findViewById(R.id.c_diet);
        workplace = (TextView) findViewById(R.id.c_workplace);
        pollution = (TextView) findViewById(R.id.c_pollution);
        alcohol = (TextView) findViewById(R.id.c_alcohol);
        genes = (TextView) findViewById(R.id.c_genes);
        hpv = (TextView) findViewById(R.id.c_hpv);
        sun = (TextView) findViewById(R.id.c_sun);

        smoking.setText("Smoking is by far the biggest preventable cause of cancer. Thanks to years of research, the links between smoking and cancer are now very clear. Smoking accounts for more than 1 in 4 UK cancer deaths, and nearly a fifth of all cancer cases.\n" + "\n" + "Tobacco was responsible for more than 100 million deaths worldwide in the 20th Century. The World Health Organisation has estimated that, if current trends continue, tobacco could cause a billion deaths in the 21st Century.\n" + "\n" + "How does smoking cause cancer?\n" + "The main way that smoking causes cancer is by damaging our DNA, including key genes that protect us against cancer. Many of the chemicals found in cigarettes have been shown to cause DNA damage, including benzene, polonium-210, benzo(a)pyrene and nitrosamines.\n" + "\n" + "This is already bad news, but it’s made worse by other chemicals in cigarettes. For example chromium makes poisons like benzo(a)pyrene stick more strongly to DNA, increasing the chances of serious damage. And chemicals like arsenic and nickel interfere with pathways for repairing damaged DNA. This makes it even more likely that damaged cells will eventually turn cancerous.\n" + "\n");
        obesity.setText("Extra fat in the body can have harmful effects, like producing hormones and growth factors that affect the way our cells work. This can raise the risk of several diseases, including cancer. It's thought that more than 1 in 20 cancers in the UK are linked to being overweight or obese.\n" + "Research has shown that many types of cancer are more common in people who are overweight or obese, including:\n" + "\n" + "breast cancer, in women after the menopause\n" + "bowel cancer\n" + "womb cancer\n" + "oesophageal (food pipe) cancer\n" + "gastric cardia cancer (a type of stomach cancer)\n" + "pancreatic cancer\n" + "kidney cancer\n" + "liver\n" + "probably - gallbladder, ovarian and aggressive prostate cancers\n" + "\n" + "Why is being overweight linked to so many different types of cancer?\n" + "Fat cells in the body are active and produce hormones and proteins that are released into the bloodstream and carried around the body. Because they are spread through the circulation, these 'chemical messengers' can affect many parts of the body, and increase the risk of several different types of cancer.\n" + "\n" + "Fat cells can also attract immune cells to body tissues. These immune cells release chemicals that cause long-lasting inflammation which can raise the risk of cancer.\n" + "\n" + "\n");
        diet.setText("Eating lots of red or processed meat increases the risk of bowel cancer. Red meat includes all fresh, minced and frozen beef, pork and lamb. Processed meat includes ham, bacon, salami and sausages.\n" + "\n" + "Around a quarter of bowel cancer cases in men, and around a sixth in women, are linked to eating red or processed meat. Bowel cancer risk increases by more than a quarter (28%) for every 120g of red meat eaten per day, and by almost a tenth (9%) for every 30g of processed meat eaten per day. Processed meat is more strongly linked to cancer risk than red meat.\n" + "\n" + "There is growing evidence that links red meat to pancreatic cancer and stomach cancer. The EPIC study found that eating lots of meat, particularly red and processed meat could also increase the risk of stomach cancer - people eating over 100g of meat a day had over 3 times the risk of getting stomach cancer 39. Another very large study found that people who eat the most red or processed meat have 40-50% higher risk of pancreatic cancer\n" + "\n");
        alcohol.setText("The less alcohol you drink, the lower the risk of cancer.  No type of alcohol is better or worse than another, it is the alcohol itself that leads to the damage, regardless of whether it is in wine, beer or spirits. And drinking and smoking together are even worse for you.\n"+"\n"+"Which is worse: binge drinking or spreading my drinking across the week?\n" + "Research has looked mainly at the amount of alcohol people drink in total and the effect on cancer risk. Drinking alcohol increases the risk of cancer whether you drink it all in one go or a bit at a time.\n" + "\n" + "How much alcohol does it take to increase cancer risk?\n" + "There's no safe limit for alcohol when it comes to cancer, but the risk is smaller for people who drink within the government guidelines.\n" + "\n" + "Regularly drinking up to a pint of premium lager or a large glass of wine a day can increase the risk of mouth, throat, oesophageal (foodpipe), breast and bowel cancers. They both include about 3 units of alcohol.\n" + "\n" + "Each unit of alcohol has a weaker effect on the risk of breast cancer than on cancers of the head and neck, but because breast cancer is the most common cancer in the UK and because so many women drink small amounts of alcohol regularly, a large number of women are affected - around 3,200 cases of breast cancer each year in the UK are linked to alcohol.\n" + "\n");
        workplace.setText("");
        pollution.setText("");
        genes.setText("");
        hpv.setText("");
        sun.setText("");


        CardView csmoking = (CardView) findViewById(R.id.sm);
        CardView cobesity = (CardView) findViewById(R.id.ob);
        CardView calcohol = (CardView) findViewById(R.id.al);
        CardView cdiet = (CardView) findViewById(R.id.di);
        CardView cworkplace = (CardView) findViewById(R.id.wo);
        CardView cpollution = (CardView) findViewById(R.id.po);
        CardView cgenes = (CardView) findViewById(R.id.ge);
        CardView chpv = (CardView) findViewById(R.id.hp);
        CardView csun = (CardView) findViewById(R.id.su);



        cobesity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (obesity.getVisibility() == View.VISIBLE)
                    obesity.setVisibility(View.GONE);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_causes, menu);
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
