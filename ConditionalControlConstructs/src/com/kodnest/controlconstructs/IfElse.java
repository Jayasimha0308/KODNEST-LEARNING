package com.kodnest.controlconstructs;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Age");
	    int age = scan.nextInt();
	    if(age>=18)
	    {
	    	System.out.println("You are eligible to Vote");
	    }
	    else
	    {
	    	System.out.println("You are not eligible to Vote");
	    }
		}
}
