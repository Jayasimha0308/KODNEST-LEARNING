package Objectorientation;

public class Fan {
   int no_Of_Wings;
   int cost;
   String colour;
   String brand;
   
   void rotate()
   {
	   System.out.println("The fan which is "+colour+ " in colour and of "+brand+" brand with "+no_Of_Wings+ " wings can rotate");
   }
   void blow_Air()
   {
	   System.out.println("The fan which is "+colour+" in colour and of "+brand+ " brand with "+no_Of_Wings+" wings can blow air");
   }
}

