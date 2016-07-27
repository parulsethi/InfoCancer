package com.infocancer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Diet extends ActionBarActivity {
    ListView food_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        descriptionCardView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver
                .OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                detailProductDescription.getViewTreeObserver().removeOnPreDrawListener(this);
                // save the full height
                descriptionViewFullHeight = detailProductDescription.getHeight();

                // initially changing the height to min height
                ViewGroup.LayoutParams layoutParams = descriptionCardView.getLayoutParams();
                layoutParams.height = (int) getActivity().getResources().getDimension(R.dimen
                        .product_description_min_height);
                descriptionCardView.setLayoutParams(layoutParams);

                return true;
            }
        });
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
