package com.kodnest.controlconstructs;

import java.util.Scanner;

public class NestedSimpleIf {
	public static void main(String[] args) {
	    System.out.println("Welcome to Kodnest Water Theme Park");
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Height in cm and Weight in Kg");
	    int height = scan.nextInt();
	    int weight = scan.nextInt();
	    if(height<150)
	    {
	    	System.out.println("You have to grow tall");
	    }
	    else 
	    {
	    	if(weight>=50)
	    	{
	    		System.out.println("You can have a Ride");
	    	}
	    	else 
	    	{
	    		System.out.println("You are underweight");
	    	}
	    }
	    
	  }
}
