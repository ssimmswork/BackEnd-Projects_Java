//Author: Shian Simms
//IDE used: Eclipse Photon

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num, test, evens = 0, count = 0;

		System.out.println("Please Enter A Even Number: ");
		num = scan.nextInt();

       // Test if number is even

		test = num % 2;
		
		//Even number starts the while loop

		while (test < 1) {

			if (test < 1) {
				evens += num;
			}

			System.out.println("Please Enter A Even Number: ");
			num = scan.nextInt();

			test = num % 2;

			count++;
		}
		//Prints results

		System.out.println("Total: " + evens);
		System.out.println("Number of Numbers: " + count);

		
}

}
