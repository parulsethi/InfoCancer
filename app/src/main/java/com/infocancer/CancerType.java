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
        if (typ.equals("Lung")) {
            desc1.setText("Lung cancer starts when cells of the lung become abnormal and begin to grow out of control. As more cancer cells develop, they can form into a tumor and spread to other areas of the body.\n"+"Types of lung cancer\n" +
                    "\n" +
                    "The 2 main types of lung cancer are:\n" +
                    "\n" +
                    "Small cell lung cancer (SCLC), which is sometimes called oat cell cancer. About 10% to 15% of lung cancers are SCLC.\n" +
                    "Non-small cell lung cancer (NSCLC), which makes up about 80% to 85% of lung cancers. The 3 main types of NSCLC are adenocarcinoma, squamous cell carcinoma, and large cell carcinoma.");
            desc2.setText("Lung cancers typically start in the cells lining the bronchi and parts of the lung such as the bronchioles or alveoli.\n"+"A thin lining called the pleura surrounds the lungs. The pleura protects your lungs and helps them slide back and forth against the chest wall as they expand and contract during breathing.\n" +
                    "\n" +
                    "Below the lungs, a thin, dome-shaped muscle called the diaphragm separates the chest from the abdomen. When you breathe, the diaphragm moves up and down, forcing air in and out of the lungs.");
            img.setImageResource(R.drawable.dcolon);
        }
        if (typ.equals("mouth")){
            desc1.setText("Oral cavity cancer, or just oral cancer, is cancer that starts in the mouth (also called the oral cavity). Oropharyngeal cancer starts in the oropharynx, which is the part of the throat just behind the mouth.\n"+"\n"+"Tumors and growths in the oral cavity and oropharynx\n" + "\n" + "Many types of tumors (abnormal growths of cells) can develop in the oral cavity and oropharynx. They fit into 3 general categories:\n" + "\n" + "Benign or non-cancerous growths that do not invade other tissues and do not spread to other parts of the body.\n" + "Harmless growths that can later develop into cancer. These are known as pre-cancerous conditions.\n" + "Cancerous tumors that can grow into surrounding tissues and spread to other parts of the body.");
            desc2.setText("Oral cavity and oropharyngeal cancers\n" + "\n" + "Several types of cancers can start in the mouth or throat.\n" + "\n" + "Squamous cell carcinomas\n" + "\n" + "More than 90% of cancers of the oral cavity and oropharynx are squamous cell carcinomas, also called squamous cell cancers. These cancers begin in early forms of squamous cells, which are flat, scale-like cells that normally form the lining of the mouth and throat.\n" + "\n" + "The earliest form of squamous cell cancer is called carcinoma in situ, meaning that the cancer cells are present only in the outer layer of cells called the epithelium. This is different from invasive squamous cell carcinoma, where the cancer cells have grown into deeper layers of the oral cavity or oropharynx.\n" + "\n" + "Verrucous carcinoma\n" + "\n" + "Verrucous carcinoma is a type of squamous cell carcinoma that makes up less than 5% of all oral cancers. It is a low-grade (slow growing) cancer that rarely spreads to other parts of the body, but it can grow deeply into surrounding tissue.\n" + "\n" + "If they are not treated, areas of ordinary squamous cell cancer may develop within some verrucous carcinomas. Some verrucous carcinomas may already have areas of ordinary squamous cell cancer that are not recognized in the biopsy sample. Cells from these areas of squamous cell carcinoma may then spread to other parts of the body.\n" + "\n" + "For all of these reasons, verrucous carcinomas should be removed promptly, along with a wide margin of surrounding normal tissue.\n" + "\n" + "Minor salivary gland carcinomas\n" + "\n" + "Minor salivary gland cancers can develop in the glands in the lining of the mouth and throat. There are several types of minor salivary gland cancers, including adenoid cystic carcinoma, mucoepidermoid carcinoma, and polymorphous low-grade adenocarcinoma. ");
            img.setImageResource(R.drawable.dmouth);
        }
        if (typ.equals("cervical")){
            desc1.setText("Cervical cancer starts in the cells lining the cervix -- the lower part of the uterus (womb). This is sometimes called the uterine cervix. The fetus grows in the body of the uterus (the upper part). The cervix connects the body of the uterus to the vagina (birth canal). The part of the cervix closest to the body of the uterus is called the endocervix. The part next to the vagina is the exocervix (or ectocervix). The 2 main types of cells covering the cervix are squamous cells (on the exocervix) and glandular cells (on the endocervix). These 2 cell types meet at a place called the transformation zone. The exact location of the transformation zone changes as you age and if you give birth.");
            desc2.setText("Most cervical cancers begin in the cells in the transformation zone. These cells do not suddenly change into cancer. Instead, the normal cells of the cervix first gradually develop pre-cancerous changes that turn into cancer. Doctors use several terms to describe these pre-cancerous changes, including cervical intraepithelial neoplasia (CIN), squamous intraepithelial lesion (SIL), and dysplasia.\n"+"Cervical cancers and cervical pre-cancers are classified by how they look under a microscope. The main types of cervical cancers are squamous cell carcinoma and adenocarcinoma.\n" + "\n" + "Most (up to 9 out of 10) cervical cancers are squamous cell carcinomas. These cancers form from cells in the exocervix and the cancer cells have features of squamous cells under the microscope. Squamous cell carcinomas most often begin in the transformation zone (where the exocervix joins the endocervix).\n" + "\n" + "Most of the other cervical cancers are adenocarcinomas. Adenocarcinomas are cancers that develop from gland cells. Cervical adenocarcinoma develops from the mucus-producing gland cells of the endocervix. Cervical adenocarcinomas seem to have become more common in the past 20 to 30 years.\n" + "\n" + "Less commonly, cervical cancers have features of both squamous cell carcinomas and adenocarcinomas. These are called adenosquamous carcinomas or mixed carcinomas.");
            img.setImageResource(R.drawable.dcervical);
        }
        if (typ.equals("prostate")){
            desc1.setText("Prostate cancer begins when cells in the prostate gland start to grow uncontrollably. The prostate is a gland found only in males. It makes some of the fluid that is part of semen.\n" +
                    "\n" +
                    "The prostate is below the bladder and in front of the rectum. The size of the prostate changes with age. In younger men, it is about the size of a walnut, but it can be much larger in older men.\n" +
                    "\n" +
                    "Just behind the prostate are glands called seminal vesicles that make most of the fluid for semen. The urethra, which is the tube that carries urine and semen out of the body through the penis, goes through the center of the prostate.");
            desc2.setText("Types of prostate cancer\n" +
                    "\n" +
                    "Almost all prostate cancers are adenocarcinomas. These cancers develop from the gland cells (the cells that make the prostate fluid that is added to the semen).\n" +
                    "\n" +
                    "Other types of prostate cancer include:\n" +
                    "\n" +
                    "Sarcomas\n" +
                    "Small cell carcinomas\n" +
                    "Neuroendocrine tumors (other than small cell carcinomas)\n" +
                    "Transitional cell carcinomas\n" +
                    "These other types of prostate cancer are rare. If you have prostate cancer it is almost certain to be an adenocarcinoma.\n" +
                    "\n" +
                    "Some prostate cancers can grow and spread quickly, but most grow slowly. In fact, autopsy studies show that many older men (and even some younger men) who died of other causes also had prostate cancer that never affected them during their lives. In many cases neither they nor their doctors even knew they had it.");
            img.setImageResource(R.drawable.dprostate);
        }
        if (typ.equals("stomach")){
            desc1.setText("Stomach cancer, also called gastric cancer, is a cancer that starts in the stomach.\n Stomach cancers tend to develop slowly over many years. Before a true cancer develops, pre-cancerous changes often occur in the inner lining (mucosa) of the stomach. These early changes rarely cause symptoms and therefore often go undetected.");
            desc2.setText("Stomach cancers can spread (metastasize) in different ways. They can grow through the wall of the stomach and invade nearby organs. They can also spread to the lymph vessels and nearby lymph nodes. Lymph nodes are bean-sized structures that help fight infections. The stomach has a very rich network of lymph vessels and nodes. As the stomach cancer becomes more advanced, it can travel through the bloodstream and spread to organs such as the liver, lungs, and bones. If cancer has spread to the lymph nodes or to other organs, the patient's outlook is not as good.\nTypes of stomach cancers\n" +
                    "\n" +
                    "Different types of stomach cancer include:\n" +
                    "\n" +
                    "Adenocarcinoma\n" +
                    "\n" +
                    "About 90% to 95% of cancers of the stomach are adenocarcinomas. When the term stomach cancer or gastric cancer is used, it almost always refers to an adenocarcinoma. These cancers develop from the cells that form the innermost lining of the stomach (known as the mucosa).\n" +
                    "\n" +
                    "Lymphoma\n" +
                    "\n" +
                    "These are cancers of the immune system tissue that are sometimes found in the wall of the stomach. About 4% of stomach cancers are lymphomas. The treatment and outlook depend on the type of lymphoma. For more detailed information, see Non-Hodgkin Lymphoma.\n" +
                    "\n" +
                    "Gastrointestinal stromal tumor (GIST)\n" +
                    "\n" +
                    "These are rare tumors that start in very early forms of cells in the wall of the stomach called interstitial cells of Cajal. Some of these tumors are non-cancerous (benign); others are cancerous. Although GISTs can be found anywhere in the digestive tract, most are found in the stomach. For more information, see Gastrointestinal Stromal Tumor (GIST).\n" +
                    "\n" +
                    "Carcinoid tumor\n" +
                    "\n" +
                    "These are tumors that start in hormone-making cells of the stomach. Most of these tumors do not spread to other organs. About 3% of stomach cancers are carcinoid tumors. These tumors are discussed in more detail in Gastrointestinal Carcinoid Tumors.");
            img.setImageResource(R.drawable.dstomach);
        }
        if (typ.equals("colorectal")){
            desc1.setText("Colorectal cancer is a cancer that starts in the colon or the rectum. These cancers can also be named colon cancer or rectal cancer, depending on where they start.\n"+"\n"+"How does colorectal cancer start?\n" + "\n" + "Most colorectal cancers begin as a growth on the inner lining of the colon or rectum called a polyp. Some types of polyps can change into cancer over the course of several years, but not all polyps become cancer. The chance of changing into a cancer depends on the kind of polyp. The 2 main types of polyps are:\n" + "\n" + "· Adenomatous polyps (adenomas): These polyps sometimes change into cancer. Because of this, adenomas are called a pre-cancerous condition.\n" + "\n" + "· Hyperplastic polyps and inflammatory polyps: These polyps are more common, but in general they are not pre-cancerous.\n" + "\n" + "Dysplasia, another pre-cancerous condition, is an area in a polyp or in the lining of the colon or rectum where the cells look abnormal (but not like true cancer cells).");
            desc2.setText("Types of cancer in the colon and rectum\n" + "\n" + "Adenocarcinomas make up more than 95% of colorectal cancers. These cancers start in cells that form glands that make mucus to lubricate the inside of the colon and rectum. When doctors talk about colorectal cancer, they are almost always talking about this type.\n" + "\n" + "Other, less common types of tumors can also start in the colon and rectum. These include:\n" + "\n" + "Carcinoid tumors start from specialized hormone-making cells in the intestine."+"\n"+"Gastrointestinal stromal tumors (GISTs) start from specialized cells in the wall of the colon called the interstitial cells of Cajal. Some are non-cancerous (benign). These tumors can be found anywhere in the digestive tract, but it is unusual to find them in the colon."+"\n"+"Lymphomas are cancers of immune system cells that typically start in lymph nodes, but they can also start in the colon, rectum, or other organs.");
            img.setImageResource(R.drawable.dlung);
        }
        if (typ.equals("skin")){
            desc1.setText("Skin cancer begins when cells in the skin start to grow uncontrollably.");
            desc2.setText("Types of skin cells\n" + "\n" + "There are 3 main types of cells in the top layer of the skin (called the epidermis):\n" + "\n" + "Squamous cells: These are flat cells in the outer part of the epidermis that are constantly shed as new ones form.\n" + "Basal cells: These cells are in the lower part of the epidermis, called the basal cell layer. These cells constantly divide to form new cells to replace the squamous cells that wear off the skin's surface. As these cells move up in the epidermis, they get flatter, eventually becoming squamous cells.\n" + "Melanocytes: These cells make the brown pigment called melanin, which gives the skin its tan or brown color. Melanin acts as the body's natural sunscreen, protecting the deeper layers of the skin from some of the harmful effects of the sun. For most people, when skin is exposed to the sun, melanocytes make more of the pigment, causing the skin to tan or darken.\n" + "The epidermis is separated from the deeper layers of skin by the basement membrane. When a skin cancer becomes more advanced, it generally grows through this barrier and into the deeper layers.\n" + "\n" + "Types of skin cancer\n" + "\n" + "Basal cell carcinoma\n" + "\n" + "This the most common type of skin cancer. About 8 out of 10 skin cancers are basal cell carcinomas (also called basal cell cancers). When seen under a microscope, the cells in these cancers look like cells in the lowest layer of the epidermis, called the basal cell layer.\n" + "\n" + "These cancers usually develop on sun-exposed areas, especially the head and neck. These cancers tend to grow slowly. It's very rare for a basal cell cancer to spread to other parts of the body. But if a basal cell cancer is left untreated, it can grow into nearby areas and invade the bone or other tissues beneath the skin.\n" + "\n" + "If not removed completely, basal cell carcinoma can recur (come back) in the same place on the skin. People who have had basal cell skin cancers are also more likely to get new ones in other places.\n" + "\n" + "Squamous cell carcinoma\n" + "\n" + "About 2 out of 10 skin cancers are squamous cell carcinomas (also called squamous cell cancers). The cells in these cancers look like abnormal versions of the squamous cells seen in the outer layers of the skin.\n" + "\n" + "These cancers commonly appear on sun-exposed areas of the body such as the face, ears, neck, lips, and backs of the hands. They can also develop in scars or chronic skin sores elsewhere. They sometimes start in actinic keratoses (described below). Less often, they form in the skin of the genital area.\n" + "\n" + "Squamous cell cancers are more likely to grow into deeper layers of skin and spread to other parts of the body than basal cell cancers, although this is still uncommon.\n"+"\n"+"Melanoma\n" + "\n" + "These cancers develop from melanocytes, the pigment-making cells of the skin. Melanocytes can also form benign (non-cancerous) growths called moles. Melanomas are much less common than basal and squamous cell cancers, but they are more likely to grow and spread if left untreated. Melanoma and moles are discussed in Melanoma Skin Cancer.");
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
