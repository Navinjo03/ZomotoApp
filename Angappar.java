package com.Zomoto;
    class Angappar extends Restaurant{
    private int rating;
    private String[] menuItems;
    private int[] menuPrices;
    
    public Angappar(String location , int rating , String type){
        super(location, rating, type);
        this.menuItems = new String[]{"rice", "mutton", "chicken65", "fish", "prawn", "chettinad"}; 
        this.menuPrices = new int[]{120, 100, 80, 130, 75, 100};
       }
}
