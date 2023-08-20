package com.kodnest.githubjavacodes;

import java.util.Scanner;

public class CalculatorApp {
	
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers");
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    System.out.println("Select the Operator + or - or * or /");
    char operator = scan.next().charAt(0);
    scan.close();
    calculator(num1, num2, operator);
	}
	
	public static void calculator(int num1, int num2, char operator)
    {
    	int addition = num1+num2;
    	int subtraction=num1-num2;
    	int multiplication = num1*num2;
    	int division=num1/num2;
    switch (operator)
    {
    case '+':
     System.out.println(addition);
    
    break;
    case '-':
    	System.out.println(subtraction);
    	
    	break;
    case '*':
    	System.out.println(multiplication);
    	break;
    case '/':
    	System.out.println(division);
    	break;
    	default:
    		System.out.println("Check your Inputs");
    	
    
    }
    
    
	
    
    }	
    	
    	
    	
    
    
    
    	
	

	
}
