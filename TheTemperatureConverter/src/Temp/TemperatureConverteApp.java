package Temp;

import java.util.Scanner;

public class TemperatureConverteApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Temperature in Farenheit");
    int fahrenheit =scan.nextInt();
    TemperatureConverter temperatureconverter = new TemperatureConverter();
    double Celcius=temperatureconverter.convertFahrenheitToCelsius(fahrenheit);
    System.out.println(Celcius); 		
    
	}

}
