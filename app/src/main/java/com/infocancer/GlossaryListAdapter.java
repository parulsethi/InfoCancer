package com.infocancer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.infocancer.Glossary;
import com.infocancer.R;

public class GlossaryListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] term;
    private final String[] termdef;

    public GlossaryListAdapter(Activity context, String[] term,String[] termdef) {
        super(context,R.layout.glossary_row,term);

        this.context=context;
        this.term=term;
        this.termdef = termdef;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.glossary_row, null,true);

        TextView termTitle = (TextView) rowView.findViewById(R.id.g_term);
        TextView termtxt = (TextView) rowView.findViewById(R.id.g_definition);

        termTitle.setText(term[position]);
        termtxt.setText(termdef[position]);
        return rowView;

    };}
