package day06.practice;
import java.util.*;
/*
 *  Added logic to remove duplicate tasks from the ArrayList
 */
public class RemoveDuplicate {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		 // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // Add array elements to the HashSet
        for (String element : cityList) {
            set.add(element);
        }
        
        //Print the removed elements
        for(String ele : set) {
        	System.out.println(ele);
        }
        
        
	}
}
