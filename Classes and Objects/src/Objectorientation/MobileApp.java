package Objectorientation;

public class MobileApp {
public static void main(String[] args) 
{
	Mobile mobile=new Mobile("Samsung", "Orange", 25000);
	System.out.println(mobile.brand+ " "+mobile.colour+ " " +mobile.cost);
}
}
