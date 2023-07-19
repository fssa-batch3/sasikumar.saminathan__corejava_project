package day09.practice;
import java.util.*;
/*
	 * Using the ArrayList<Integer> sort a list of integers read from the user
	
	Sample Input: 
	
	*Enter numbers: 8 9 45 12 1*
	
	Sample Output: 
	
	*Sorted list: 1 8 9 12 45*
 */
public class NumberSorting {
	
	public static boolean sort(ArrayList<Integer> arr) throws IllegalArgumentException{
		
		if(arr == null){
			throw new IllegalArgumentException("Array cannot be null");
		}
		
		Collections.sort(arr);
		
		System.out.print("Sorted array : ");
		for(int ele : arr){
			System.out.print(ele+" ");
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
			
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println("Enter the count of element below");
		
		//Store the count of giving numbers
		int end = s.nextInt();
		
		for (int i = 0; i < end; i++) {
			int a = s.nextInt();
			
			//Adding number to the arraylist
			arr.add(a);
		}
		
		s.close();
		
	}
}
