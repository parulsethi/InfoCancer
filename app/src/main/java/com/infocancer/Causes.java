package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Causes extends ActionBarActivity {

    TextView obesity,smoking,diet,workplace,pollution,alcohol,genes,hpv,sun;

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

        smoking.setText("Smoking is by far the biggest preventable cause of cancer. Thanks to years of research, the links between smoking and cancer are now very clear." + "\n" + "Tobacco was responsible for more than 100 million deaths worldwide in the 20th Century. The World Health Organisation has estimated that, if current trends continue, tobacco could cause a billion deaths in the 21st Century.\n" + "\n" + "How does smoking cause cancer?\n" + "The main way that smoking causes cancer is by damaging our DNA, including key genes that protect us against cancer. Many of the chemicals found in cigarettes have been shown to cause DNA damage, including benzene, polonium-210, benzo(a)pyrene and nitrosamines.\n" + "\n" + "This is already bad news, but it's made worse by other chemicals in cigarettes. For example chromium makes poisons like benzo(a)pyrene stick more strongly to DNA, increasing the chances of serious damage. And chemicals like arsenic and nickel interfere with pathways for repairing damaged DNA. This makes it even more likely that damaged cells will eventually turn cancerous.\n" + "\n");
        obesity.setText("Extra fat in the body can have harmful effects, like producing hormones and growth factors that affect the way our cells work. This can raise the risk of several diseases, including cancer." + "Research has shown that many types of cancer are more common in people who are overweight or obese, including:\n" + "\n" + "breast cancer, in women after the menopause\n" + "bowel cancer\n" + "womb cancer\n" + "oesophageal (food pipe) cancer\n" + "gastric cardia cancer (a type of stomach cancer)\n" + "pancreatic cancer\n" + "kidney cancer\n" + "liver\n" + "probably - gallbladder, ovarian and aggressive prostate cancers\n" + "\n" + "Why is being overweight linked to so many different types of cancer?\n" + "Fat cells in the body are active and produce hormones and proteins that are released into the bloodstream and carried around the body. Because they are spread through the circulation, these 'chemical messengers' can affect many parts of the body, and increase the risk of several different types of cancer.\n" + "\n" + "Fat cells can also attract immune cells to body tissues. These immune cells release chemicals that cause long-lasting inflammation which can raise the risk of cancer.\n" + "\n" + "\n");
        diet.setText("Eating lots of red or processed meat increases the risk of bowel cancer. Red meat includes all fresh, minced and frozen beef, pork and lamb. Processed meat includes ham, bacon, salami and sausages.\n" + "\n" + "Around a quarter of bowel cancer cases in men, and around a sixth in women, are linked to eating red or processed meat. Bowel cancer risk increases by more than a quarter (28%) for every 120g of red meat eaten per day, and by almost a tenth (9%) for every 30g of processed meat eaten per day. Processed meat is more strongly linked to cancer risk than red meat.\n" + "\n" + "There is growing evidence that links red meat to pancreatic cancer and stomach cancer. The EPIC study found that eating lots of meat, particularly red and processed meat could also increase the risk of stomach cancer - people eating over 100g of meat a day had over 3 times the risk of getting stomach cancer 39. Another very large study found that people who eat the most red or processed meat have 40-50% higher risk of pancreatic cancer\n" + "\n");
        alcohol.setText("The less alcohol you drink, the lower the risk of cancer.  No type of alcohol is better or worse than another, it is the alcohol itself that leads to the damage, regardless of whether it is in wine, beer or spirits. And drinking and smoking together are even worse for you.\n"+"\n"+"Which is worse: binge drinking or spreading my drinking across the week?\n" + "Research has looked mainly at the amount of alcohol people drink in total and the effect on cancer risk. Drinking alcohol increases the risk of cancer whether you drink it all in one go or a bit at a time.\n" + "\n" + "How much alcohol does it take to increase cancer risk?\n" + "There's no safe limit for alcohol when it comes to cancer, but the risk is smaller for people who drink within the government guidelines.\n" + "\n" + "Regularly drinking up to a pint of premium lager or a large glass of wine a day can increase the risk of mouth, throat, oesophageal (foodpipe), breast and bowel cancers. They both include about 3 units of alcohol.\n" + "\n");
        workplace.setText("People who work in certain jobs, especially in the manufacturing industry, may have higher risks of cancer because of exposures to some chemicals, radiation, or other aspects of their work.\n"+"But cancer can take many years, or even decades, to develop. So some people may have an increased risk of cancer because they used to work with cancer-causing substances before regulations came into force.\n" +"Types of work that carry a higher risk and some examples of working conditions that may increase the risk include:\n" + "\n" + "Agriculture, forestry and fishing - including too much sun exposure, or chemicals like pesticides.\n" + "Construction and painting - including asbestos, too much sun exposure, silica, diesel engine exhaust, coal products, paint and solvents, or wood dust.\n" + "Manufacturing and mining industries - including exposure to fossil fuels and their by-products (such as mineral oils, coal products, benzene, diesel engine exhaust), asbestos, silica, solvents, radon, or too much sun exposure.\n" + "Service industries - some types of jobs in this industry that could lead to a higher risk include: roles with outdoor  or shift work , household or vehicle repair technicians, or transport (drivers or flight personnel). The types of risks in this industry include too much sun exposure, second-hand smoke , shift work, diesel engine exhaust, or radon.\n" + "\n");
        pollution.setText("Air pollution is associated with an increased risk of lung cancer. Although the increased risk of cancer is small for individuals, because everyone is exposed to some air pollution, it has an important effect across the population as a whole.\n" + "And that there was enough evidence to say that a specific part of air pollution known as PM 2.5 (solid dust-like particles, or 'Particulate Matter', less than 2.5 millionths of a metre across) can cause cancer.\n" + "Indoor air pollution\n" + "Indoor air pollution can have many sources, including fuels used to heat homes and cook with, tobacco smoke and radon. Generally, the two most important types of indoor air pollution are second-hand smoke and radon gas.\n" + "\n"+"Second hand smoke\n" + "\n" + "Currently, millions of people are exposed to second-hand smoke, and for children most of this exposure occurs in their own homes. Second-hand smoke increases the risk of cancer and other diseases, such as heart disease and stroke, leading to thousands of deaths every year.\n" + " \n" + "\n" + "Radon\n" + "\n" + "Radon is a natural radioactive gas that can increase the risk of lung cancer.\n" + "\n" + "Radon is found in the air at a low level outdoors, but it can sometimes build up to high concentrations indoors.\n" + "\n");
        genes.setText("Some people have inherited gene faults that increase their risk of developing particular types of cancer. Some gene faults can increase the risk of more than one type of cancer.\n" + "\n"+"Inheriting faulty cancer genes\n" + "Some faulty genes that increase the risk of cancer can be passed on from parent to child. These are called inherited cancer genes. This occurs when there is a mistake or a fault in the genes in an egg or sperm cell. Then the gene fault can be passed on to children. Genes that increase the risk of cancer are called cancer susceptibility genes.\n" + "\n" + "These genes would normally protect us against cancer - they correct DNA damage that naturally occurs when cells divide. Inheriting a faulty copy of one of these genes means that it cannot repair damaged DNA in cells. This means the cells may become cancerous.\n" + "\n" + "We inherit genes from both our parents. If a parent has a gene fault then each child has a 1 in 2 chance (50%) of inheriting it. So some children will have the faulty gene and an increased risk of developing cancer and some children won't.\n" + "\n" + "Being born with one inherited faulty gene doesn't mean that a person will definitely get cancer. But they have a higher risk of developing particular types of cancer than other people. They are also more likely to develop cancer at a younger age. Doctors call this having a genetic predisposition to cancer. For a cancer to develop, further gene changes (mutations) need to happen. This usually happens over many years.\n" + "\n");
        hpv.setText("HPV, or human papillomavirus, is a virus that infects the skin and the cells lining body cavities. It is spread through close skin-to-skin contact. It is a very common infection which usually causes no symptoms at all.\n" + "\n" + "Up to 8 out of 10 people will be infected with the virus at some point in their lives. HPV infections are usually on the fingers, hands, mouth and genitals. For most people, the infection will get better on its own and they will never know they had it. But in some people the infection will stay around for a long time and become persistent.\n" + "\n"+"There are hundreds of different types of HPV. Most are harmless. But around 13 types of HPV can cause cancer. These are called 'high-risk' types. People with persistent infections with 'high-risk' HPV types are those who are most likely to go on to develop cancer.\n" + "\n" + "How can HPV cause cancer?\n" + "Normally, HPV infections start in the deepest layers of the skin. During an infection, HPV causes skin cells to divide more than usual. New virus particles are then made inside these cells.\n" + "\n" + "This fast skin growth can cause warts to develop, but often it doesn't cause any symptoms at all. The types of HPV that cause warts are not the same types that cause cancer.\n" + "\n" + "In some people with persistent 'high-risk' HPV infections, the virus damages the cells' DNA and causes cells to start dividing and growing out of control. This can lead to cancer.\n" + "\n");
        sun.setText("Overexposure to ultraviolet (UV) radiation from the sun or sunbeds is the main cause of skin cancer.\n"+"Too much UV radiation from the sun or sunbeds can damage the genetic material (the DNA) in your skin cells. If enough DNA damage builds up over time, it can cause cells to start growing out of control, which can lead to skin cancer.\n" + "\n" + "Your body has ways of repairing most of the damage. But it is not perfect - some damaged DNA can be left behind. Your body's attempt to repair this damage is what causes the painful symptoms of sunburn.\n" + "\n" + "The blood vessels around the sunburnt skin swell, allowing blood to rush into it. This is why sunburn looks red.\n" + "\n" + "Blood inside your body is also hot, which is why it feels like sunburnt skin gives off heat - actually, it is usually no hotter than your core body temperature. The wider blood vessels allow the cells of your immune system to travel to the site of the damage. They also release chemicals which trigger inflammation - this is why bad sunburn is swollen and painful.\n" + "\n" + "Sometimes, the sun damages skin cells so severely that they must be destroyed. Peeling after sunburn is your body's way of getting rid of damaged cells that could lead to cancer. Although skin peels and new skin layers form, some damage can still remain. So it is important to try to avoid burning in the first place.\n" + "\n" + "\n");
    }

    public void toggle_contentsm(View v){
        smoking.setVisibility( smoking.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contentob(View v){
        obesity.setVisibility(obesity.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contental(View v){
        alcohol.setVisibility(alcohol.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contentsu(View v){
        sun.setVisibility( sun.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contentdi(View v){
        diet.setVisibility( diet.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contentwo(View v){
        workplace.setVisibility(workplace.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contentpo(View v){
        pollution.setVisibility( pollution.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contenthp(View v){
        hpv.setVisibility(hpv.isShown()
                ? View.GONE
                : View.VISIBLE );
    }
    public void toggle_contentge(View v){
        genes.setVisibility(genes.isShown()
                ? View.GONE
                : View.VISIBLE );
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
