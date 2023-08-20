package com.kodnest.tc.githubjavacodes;

import java.util.Scanner;

public class TaxCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Purchase amount");
		double purchase_amount = scan.nextDouble();
		System.out.println("Enter Tax rate");
		double tax_rate = scan.nextDouble(); 
		scan.close();
        System.out.println("The Rate included with Tax is :" +calculateTotalWithCost(purchase_amount, tax_rate)+ " Rs.");		
	}
	public static double calculateTotalWithCost(double purchase_amount, double tax_rate)
	{
	   	double calculatedTotalCost = (purchase_amount*tax_rate)+purchase_amount;
	   	return calculatedTotalCost;
	}

}
