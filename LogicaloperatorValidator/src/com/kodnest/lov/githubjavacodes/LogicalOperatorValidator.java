package com.kodnest.lov.githubjavacodes;

import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Is the iput valid???... Enter True or False");
    boolean valid_input=scan.nextBoolean();
    System.out.println("Is the input meeting requirements???.... Enter True or False");
    boolean meets_requirements=scan.nextBoolean();
    scan.close();
    isInputValid(valid_input, meets_requirements);
    }
	public static void isInputValid(boolean valid_input, boolean meets_requirements)
	{
		if(valid_input && meets_requirements)
		{
			System.out.println("Input is Valid");
		}
		else if(valid_input || meets_requirements)
		{
			System.out.println("Invalid Input");
		}			
		else
		{
			System.out.println("Check your Inputs");
		}
		
	}

}
