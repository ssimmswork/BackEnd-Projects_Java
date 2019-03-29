//Author: Shian Simms
//IDE used: Eclipse Photon
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Conversion Chart");

//Kilo to Miles
		double kilo, miles;
		System.out.println("Enter kilometers: ");
		kilo = scan.nextDouble();
		miles = kilo * 0.621371;
		System.out.println("Miles: " + miles);

//Celsius to Fahrenheit
		double celsius, fahrenheit;
		System.out.println("Enter Celsius: ");
		celsius = scan.nextDouble();
		fahrenheit = celsius * 9/5 + 32;
		System.out.println("Fahrenheit: " + fahrenheit);

//Kilograms to Pounds
		double kilograms, pounds;
		System.out.println("Enter Kilograms: ");
		kilograms = scan.nextDouble();
		pounds = kilograms * 2.2046226218;
		System.out.println("Miles: " + pounds);

//Liters to Gallons
		double liters , gallons;
		System.out.println("Enter Liters : ");
		liters = scan.nextDouble();
		gallons = liters  * 0.26417;
		System.out.println("Gallons: " + gallons);
		
	}

}
