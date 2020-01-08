import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;


public class dataStructures {
	
	public static String[] test = {"What", " is ", "this"};
	
	public static void main(String[] args){
		
		System.out.println("Array List example: ");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Array List Example 1");
		al.add("Array List Example 2");
		al.add("Array List Example 3");
		Iterator<String> AlIt = al.iterator();
		while (AlIt.hasNext()){
			System.out.println(AlIt.next());
		}

		System.out.println("HashMap example: ");
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("HashMap1", "First hashmap example.");
		hm.put("HashMap2", "Second hashmap example.");
		hm.put("HashMap3", "Third hashmap example.");
		System.out.println("The value of HashMap1 is: " + hm.get("HashMap1"));
		System.out.println("The value of HashMap2 is: " + hm.get("HashMap2"));
		System.out.println("The value of HashMap3 is: " + hm.get("HashMap3"));
		
		System.out.println("TreeMap example: ");
		
		TreeMap<Integer, String> presidents = new TreeMap<Integer, String>();
		presidents.put(44, "Barack Obama");
		presidents.put(35, "John F. Kennedy");
		presidents.put(42, "Bill Clinton");
		Set set = presidents.entrySet();
		Iterator PresidentIt = set.iterator();
		while (PresidentIt.hasNext()){
			Map.Entry mentry = (Map.Entry)PresidentIt.next();
			System.out.println("The " + mentry.getKey() + " president of the U.S was " + mentry.getValue());
		}
		
		System.out.println("Linked List example: ");
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("This is the second item in the linked list.");
		ll.add("This is the fourth item in the linked list.");
		ll.add("This is the fifth item in the linked list.");
		ll.add("This is the sixth item in the linked list.");
		
		ll.addFirst("This is the first item in the linked list.");
		ll.add(2, "This is the third item in the linked list.");
		ll.addLast("This is the seventh (last) item in the linked list.");
		
		Iterator<String> LlIt = ll.iterator();
		while(LlIt.hasNext()){
			System.out.println(LlIt.next());
		}
		
		String[] strArr = {"This", "is", "a", "string", "array" };
		for (String printArr : strArr){
			System.out.print(printArr + " ");
			
		}
		System.out.print("with the type " + strArr[3].toUpperCase() + ".");
		System.out.print("\n");
		
		Queue<String> testQueue = new LinkedList<>();
		testQueue.add("TestQueue1");
		testQueue.add("TestQueue2");
		testQueue.add("TestQueue3");
		
		System.out.println("The test queue holds the following: " + testQueue);
		String remove = testQueue.remove();
		
		System.out.println("Removed " + remove + " from the test queue so now the new queue after removal is: " + testQueue);
		
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		Arrays.sort(x);
		
		for (String item : test) {
	        System.out.print(item);
		}


	    
	}
}
