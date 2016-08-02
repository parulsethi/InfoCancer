package com.infocancer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Reminder extends ActionBarActivity {

    private PendingIntent pendingIntent;
    EditText med,dos;
    int hour,minutes;
    TextView time;
    Button set,add;
    CardView cv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        add = (Button) findViewById(R.id.add_but);
        set = (Button) findViewById(R.id.set_rem);
        time = (TextView) findViewById(R.id.time_text);
        cv = (CardView) findViewById(R.id.add_rem);
        med = (EditText) findViewById(R.id.med_name);
        dos = (EditText) findViewById(R.id.dosage);
        TimePicker tp = (TimePicker) findViewById(R.id.rem_time);

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
                Log.d("rem", String.valueOf(hour) + ":" + String.valueOf(minutes));
                time.setText(String.valueOf(hour) + ":" + String.valueOf(minutes));
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
