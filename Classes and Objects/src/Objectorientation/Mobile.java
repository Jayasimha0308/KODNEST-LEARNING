package Objectorientation;

public class Mobile {

	String brand;
	String colour;
	int cost;
	public Mobile(String brand, String colour, int cost)
	{
	/* Giving same name to local variables and instance variables would not be reflected in instance variables.
		This problem is technically called as "SHADOWING PROBLEM".*/
	
		/*brand=brand;
		colour=colour;
		 cost=cost ;*/
		 
	/* To avoid shadowing problem we use 'this.' keyword. 'this' will hold the address of the current object*/ 	
		
		this.brand=brand;
		this.colour=colour;
	    this. cost=cost ;
	}
    

	void allowToCall()
	{
		System.out.println("Mobile is Ringing........");
	}
	void allowToPlay()
	{
		System.out.println("Start playing PUBG");
	}
}

