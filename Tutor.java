import java.util.Scanner;

public class Tutor {

	public static void main(String[] args) {

		Boolean i = true;

		Scanner scan = new Scanner(System.in);
		int count = 0;

		do {

			System.out.println("Enter in the first number: ");
			int numOne = scan.nextInt();

			System.out.println("Pick a math symbol (1 - 4)");
			System.out.println("+ = 1 \n- = 2 \n/ = 3   \n* = 4 \n");
			int sym = scan.nextInt();

			System.out.println("Enter in the secound number:");
			int numTwo = scan.nextInt();
			
			
			double ans = 0;
			String a = "";

			switch (sym) {

			case 1:
				ans = numOne + numTwo;
				a = "+";
				break;
			case 2:
				ans = numOne - numTwo;
				a = "-";
				break;
			case 3:
				ans = numOne / numTwo;
				a = "/";
				break;
			case 4:
				ans = numOne * numTwo;
				a = "*";
				break;

			}
			
			System.out.println("Enter your answer: ");
			int userAnswer = scan.nextInt();
			System.out.println("\n");
			System.out.println(numOne + "\n" + a + numTwo + "\n_______\n" + userAnswer);
			
			if (ans == userAnswer) {
				
				System.out.println("Your Answer is Correct");
			} else {

				System.out.println("Your Answer is Incorrect try again ");
			}

			System.out.println("Would you like to try another equation. \nEnter Yes (0) No (1)\n");
			int cycle = scan.nextInt();

			if (cycle == 1) {
				count++;
				System.out.println(count);
				i = false;
			}

			count++;
		} while (i);

		scan.close();
	}
}