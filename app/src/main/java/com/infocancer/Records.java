package com.infocancer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
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

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.Deflater;


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
                    intent.putExtra(r_data1,resultp.gettitle());
                    intent.putExtra(r_data2,resultp.getdate());
                    intent.putExtra(r_data3,resultp.getname());
                    intent.putExtra(r_data4,resultp.getdiagnose());

                    byte[] input1 = resultp.getRimg();
                    byte[] input2 = resultp.getPimg();

                    // Compressor with highest level of compression
                    Deflater compressor1 = new Deflater();
                    Deflater compressor2 = new Deflater();
                    compressor1.setLevel(Deflater.BEST_COMPRESSION);
                    compressor2.setLevel(Deflater.BEST_COMPRESSION);

                    // Give the compressor the data to compress
                    compressor1.setInput(input1);
                    compressor2.setInput(input2);
                    compressor1.finish();
                    compressor2.finish();

                    // Create an expandable byte array to hold the compressed data.
                    // It is not necessary that the compressed data will be smaller than
                    // the uncompressed data.
                    ByteArrayOutputStream bos1 = new ByteArrayOutputStream(input1.length);
                    ByteArrayOutputStream bos2 = new ByteArrayOutputStream(input2.length);

                    // Compress the data
                    byte[] buf1 = new byte[1024];
                    while (!compressor1.finished()) {
                        int count = compressor1.deflate(buf1);
                        bos1.write(buf1, 0, count);
                    }
                    try {
                        bos1.close();
                    } catch (IOException e) {
                    }

                    byte[] buf2 = new byte[1024];
                    while (!compressor2.finished()) {
                        int count = compressor2.deflate(buf2);
                        bos2.write(buf2, 0, count);
                    }
                    try {
                        bos2.close();
                    } catch (IOException e) {
                    }

                    // Get the compressed data
                    byte[] compressed1 = bos1.toByteArray();
                    byte[] compressed2 = bos2.toByteArray();

                    intent.putExtra(r_data5, compressed1);
//                    intent.putExtra(r_data6,compressed2);

                    startActivity(intent);
                }
            });

            return itemView;

        }
    }

    public static boolean saveFile(String fileName, Context context) {
        try {
            File sdDir = Environment.getExternalStorageDirectory();
            String path = sdDir.getAbsolutePath();
            File sgDir = new File(path);
            if (!sgDir.exists()) {
                sgDir.mkdirs();
                sgDir.createNewFile();
            }
            FileWriter fw = new FileWriter(path + fileName);
            BufferedWriter out = new BufferedWriter(fw);
            String toSave = "I want to be saved in a file!";
            out.write(toSave);
            out.close();
            return true;
        }
        catch (Exception ex) {
            try {
                FileOutputStream os = context.openFileOutput(fileName, 0);
                String toSave = "I want to be saved in a file!";
                os.write(toSave.getBytes());
                os.flush();
                os.close();
                return true;
            }
            catch (Exception ex2) {}
        }
        return false;
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
