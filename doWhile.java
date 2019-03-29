//Author: Shian Simms
//IDE used: Eclipse Photon

import java.util.*;

public class doWhile {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int count = 0;
		
		do {
			
			int roll = rand.nextInt(6) + 1;
			System.out.println(" Roll = " + roll);
						
			count++;
			
		//Counter ends at 5 	
		} while (count <= 5);
	}

	

}
