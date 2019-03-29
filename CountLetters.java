package Exceptions;

import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		char nonLetter = 'A';
		int[] counts = new int[26];
		Scanner scan = new Scanner(System.in);

		// get word from user

		System.out.print("\n Enter a single word (letters only): ");
		String word = scan.nextLine();

//convert to all upper case

		word = word.toUpperCase();

//count frequency of each letter in string

		try {

			for (int i = 0; i < word.length(); i++) {
				nonLetter = word.charAt(i);
				counts[word.charAt(i) - 'A']++;
			}

		}

		catch (Exception ArrayIndexOutOfBounds) {
			System.out.println("Not a letter: " + nonLetter);
		}

//print frequencies

		System.out.println();
		for (int i = 0; i < counts.length; i++)
			if (counts[i] != 0)
				System.out.println((char) (i + 'A') + ": " + counts[i]);
	}
}