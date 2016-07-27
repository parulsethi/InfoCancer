package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Glossary extends ActionBarActivity {
    ListView glossary;
    String[] terms = {
            "Acute","Benign","Biopsy","Bone marrow","Cancer","Carcinoma","Cells","Chemoprevention","Chemotherapy","Chronic","Imaging test","In situ","Invasive cancer","Leukemia","Lymph nodes","Lymphatic system","Lymphoma","Oncologist","Oncology","Pathologist","Polyp","Precancerous","Predisposition","Prognosis","Sarcoma","Screening","Stage","Tumor"};
    String[] termdefs ={
            "Refers to symptoms that start and worsen quickly but do not last over a long time",
            "Refers to a tumor that is not cancerous. The tumor does not usually invade nearby tissue or spread to other parts of the body",
            "The removal of a small amount of tissue for examination under a microscope. Other tests can suggest that cancer is present, but only a biopsy can make a definite diagnosis. Learn more about biopsy",
            "The soft, spongy tissue found in the center of large bones where blood cells are formed",
            "A group of more than 100 different diseases that can begin almost anywhere in the body, characterized by abnormal cell growth and the ability to invade nearby tissues. Learn more about the basics of cancer",
            "Cancer that starts in skin or tissues that line the inside or cover the outside of internal organs",
            "The basic units that make up the human body",
            "The use of natural, synthetic (made in a laboratory), or biologic (from a living source) substances to reverse, slow down, or prevent the development of cancer. Learn more about chemoprevention",
            "The use of drugs to kill cancer cells. Learn more about chemotherapy",
            "Refers to a disease or condition that persists, often slowly, over a long time",
            "In place. Refers to cancer that has not spread to nearby tissue, also called non-invasive cancer",
            "Cancer that has spread outside the layer of tissue in which it started and has the potential to grow into other tissues or parts of the body, also called infiltrating cancer",
            "A cancer of the blood. Leukemia begins when normal white blood cells change and grow uncontrollably",
            "Tiny, bean-shaped organs that help fight infection. Part of the lymphatic system",
            "A network of small vessels, ducts, and organs that carry fluid to and from the bloodstream and body tissues. Through the lymphatic system, cancer can spread to other parts of the body",
            "A cancer of the lymphatic system. Lymphoma begins when cells in the lymph system change and grow uncontrollably. Sometimes a tumor is formed",
            "A doctor who specializes in treating people with cancer. The five main types of oncologists are medical, surgical, radiation, gynecologic, and pediatric oncologists. Learn more about the types of oncologists",
            "The study of cancer",
            "A doctor who specializes in interpreting laboratory tests and evaluating cells, tissues, and organs to diagnose disease",
            "A growth of normal tissue that usually sticks out from the lining of an organ, such as the colon",
            "Refers to cells that have the potential to become cancerous. Also called pre-malignant",
            "A tendency to develop a disease that can be triggered under certain conditions. For example, although a genetic predisposition to cancer increases a person's risk of developing cancer, it is not certain that the person will develop it. Learn more about genetics",
            "A cancer that develops in the tissues that support and connect the body, such as fat and muscle. Learn more about sarcoma",
            "The process of checking whether a person has a disease or has an increased chance of developing a disease when the person has no symptoms",
            "A way of describing cancer, such as where it is located, whether or where it has spread, and whether it is affecting the functions of other organs in the body. Learn more about stages of cancer",
            "A mass formed when normal cells begin to change and grow uncontrollably. A tumor can be benign (noncancerous) or malignant (cancerous, meaning it can spread to other parts of the body). Also called a nodule or mass"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossary);

        GlossaryListAdapter adapter=new GlossaryListAdapter(this,terms,termdefs);
        glossary = (ListView)findViewById(R.id.glossry);
        glossary.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_glossary, menu);
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
