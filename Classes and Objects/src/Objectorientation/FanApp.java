package Objectorientation;

public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fan f1=new Fan();
        Fan f2=new Fan();
        Fan f3=new Fan();
       	
        f1.no_Of_Wings=2;
        f1.cost=2000;
        f1.colour="Red";
        f1.brand="Usha";
        f1.rotate();
        f1.blow_Air();
        System.out.println(f1.no_Of_Wings+ " "+f1.cost+" "+f1.colour+" "+f1.brand);
        System.out.println("*****************************************************");
        f2.no_Of_Wings=3;
        f2.cost=3000;
        f2.colour="Orange";
        f2.brand="Havells";
        f2.rotate();
        f2.blow_Air();
        System.out.println(f2.no_Of_Wings+ " "+f2.cost+" "+f2.colour+" "+f2.brand);
        System.out.println("*****************************************************"); 
        f3.no_Of_Wings=4;
        f3.cost=5000;
        f3.colour="Blue";
        f3.brand="Crompton";
        f3.rotate();
        f3.blow_Air();
        System.out.println(f3.no_Of_Wings+ " "+f3.cost+" "+f3.colour+" "+f3.brand);
        
	}

}
