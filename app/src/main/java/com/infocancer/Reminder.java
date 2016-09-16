package com.infocancer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Reminder extends ActionBarActivity {

    private PendingIntent pendingIntent;
    EditText med,dos;
    int hour,minutes;
    TextView time;
    Button set,add;
    CardView cv;
    ReminderListAdaptor adaptor;
    ListView reminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        add = (Button) findViewById(R.id.add_but);
        set = (Button) findViewById(R.id.set_rem);
        time = (TextView) findViewById(R.id.time_text);
        cv = (CardView) findViewById(R.id.add_rem);
        med = (EditText) findViewById(R.id.med_name);
        dos = (EditText) findViewById(R.id.dosage);
        reminder = (ListView) findViewById(R.id.rem_list);
        TimePicker tp = (TimePicker) findViewById(R.id.rem_time);

        DB.init(this);
        ArrayList<Reminder_info> arraylist = DB.getAllReminderData();

        adaptor = new ReminderListAdaptor(Reminder.this, arraylist);
        reminder.setAdapter(adaptor);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cv.setVisibility(View.VISIBLE );
            }
        });
        tp.setIs24HourView(true);

        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour = hourOfDay;
                minutes = minute;
            }
        });


        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = formatter.format(calendar.getTime());
        String[] separateCurrentDate = nowDate.split("-");
        String year = separateCurrentDate[0];
        String month = separateCurrentDate[1];
        String day = separateCurrentDate[2];
        calendar.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));

        calendar.set(Calendar.HOUR_OF_DAY,hour);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = String.valueOf(hour) + ":" + String.valueOf(minutes);
                time.setText(t);

                DB.init(getApplicationContext());
                DB.add_reminder(new Reminder_info(med.getText().toString(), dos.getText().toString(),t));
                Toast.makeText(getApplicationContext(), "Record Saved.", Toast.LENGTH_LONG).show();
            }
        });


        Intent myIntent = new Intent(Reminder.this, mReciever.class);
        pendingIntent = PendingIntent.getBroadcast(Reminder.this, 0, myIntent, 0);

        AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reminder, menu);
        return true;
    }

    class ReminderListAdaptor extends BaseAdapter {

        Context context;
        LayoutInflater inflater;
        ArrayList<Reminder_info> data;

        public ReminderListAdaptor(Context context,
                                 ArrayList<Reminder_info> arraylist) {
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
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            TextView medicine;
            TextView time;
            TextView dosage;

            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View itemView = inflater.inflate(R.layout.reminder_list_item, parent, false);
            // Get the position
            final Reminder_info resultp = data.get(position);

            medicine = (TextView) itemView.findViewById(R.id.rm_med);
            time = (TextView) itemView.findViewById(R.id.rm_time);
            dosage = (TextView) itemView.findViewById(R.id.rm_dosage);

            medicine.setText(resultp.getmed());
            time.setText(resultp.gettim());
            dosage.setText(resultp.getdos());

            return itemView;

        }
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
