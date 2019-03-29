//Author: Shian Simms
//IDE used: Eclipse Photon

import java.util.Scanner;


public class Zeller {

	public static void main(String[] args) {
		int month, century, year, m, k, y,
		d, c, g, count = 0;
		
		
	    //User imput
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the month: ");
		m = scan.nextInt();
		
		
		
		while (m != 0) {
		
		System.out.println("Enter the day: ");
		k = scan.nextInt();
		
		System.out.println("Enter the year: ");
		y = scan.nextInt();
		
				
	    //Converts the year and month 
		if (m < 3) {
			m += 10;
			y -= 1;
		}
		
		if (m> 3) {
		
		  m = m - 2;
		}
		
		//Separates the year
		 d = y % 100;
		 c = y / 100;
		 
		
		 // Zeller Formula
		
		 g =(((int)((2.6 *m) - .2) + k + d + (d /4) + (c / 4) - (2*c) ) % 7);
		 
		 if (g < 1) {
			 g = 7;
		 }
		 
		 
		 //Chooses the day according to the formula
		         
		 String day = "";
		 
		 switch(g) {
		 	
		 	case 0: day = "Sunday";
				break;
		 	case 1: day = "Monday";
		    	break;
		 	case 2:	day = "Tuesday";
	 			break;
		 	case 3:	day = "Wednesday";
	 			break;
		 	case 4:	day = "Thursday";
	 			break;
		 	case 5:	day = "Friday";
	 			break;
			default: day = "Saturday";
		 		 }
		  		
		//Results 
		System.out.println("The day of the week is " + day);
		
		count++;
		
		System.out.println("Enter the month (or 0 to exit): ");
		m = scan.nextInt();
		}
		
		
		System.out.println("Number of entries: " + count);
	
	}
}
