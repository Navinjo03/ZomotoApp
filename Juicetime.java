package com.Zomoto

class Juicetime extends Restaurant{
    private int rating;
    private String type;
    private String[] menuItems;
    private int[] menuPrices;
    
    public Juicetime(String location , int rating , String type){
        super(location, rating, type);
        this.menuItems = new String[]{"falooda", "jigarthanda", "milkshakes", "freshjuices", "sharjah"}; 
        this.menuPrices = new int[]{120, 100, 80, 130, 75, 100};
       }
}

