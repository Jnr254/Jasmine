package com.example.jasmine;

public class Plants {
    private String plantName;
    private String plantDetails;
    private int plantImage;

    public Plants(String plantName, String plantDetails, int plantImage){
        this.plantName = plantName;
        this.plantDetails = plantDetails;
        this.plantImage = plantImage;
    }

    public String getPlantName(){
        return plantName;
    }
    public String getPlantDetails(){
        return plantDetails;
    }
    public int getPlantImage(){
        return plantImage;
    }

}
