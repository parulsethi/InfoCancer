package com.infocancer;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class AddRecord extends ActionBarActivity {

    EditText title,date,doctor,diagnose;
    ImageView p_preview,r_preview;
    Button p_click,r_click,save;
    byte[] p_img,r_img;
    String dtitle,ddate,ddiagnose,ddoctor;
    int f = 0;

    // Activity request codes
    private static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 100;
    public static final int MEDIA_TYPE_IMAGE = 1;

    private Uri fileUri; // file url to store image
    private static final String IMAGE_DIRECTORY_NAME = "Records"; // directory name to store captured images


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        Toolbar toolbar;

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        title = (EditText) findViewById(R.id._title);
        date = (EditText) findViewById(R.id._date);
        doctor = (EditText) findViewById(R.id._doctor);
        diagnose = (EditText) findViewById(R.id._diagnose);
        p_click = (Button) findViewById(R.id.p_button);
        r_click = (Button) findViewById(R.id.r_button);
        p_preview = (ImageView) findViewById(R.id.p_img);
        r_preview = (ImageView) findViewById(R.id.r_img);
        save = (Button) findViewById(R.id.save_bt);

        p_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f=0;
                captureImage();
            }
        });
        r_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f=1;
                captureImage();
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DB.init(getApplicationContext());
                Bitmap b1 = ((BitmapDrawable)p_preview.getDrawable()).getBitmap();
                Bitmap b2 = ((BitmapDrawable)r_preview.getDrawable()).getBitmap();
                ByteArrayOutputStream bos1=new ByteArrayOutputStream();
                ByteArrayOutputStream bos2 = new ByteArrayOutputStream();
                b1.compress(Bitmap.CompressFormat.PNG, 100, bos1);
                b2.compress(Bitmap.CompressFormat.PNG, 100, bos2);

                p_img=bos1.toByteArray();
                r_img=bos2.toByteArray();
                dtitle = title.getText().toString();
                ddoctor = doctor.getText().toString();
                ddiagnose= diagnose.getText().toString();
                ddate = date.getText().toString();

                DB.add_report(new Patient_info(ddoctor,ddate,dtitle,ddiagnose,p_img,r_img));
                Toast.makeText(getApplicationContext(), "Record Saved.", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),Records.class);
                startActivity(intent);
            }
        });


    }

    private void captureImage() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
        // start the image capture Intent
        startActivityForResult(intent, CAMERA_CAPTURE_IMAGE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // if the result is capturing Image
        if (requestCode == CAMERA_CAPTURE_IMAGE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                // successfully captured the image
                // display it in image view
                previewCapturedImage();
            } else {
                // failed to capture image
                Toast.makeText(getApplicationContext(),
                        "Sorry! Failed to capture image", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

    private void previewCapturedImage() {
        if (f == 0)
            try {
                p_preview.setVisibility(View.VISIBLE);
                BitmapFactory.Options options = new BitmapFactory.Options();
                // downsizing image as it throws OutOfMemory Exception for larger images
                options.inSampleSize = 8;
                final Bitmap bitmap = BitmapFactory.decodeFile(fileUri.getPath(),
                        options);
                p_preview.setImageBitmap(bitmap);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        else
            try {
                r_preview.setVisibility(View.VISIBLE);
                BitmapFactory.Options options = new BitmapFactory.Options();
                // downsizing image as it throws OutOfMemory Exception for larger images
                options.inSampleSize = 8;
                final Bitmap bitmap = BitmapFactory.decodeFile(fileUri.getPath(),
                        options);
                r_preview.setImageBitmap(bitmap);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
    }

    public Uri getOutputMediaFileUri(int type) {
        return Uri.fromFile(getOutputMediaFile(type));
    }

    private static File getOutputMediaFile(int type) {

        // External sdcard location
        File mediaStorageDir = new File(
                Environment
                        .getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                IMAGE_DIRECTORY_NAME);

        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                Log.d(IMAGE_DIRECTORY_NAME, "Oops! Failed create "
                        + IMAGE_DIRECTORY_NAME + " directory");
                return null;
            }
        }

        // Create a media file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(new Date());
        File mediaFile;
        if (type == MEDIA_TYPE_IMAGE) {
            mediaFile = new File(mediaStorageDir.getPath() + File.separator
                    + "IMG_" + timeStamp + ".jpg");
        } else {
            return null;
        }

        return mediaFile;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelable("file_uri", fileUri);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        fileUri = savedInstanceState.getParcelable("file_uri");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_record, menu);
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
