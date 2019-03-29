//Author: Shian Simms
//IDE used: Eclipse Photon

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
		
		for (int count = 13; count <= 93; count += 10) {
			
			System.out.println(count);
		}
		
		
		System.out.println("Enter a word you want to see backwards: ");
		String word = scan.nextLine();
		
		
		for (int wordCount = word.length() -1 ; wordCount >= 0; wordCount--) {
			
			System.out.print(word.charAt(wordCount));
		}

	}

}
