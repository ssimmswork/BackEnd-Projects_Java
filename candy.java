import java.util.Scanner;

public class candy {

	public static void main(String[] args) {
		 final int carton = 24;
		 
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("How Many Candy Bars? ");
		 double candy = scan.nextInt();
		 double numCarton = candy / carton;
		 numCarton = Math.ceil(numCarton);
		
		 
		 System.out.println("You Need " + (int)numCarton + " Cartons");
		 
		
		 scan.close();
	}

}
