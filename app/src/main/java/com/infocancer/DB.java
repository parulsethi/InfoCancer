package com.infocancer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;

public class DB{
    /**
     * **** if debug is set true then it will show all Logcat message **
     */
    public static final boolean DEBUG = true;

    /**
     * ******* Logcat TAG ***********
     */
    public static final String LOG_TAG = "DB";
    // Database Version
    private static final int DATABASE_VERSION = 2;

    // Database Name
    private static final String DATABASE_NAME = "record";

    // Table name
    private static final String REPORT = "reports";
    private static final String REMINDER = "reminders";

    // Table Columns names
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String TITLE = "title";
    private static final String DIAGNOSE = "diagnose";
    private static final String DATE = "date";
    private static final String REPORT_IMG = "report_img";
    private static final String PRESCRIBTION_IMG = "prescribtion_img";

    private static final String MEDICINE = "medicine";
    private static final String DOSAGE = "dosage";
    private static final String TIME = "time";

    private static final String[] ALL_TABLES = {REPORT,REMINDER};

    private static final String USER_CREATE = "create table reports(title text not null," + "id text not null,"+"date text not null,"+"name text not null,"+"diagnose text not null,"+"prescribtion_img blob,"+"report_img blob);";
    private static final String REM_CREATE = "create table reminders(medicine text not null," + "dosage text not null,"+"time text not null);";

    /**
     * ****** Used to open database in syncronized way ********
     */
    private static DataBaseHelper DBHelper = null;

    protected DB() {
    }

    /**
     * ******* Initialize database ********
     */
    public static void init(Context context) {
        if (DBHelper == null) {
            if (DEBUG)
                Log.i("DB", context.toString());
            DBHelper = new DataBaseHelper(context);
        }
    }

    /**
     * ******* Main Database creation INNER class *******
     */
    private static class DataBaseHelper extends SQLiteOpenHelper {
        public DataBaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            if (DEBUG)
                Log.i(LOG_TAG, "new create");
            try {
                db.execSQL(USER_CREATE);
                db.execSQL(REM_CREATE);


            } catch (Exception exception) {
                if (DEBUG)
                    Log.i(LOG_TAG, "Exception onCreate() exception");
            }
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            if (DEBUG)
                Log.w(LOG_TAG, "Upgrading database from version" + oldVersion
                        + "to" + newVersion + "...");

            for (String table : ALL_TABLES) {
                db.execSQL("DROP TABLE IF EXISTS " + table);
            }
            onCreate(db);
        }

    } // Inner class closed

    /**
     * ** Open database for insert,update,delete in syncronized manner ***
     */
    private static synchronized SQLiteDatabase open() throws SQLException {
        return DBHelper.getWritableDatabase();
    }

    private static synchronized SQLiteDatabase open1() throws SQLException {
        return DBHelper.getReadableDatabase();
    }

    public static void add_reminder(Reminder_info info){

        String med = info.getmed();
        String dos = info.getdos();
        String tim =  info.gettim();

        final SQLiteDatabase db = open();

        ContentValues cVal = new ContentValues();
        cVal.put(MEDICINE,med);
        cVal.put(DOSAGE,dos);
        cVal.put(TIME,tim);

        db.insert(REMINDER, null, cVal);
        db.close();
    }

    public static ArrayList<Reminder_info> getAllReminderData() {

        final SQLiteDatabase db = open1();

        String selectQuery = "SELECT  * FROM " + REMINDER;
        ArrayList<Reminder_info> reminderList = new ArrayList<Reminder_info>();

        // Open database for Read / Write
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Reminder_info data = new Reminder_info();

                data.setmed(cursor.getString(0));
                data.setdos(cursor.getString(1));
                data.settim(cursor.getString(2));

                reminderList.add(data);
                Log.d("rem_data",reminderList+"");

            } while (cursor.moveToNext());
        }
        return reminderList;
    }

    public static void add_report(Patient_info data) {

        // Open database for Read / Write

        String date = data.getdate();
        String doc_name = data.getname();
        String diagnose = data.getdiagnose();
        String title = data.gettitle();
        byte[] p_img = data.getPimg();
        byte[] r_img = data.getRimg();

        final SQLiteDatabase db = open();

        int id = getCount();
        ContentValues cVal = new ContentValues();
        cVal.put(NAME,doc_name);
        cVal.put(ID, id);
        cVal.put(DATE,date);
        cVal.put(DIAGNOSE,diagnose);
        cVal.put(TITLE,title);
        cVal.put(PRESCRIBTION_IMG,p_img);
        cVal.put(REPORT_IMG,r_img);

        // Insert user values in database
        db.insert(REPORT, null, cVal);
        //Log.d("debug_report", "" + getAllProductData());
        db.close(); // Closing database connection
    }

    // Getting All User data
    public static ArrayList<Patient_info> getAllReportData() {

        final SQLiteDatabase db = open1();

        String selectQuery = "SELECT  * FROM " + REPORT;
        ArrayList<Patient_info> contactList = new ArrayList<Patient_info>();

        // Open database for Read / Write
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Patient_info data = new Patient_info();

                data.settitle(cursor.getString(0));
                data.setid(cursor.getString(1));
                data.setdate(cursor.getString(2));
                data.setname(cursor.getString(3));
                data.setdiagnose(cursor.getString(4));
                data.setPimg(cursor.getBlob(5));
                data.setRimg(cursor.getBlob(6));

                contactList.add(data);
                Log.d("rep_data",contactList+"");

            } while (cursor.moveToNext());
        }
        return contactList;
    }

    public static int getCount() {

        final SQLiteDatabase db = open1();

        String countQuery = "SELECT  * FROM " + REPORT;
        Cursor cursor = db.rawQuery(countQuery, null);
        Log.d("couunt", "" + cursor.getCount());
        int x = cursor.getCount();
        cursor.close();
        return x;
    }
}

