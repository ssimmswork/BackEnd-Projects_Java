import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a month ( Example: enter 03 for march): ");
		int month = scan.nextInt();
		
		System.out.println("Please enter a day: ");
		int day = scan.nextInt();
		
		System.out.println("Please enter a year ( Example: enter 03 for 2003): ");
		int year = scan.nextInt();
		
		int num = month * day;
		
	if(num != year ) {
			
			System.out.println(" The date is not Magic");
			
		}
		
	else
		System.out.println(" The date is Magic");

	}

}
