package com.kodnest.controlconstructs;

import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the Marks");
	    int marks = scan.nextInt();
	    System.out.println("Welcome to KodNest!!!");
	    greet(marks);
		}
	    public static void greet(int marks) 
	    {
		   if (marks>=80)
		   {
			   System.out.println("Welcome to Tech Club");
		   }
		}
}
