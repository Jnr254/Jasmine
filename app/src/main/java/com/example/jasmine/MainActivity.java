 package com.example.jasmine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.cardview.widget.CardView;

import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;




public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Plants> list;
    PlantAdapter plantAdapter;
    Button scanBtn;
    private static final int CAMERA_REQUEST = 123;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        listShow();

        plantAdapter = new PlantAdapter(this, list);
        listView.setAdapter(plantAdapter);


        //Allowing the scan button to open the camera to allow capturing of an image
        scanBtn = findViewById(R.id.btn_scan);


    }

    private void listShow() {
        list = new ArrayList<Plants>();

        list.add(new Plants("Prunus Africana", "Tropical medicinal plant", R.drawable.prunus));
        list.add(new Plants("Brown Olive", "Tropical medicinal plant", R.drawable.olive));
        list.add(new Plants("Rhamnus Prinoides", "Tropical medicinal plant", R.drawable.rhamnus));

    }
}

    /*Method to define what happens when the button is clicked
    public void btnClick(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE_SECURE);
        startActivityForResult(intent, CAMERA_REQUEST);

}
    /*Method to set the image for view at the application home bar
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(photo);
        }
    }*/
