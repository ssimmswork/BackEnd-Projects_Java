package Exceptions;

import java.util.Scanner;
import java.io.*;

public class Warning {
	public static void main(String[] args) throws IOException {
		int creditHrs, count = 0; // number of semester hours earned
		double qualityPts; // number of quality points earned
		double gpa; // grade point (quality point) average
		String name;

// Set up scanner to input file

		try {
			Scanner inFile = new Scanner(new File("c:\\students.dat"));

			System.out.println("\n Students on Academic Warning\n");

			while (inFile.hasNext()) {
				// Get the name, credit hours and quality points and
				// determine if the student is on warning. If so,
				// display the student's name.
				count++;
				name = inFile.next();
				creditHrs = Integer.parseInt(inFile.next());
				qualityPts = Double.parseDouble(inFile.next());

// Insert gpa calculation
// and statement to determine if the student name is listed.

				gpa = creditHrs / qualityPts;

				if (gpa < 2.0) {

					System.out.println(name);

				}
			}

			inFile.close();
		}
//insert catch statements
		catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		} catch (NumberFormatException ex) {
			System.out.println("Number Error For Record " + count);
		}

	}
}