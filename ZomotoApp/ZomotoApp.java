package com.Zomoto;

public class ZomotoApp { 
    public static void main(String[] args){
        User u = new User("Navin", "nagercoil",9080194116);
        Restaurant r = new Restaurant("Tirunelveli", 8);   
        Angappar hotel1 = new Angappar("vannarapettai" , 8 , "SouthIndian");
        Chocohut hotel2 = new Chocohut("palayamkottai" , 9 , "Desert");
        Juicetime hotel3 = new Juicetime("ktcNagar" , 7 , "juices") ;
        
        String[] AngapparmenuItems = hotel1.getmenuItems();
        int[] AngapparmenuPrices = hotel1.getmenuPrices();
        String[] ChocohutmenuItems = hotel2.getmenuItems();
        int[] ChocohutmenuPrices = hotel2.getmenuPrices();
        String[] JuicetimemenuItens = hotel3.getmenuItems();
        int[] JuicetimemenuItems = hotel3.getmenuPrices();

        for (int i = 0; i < AngapparmenuItems.length; i++) {
            System.out.println(angapparMenuItems[i] + AngapparmenuPrices[i]);
        }
        for (int i = 0; i < ChocohutmenuItems.length; i++) {
            System.out.println(chocohutMenuItems[i] + ChocohutmenuPrices[i]);
        }
        for (int i = 0; i < JuicetimemenuItems.length; i++) {
            System.out.println(JuicetimeMenuItems[i] + JuicetimemenuPrices[i]);
        }
    }
}
