package practice;

import java.util.Scanner;

public class SchoolProgrammer {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int num1 =scan.nextInt();
    int num2 = scan.nextInt();
    scan.close();
    System.out.println(subtractNumbers(num1, num2));
    System.out.println(multiplyNumbers(num1, num2));
    System.out.println(divideNumbers(num1, num2));
    System.out.println(findRemainder(num1, num2));
    
	}
    public static int subtractNumbers(int num1, int num2) 
    {
	 return num1-num2;
	}
    public static int multiplyNumbers(int num1, int num2) 
    {
	 return num1*num2;
	}
    public static int divideNumbers(int num1, int num2) 
    {
	 return num1/num2;
	}
    public static int findRemainder(int num1, int num2) 
    {
	 return num1%num2;
	}
}
