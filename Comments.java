//Author: Shian Simms
//IDE used: Eclipse Photon
import java.util.Random;
import java.util.Scanner;

public class Comments {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		Random ran = new Random ();
        
		int numOne = ran.nextInt(8)+ 1;
		int numTwo = ran.nextInt(8) + 1;
		
		System.out.println(numOne + " + " + numTwo + " = ");
		System.out.println("Please enter your answer ");
		int ans = scan.nextInt();
		
		int answer = numOne + numTwo;
		
		System.out.println("The correct answer is: " + answer);
		

		
		

		
	}

}
