import java.util.Arrays;


public class sorting {
	
	public static void main(String [] args){
		int[] unsortedNums = {2, 7, 12, 72, 1, 6, 89};
		
		System.out.println("The unsorted array is :" + Arrays.toString(unsortedNums));
		Arrays.sort(unsortedNums);
		System.out.println("The sorted array is :" + Arrays.toString(unsortedNums));
		Arrays.binarySearch(unsortedNums, 2);
	}

}
