//Author: Shian Simms
//IDE used: Eclipse Photon

import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int sides, num, roll, sum, ave;
		int run = 3;
		
		System.out.println("How Many Sides?");
		sides = scan.nextInt();
		
		num = ran.nextInt(sides) + 1;
		System.out.println("First Roll\t=" + num);
		roll = num;
		num = ran.nextInt(sides)+1;
		System.out.println("Secound Roll\t=" + num);
		roll += num;
		num = ran.nextInt(sides)+1;
		System.out.println("Third Roll\t=" + num);
		roll += num;
		
		System.out.println("Die Total\t=" + roll);
		System.out.println("Average roll\t=" + (roll / run));
	
		scan.close();
	}
	}
