package com.Zomoto;

class Chocohut extends Restaurant{
    private int rating;
    private String type;
    private String[] menuItems;
    private int[] menuPrices;
    
    public Chocohut(String location , int rating , String type){
        super(location, rating, type);
        this.menuItems = new String[]{"icecream", "cake", "sweets", "juice", "brownie", "gulabjamun"}; 
        this.menuPrices = new int[]{30, 50, 65, 40, 60, 25};
       }
}
