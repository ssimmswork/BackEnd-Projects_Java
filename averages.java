import java.util.Scanner;

public class averages {

	public static void main(String[] args) {

		String[] input = new String[10];
		int total = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= input.length - 1; i++) {

			// User input \\
			System.out.println("Enter a number: ");
			String num = scan.next();

			// total of entered numbers \\
			total += Integer.parseInt(num);
		}

		// Average & output \\
		System.out.println("The average of the numbers entered is " + (total / input.length - 1));

	}

}
