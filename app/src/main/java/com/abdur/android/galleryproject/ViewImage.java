package com.abdur.android.galleryproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ViewImage extends Activity {
    ImageView iv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        //Intent i = getIntent();
        String f = getIntent().getStringExtra("img");

        iv2 = (ImageView) findViewById(R.id.imageView2);
        iv2.setImageURI(Uri.parse(f));
    }
}
