import java.util.Scanner;

public class reverse{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a string.");
    
        String input = userInput.nextLine();  // Read user input
        String revInput = new StringBuffer(input).reverse().toString();
        System.out.println("The string you entered is: " + input + ".\nThat string in reverse is: " + revInput);  // Output user input
        
        if (input.equalsIgnoreCase(revInput)){
        	System.out.println("This string is a palindrome.");
        } 
        else {
        	System.out.println("This string is not a palindrome.");
        }
    }
}