package com.kodnest.btc.githubcodes;

import java.util.Scanner;

public class BitwiseCounter {

	public static void main(String[] args)
	{
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = scan.nextInt();
     System.out.println(countSetBits(num));
	}
    public static int countSetBits(int num) 
    {
	 int n, count=0;
	 while (num!=0)
	 {
		 count++;
		 num >>=1;
	 }
	 return count;
	}
}
