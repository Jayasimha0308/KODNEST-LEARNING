package com.kodnest.btsw.githubjavacodes;

import java.util.Scanner;

public class BitwiseSwap {

	public static void main(String[] args) {
   
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter the values of a and b");
    int a = scan.nextInt();
    int b = scan.nextInt();
    System.out.println("Enter the values of x and y");
    int x = scan.nextInt();
    int y = scan.nextInt();
    swapUsingBitwise(a, b);
    usingTemp(x, y);
	}
	public static void swapUsingBitwise(int a, int b ) 
	{
    // Without using Temporary Variable	
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a);
    System.out.println(b);
	System.out.println("-------------------------------------------------------------------------");
	}
	public static void usingTemp(int x, int y)
    {
    //Using Temporary Variable
    int temp;
    temp=x;
    x=y;
    y=temp;
    System.out.println(x);
    System.out.println(y);
    
	}
	

}
