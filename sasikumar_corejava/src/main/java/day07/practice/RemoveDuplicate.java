package day07.practice;
import java.util.*;
/*
 * Question#1: Create an ArrayList<Integer> of numbers with duplicate entries. Use an HashSet<Integer> 
 * to remove the duplicates and display the Unique values
 * 
 * example :-
 * 
 * [1,2,2,3,3,4,4,4,5,6,7] => [1,2,3,4,5,6,7]
 */


public class RemoveDuplicate {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//Adding elements to the array
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(4);
		
		HashSet<Integer> uniqueArray = new HashSet<>(arr);
		
		for(int element : uniqueArray){
			
			System.out.print(element + " ");
		}
	}
}
