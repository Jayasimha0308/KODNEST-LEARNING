package Constructors;

public class CameraApp {

	public static void main(String[] args) {
       Camera c1=new Camera("British Airways", "Red", 45000000, 500);
       c1.allowToTravel();
       c1.allowToFly();
       Camera c2 = new Camera("Air Asia", "White", 28000000, 350);
       c2.allowToTravel();
       c2.allowToFly();
	}

}
