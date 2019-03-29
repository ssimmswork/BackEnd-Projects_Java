import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
public class SentanceReverse {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = scan.nextLine();
		
		String wordStorage[] = sentence.split("");
		
		Stack<String> wordReverse = new Stack<String>();
		for(String word : wordStorage) {
			wordReverse.push(word);
		}
		
		System.out.println("Sentence in Reverse ");
		
		while(wordReverse.empty() == false) {
			System.out.print(wordReverse.pop() + " ");
		}
	}

}
