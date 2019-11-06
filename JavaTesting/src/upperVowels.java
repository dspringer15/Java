import java.util.Scanner;

public class upperVowels {
	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a string.");
		
		String input = userInput.nextLine();
		
		String original = input;
		
		input = input.replace('a', 'A');
		input = input.replace('e', 'E');
		input = input.replace('i', 'I');
		input = input.replace('o', 'O');
		input = input.replace('u', 'U');
		
		System.out.println("The original string you entered is: " + original + "\nThe string with capitilized vowels is: " + input);
	}
}
