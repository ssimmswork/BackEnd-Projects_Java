//Author: Shian Simms
//IDE used: Eclipse Photon

public class Characters {

	public static void main(String[] args) {

		final String word = "Art Is Great";
		final int num = 3;

		
		System.out.println(countA(word));
		System.out.println(multiConcat(word, num));
		
	}

	public static int countA(String word) {
		int letterA = 0;
		word = word.toUpperCase();

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == 'A') {

				letterA++;
			}

		}

		return letterA;
	}

	public static String multiConcat(String word, int num) {
		String concat = word;
		
		for (int i = 1; i < num; i++) {

			concat += word;

		}

		return concat;
	}
}
