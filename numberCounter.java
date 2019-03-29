
public class numberCounter {

	public static void main(String[] args) {

		// Stores numbers into a array \\

		int nums[] = { 10, 10, 20, 20, 5, 5, 5, 5, 6, 2, 3, 4, 10 };
		int countNum[] = new int[51];

		// Counts occurrences \\

		for (int i = 0; i < nums.length; i++) {

			countNum[nums[i]]++;

		}

		for (int i = 0; i < countNum.length; i++) {

			if (countNum[i] > 0) {

				System.out.println("The Number " + i + " Occurres " + countNum[i]);

			}
		}
	}

}
