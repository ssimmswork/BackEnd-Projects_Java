
public class Arry {

	public static void main(String[] args) {
/////////////// 3rd \\\\\\\\\\\\\\
		
	int  counter = 0;
	int  nums[] = new int[5];
	
	nums[0] = 10;
	nums[1] = 20;
	nums[2] = 30;
	nums[3] = 40;
	nums[4] = 20;
	
	for (int count = 0; count > nums.length - 1; count++) {
		
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
