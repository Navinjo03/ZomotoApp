package com.Zomoto;

class Restaurant{
    private String location;
    public int rating;  

    public Restaurant(String location, int rating,) {
        this.location = location;
        this.rating = rating;
    }
    
    public String getLocation(){
        return location;
    }

    public int getRating(){
        return rating;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public void setRating(int rating){
        this.rating = rating;
