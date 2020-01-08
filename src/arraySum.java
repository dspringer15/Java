import java.math.*;
import java.text.*;
import java.util.*;

public class arraySum {

    static int simpleArraySum(int[] ar) {
    	int sum = 0; 
    	for( int num : ar) {
    		sum = sum+num; 
    	}
		return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
   try{
        System.out.println("How many number do you want to enter into your array?");
        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];
        
        System.out.println("Enter each number of your array separating each number by a space.");
        String[] arItems = scanner.nextLine().split(" ");
        

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        System.out.println("Your new array is " + Arrays.toString(ar) + " and the sum of the array is " +result);
    
   }
   catch (NumberFormatException exception){
	   System.out.println("You did not enter a valid number.");
   }
   }
}
   
