package com.kodnest.tc.githubjavacode;

import java.util.Scanner;

public class tempConverter {

	public static void main(String[] args) {
	System.out.println("Welcome to Temperature Convertion Tool!");
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the temperature in Celcius and Fahreinheit");
    double Celcius=scan.nextInt();
    double Fahreinheit=scan.nextInt();
    double res1 = celciusToFahreinheitConversion(Celcius, Fahreinheit);
    double res2 = fahreinheitToCelciusConversion(Celcius, Fahreinheit);
    System.out.println("Enter 1 for Celcius to Fahreinheit Conversion and 2 for Fahreinheit to Celcius Conversion");
    int users_decision=scan.nextInt();
    if (users_decision==1) 
    {
    	System.out.println(res1);
    }
    else 
    {
    	System.out.println(res2);
    }
    
	}
    public static double celciusToFahreinheitConversion(double Celcius, double Fahreinheit)
    {
    	return (Celcius * 9/5) + 32;
    	
	}
    public static double fahreinheitToCelciusConversion(double Celcius, double Fahreinheit)
    {
	   return (Fahreinheit - 32)*5/9;
	}
    
}
