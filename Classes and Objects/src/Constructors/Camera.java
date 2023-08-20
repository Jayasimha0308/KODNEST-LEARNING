package Constructors;

public class Camera {
 String brand;
 String colour;
 int cost;
 int capacity;
 void allowToTravel()
 {
	 System.out.println(brand+ " brand "+colour+ " coloured flight whose cost and capacity is "+cost+" and "+capacity+ " allow us to travel");
 }
 void allowToFly()
 {
	 System.out.println(brand+ " branded "+colour+ " coloured flight whose cost and capacity is "+cost+" and "+capacity+" allow us to fly");
	 
 }
 
 // CONSTRUCTOR
 
 public Camera(String x, String y, int z, int a)
 {
	 brand=x;
	 colour=y;
	 cost=z;
	 capacity=a;
 }
}
