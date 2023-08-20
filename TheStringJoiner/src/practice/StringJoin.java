package practice;

import java.util.Scanner;

public class StringJoin {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the First String");
    String str1=scan.next();
    System.out.println("Enter the Second String");
    String str2=scan.next();
    scan.close();
    System.out.println(joinStrings(str1, str2));
    
	}
	public static String joinStrings(String str1, String str2) 
	{
		return str1+str2;
	}
}
