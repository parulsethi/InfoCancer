package com.infocancer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class Records extends ActionBarActivity {

    Button add;
    ListView record;
    RecordListAdaptor adaptor;
    public final static String r_data1 = "rdata1";
    public final static String r_data2 = "rdata2";
    public final static String r_data3 = "rdata3";
    public final static String r_data4 = "rdata4";
    public final static String r_data5 = "rdata5";
    public final static String r_data6 = "rdata6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        record = (ListView) findViewById(R.id.record_list);

        DB.init(this);
        ArrayList<Patient_info> arraylist = DB.getAllReportData();

        adaptor = new RecordListAdaptor(Records.this, arraylist);
        record.setAdapter(adaptor);

        add = (Button) findViewById(R.id.add_record);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddRecord.class);
                startActivity(intent);
            }
        });
    }

    class RecordListAdaptor extends BaseAdapter {

        Context context;
        LayoutInflater inflater;
        ArrayList<Patient_info> data;

        public RecordListAdaptor(Context context,
                                 ArrayList<Patient_info> arraylist) {
            // super();
            this.context = context;
            data = arraylist;
        }

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
            //return arraylist.get(position).get(PRICE);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            TextView title;
            TextView date;
            LinearLayout recordlist;

            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View itemView = inflater.inflate(R.layout.record_list_item, parent, false);
            // Get the position
            final Patient_info resultp = data.get(position);

            title = (TextView) itemView.findViewById(R.id.rltitle);
            date = (TextView) itemView.findViewById(R.id.rldate);
            recordlist = (LinearLayout) itemView.findViewById(R.id.re_li);

            title.setText(resultp.gettitle());
            date.setText(resultp.getdate());
            recordlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent(getApplicationContext(),ViewRecord.class);
//                    intent.putExtra(r_data1,resultp.gettitle());
//                    intent.putExtra(r_data2,resultp.getdate());
//                    intent.putExtra(r_data3,resultp.getname());
//                    intent.putExtra(r_data4,resultp.getdiagnose());
//                    intent.putExtra(r_data5,resultp.getRimg());
//                    intent.putExtra(r_data6,resultp.getPimg());
                    startActivity(intent);
                }
            });

            return itemView;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_records, menu);
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
