//Author: Shian Simms
//IDE used: Eclipse Photon

import java.text.NumberFormat;
import java.util.Scanner;

public class Trip {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String name, upperCase;
		double airFare, usDollar, cost, totalCost, exchange, cuban; 
		int days;

//Input
		System.out.println("Enter Your Last Name:");
		name = scan.nextLine();
		System.out.println("Enter Your Airfare:");
		airFare = scan.nextDouble();
		System.out.println("Enter Number of Nights:");
		days = scan.nextInt();
		System.out.println("Enter Dollars to Convert: ");
		usDollar = scan.nextDouble();
		
//Converts Name 		
		
		upperCase = name.substring(0,1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
		
//Converts Hotel
		final double hotelCost = 256.1;
		cost = days * hotelCost;
		
		totalCost = cost + airFare;
						
//Converts USD
				
		final double penalityFee = 0.1,penality;
		final double exchangeFee = 0.03;
			
		penality = usDollar * penalityFee;
		exchange = usDollar * exchangeFee;
		cuban = (usDollar - penality) - exchange;
		
		
//Output
		NumberFormat percent = NumberFormat.getPercentInstance();
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.println(upperCase + " Expense Report");
		System.out.println("Airfare: " + currency.format(airFare) + "\nHotel: " + currency.format(cost) + "\nTotal: " + currency.format(totalCost));
		System.out.println("US Dollars:" + currency.format(usDollar) + " Cuban: " + currency.format(cuban));
		System.out.println("CUC Penalty: " + percent.format(penalityFee) +"\nConversion rate: " + percent.format(exchangeFee));
}
}