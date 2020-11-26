package com.example.jasmine;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.jasmine.R;
import java.util.ArrayList;

public class PlantAdapter extends BaseAdapter{

    Context context;
    ArrayList<Plants> plants;

    public PlantAdapter(Context context, ArrayList<Plants> plants){
        this.context = context;
        this.plants = plants;

    }


    @Override
    public int getCount() {
        return plants.size();
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
    public View getView(final int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false);

        TextView plantName = view.findViewById(R.id.plant_name);
        TextView plantDetails = view.findViewById(R.id.plant_details);
        ImageView plantImage = view.findViewById(R.id.plant_image);

        plantName.setText(plants.get(position).getPlantName());
        plantDetails.setText(plants.get(position).getPlantDetails());
        plantImage.setImageResource(plants.get(position).getPlantImage());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position"+ position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
