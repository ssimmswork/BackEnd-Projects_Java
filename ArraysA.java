import java.util.Scanner;

public class ArraysA {
	
	public static void main(String[] args) {
		
		double interestRates[] = new double[60];
		
		//// Third element reference 
		
		interestRates[2] = 2.45;
		
		int  scores[] = new int[20];
		
		/// last element
		
		scores[19] = 10;
		
		String characters[] = new String[25];
		
		/// first element 
		
		characters[0] = "H"; 

		/////////////// 2nd \\\\\\\\\\\\\\
		
		
		double  prices[] = new double[4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int count = 0; count <= prices.length - 1; count++) {
		System.out.println("Enter the" + " " + (count +1) + " price.");
		prices[count] = scan.nextDouble();
		                
		}
		
		scan.close();
		
		for(int count = prices.length - 1; count >=  0; count--) {
			
			System.out.println(prices[count]);
		}
		
		
		
		
/////////////// 3rd \\\\\\\\\\\\\\
		
	int  counter = 0;
	int  nums[] = new int[5];
	
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	nums[3] = 40;
	nums[4] = 20;
	
	for (int count = 0; count < nums.length - 1; count++) {
		
		if (nums[count] == 20) {
						
			counter++;
			
		}	
		
	}
	
	System.out.println(counter);
			
  int num[] = new int[5];
  

	for (int count = 0; count > nums.length -1; count++) {
		
		num[count] = nums[count];
	}
		
	
	for (int count = 0; count > num.length - 1; count++) {
		
		System.out.println(num[count]);
		
	}
	
		
			
		
		}
		
		
		
	}
	
	


