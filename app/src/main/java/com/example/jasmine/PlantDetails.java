package com.example.jasmine;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

public class PlantDetails extends AppCompatActivity {

    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant_details);

        Intent plantIntent = getIntent();
        int plant_details =     plantIntent.getIntExtra("Plant_Name", 0);

        //reference the image that will be placed in the layout
        ImageView plant_image = (ImageView) findViewById(R.id.plant_image);
        plant_image.setImageResource(plant_details);
     }


}
