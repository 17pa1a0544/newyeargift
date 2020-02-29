package com.epam.newyeargift;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Unit test for simple App.
 */
public class AppTest{
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	 ArrayList<Sweets> gift = new ArrayList<Sweets>();
         //Runtime polymorphism
         Sweets choco1=new Chocolates("100%","Dark Choclate", 2,10);
         gift.add(choco1);
         Sweets choco2=new Chocolates("100%","White Choclate", 1,20);
         gift.add(choco2);
         Sweets choco3=new Candy("70%","Nuts",6,4);
         gift.add(choco3);
         Sweets choco4=new Candy("75%","Bars",5,7);
         gift.add(choco4);
         Sweets choco5=new Candy("60%","Toffe",2,2);
         gift.add(choco5);
         Sweets choco6=new Candy("20%","Milk", 8,10);
         gift.add(choco6);
         Sweets choco7=new Candy("50%","Cramel", 2,10);
         gift.add(choco7);
         ArrayList<Sweets> chocolate=new ArrayList<Sweets>();
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Chocolates){
                 chocolate.add(gift.get(i));
             }
         }
         //sorted by weight of chocolates
         System.out.println("Chocklates sorted by their weights");
         Collections.sort(chocolate,new Sortbyweight());
         for(int i=0;i<chocolate.size();i++){
             System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
         }
         //sorted by the cost of chocolates
         System.out.println();
         System.out.println("Chocolates sorted by their cost");
         Collections.sort(chocolate,new Sortbycost());
         for(int i=0;i<chocolate.size();i++){
         	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
         }
         //sorted by the type of content
         System.out.println();
         Collections.sort(chocolate,new Sortbytype());
         System.out.println("Chocolates sorted by their content %");
         for(int i=0;i<chocolate.size();i++){
         	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).cost+" weight of chocolate is "+chocolate.get(i).weight+"gms");
         }
         // calculates the total weight of the gifts
         int net_weight=0;
         for(int i=0;i<gift.size();i++){
             net_weight+=gift.get(i).weight;
         }
         System.out.println();
         System.out.println("Total weigth of gift "+net_weight+"gm");
         //Calculates the total no of candy
         int count_candies=0;
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Candy){
                 count_candies++;
             }
         }
         System.out.println();
         System.out.println("No of Candies is "+count_candies);
         //candies between range of the cost in between 2 to 5
         System.out.println("");
         System.out.println("candies between range of the cost in between 2 to 5\n");
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Candy){
                 if(gift.get(i).cost<=5 && gift.get(i).cost>=2) {
                 	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weight of candy is "+gift.get(i).weight+"gms");
                 }
             }
         }
       //candies between range of the cost in between 2 to 5
         System.out.println("");
         System.out.println("candies between range of the weigth in between 2 to 9\n");
         for(int i=0;i<gift.size();i++){
             if(gift.get(i) instanceof Candy){
                 if(gift.get(i).weight<=5 && gift.get(i).weight>=2) {
                 	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).cost+" weigth of candy is "+gift.get(i).weight+"gms");
                 }
             }
         }
         
     }
 }