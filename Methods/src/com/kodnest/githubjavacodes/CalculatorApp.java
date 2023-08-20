package com.kodnest.githubjavacodes;

import java.util.Scanner;

public class CalculatorApp {
	public static void calculator(int num1, int num2)
    {
    	int addition = num1+num2;
    	int subtraction=num1-num2;
    	int multiplication = num1*num2;
    	int division=num1/num2;
    	 
    	System.out.println(addition);
    	System.out.println(subtraction);
    	System.out.println(multiplication);
    	System.out.println(division);
    
    }
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers");
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    scan.close();
    calculator(num1, num2);
	
    
    switch (num1,num2)
    {
    case 1:
    System.out.println("addition result is :"+addition);
    break;
    case 2:
    	System.out.println("subtraction result is :"+subtraction);
    	break;
    case 3:
    	System.out.println("multiplication result is :"+multiplication);
    	break;
    case 4:
    	System.out.println("division result is :"+division);
    	break;
    	default:
    		System.out.println("Check your Inputs");
    	
    
    }
    
    
	}
    
    	
    	
    	
    	
    
    
    
    	
	

	
}
