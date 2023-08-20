package com.kodnest.controlconstructs;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Marks");
	    int marks = scan.nextInt();
	    GradeApp s1 = new GradeApp();
	    s1.giveGrade(marks);
	    
		}
}
