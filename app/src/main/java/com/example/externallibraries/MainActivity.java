package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.picasso_image);

        Picasso.get().load("https://www.his.se/contentassets/df34584991724cd3be379489759a3d7c/_hor98703.jpg").resize(200, 200).into(imageView);
    }
}
