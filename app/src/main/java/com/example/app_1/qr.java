package com.example.app_1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class qr extends AppCompatActivity {
    private static final int REQUEST_CODE = 100;
    ImageView bird;
    Button SaveImg;
    OutputStream outputStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);
        SaveImg = (Button) findViewById(R.id.downloadButton);
        bird = (ImageView) findViewById(R.id.imageView);
        SaveImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(),upload.class);
                startActivity(intent);
                Toast.makeText(qr.this, "Verify your payment by uploading you payment screen shot ", Toast.LENGTH_SHORT).show();
                if (ContextCompat.checkSelfPermission(qr.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                    saveImage();
                } else {
                    askPermission();
                }
            }
        });

    }


    private void askPermission() {
        ActivityCompat.requestPermissions(qr.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                saveImage();
            } else {
                Toast.makeText(qr.this, "Please provide the require permission", Toast.LENGTH_LONG).show();
            }
        }


        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }


    private void saveImage() {
        File dir = new File(Environment.getDataDirectory(), "SaveImage");
        if (!dir.exists()) {
            dir.mkdir();
        }

        BitmapDrawable drawable = (BitmapDrawable) bird.getDrawable();
        Bitmap bitmap = drawable.getBitmap();

        File file = new File(dir, System.currentTimeMillis() + ".jpg");
        try {
            outputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 108, outputStream);
        Toast.makeText(qr.this, "successfully saved", Toast.LENGTH_LONG).show();

        try {
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
