package com.kodnest.methods;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers");
    teaBill();
    teaBill(10);
    teaBill("Elaichi");
    teaBill("Ginger ", 5);
    teaBill("Black");
	}
   public static void teaBill()
   {
       System.out.println("Bill for tea is Rs.10");
    }
   public static void teaBill(int n)
   {
       System.out.println("Bill for "+n+ "teas is " +(n*10)+ "Rs.");
    }
   public static void teaBill(String type)
   {
       System.out.println("Bill for "+type +"tea is 15 Rs.");
    }
   public static void teaBill(String type, int n)
   {
       System.out.println("Bill for "+n+ " " +type+ "tea is "+(n*15)+ "Rs.");
    }
   
   // Below code will give error as it doesn't follow the valid condition for overloading a method (order of parameters)
  /* public static void teaBill(String t)
   {
       System.out.println("Bill for "+t+ "tea is 10 Rs.");
    }*/
}
