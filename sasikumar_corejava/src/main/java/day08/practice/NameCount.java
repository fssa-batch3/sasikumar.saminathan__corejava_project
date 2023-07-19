package day08.practice;
import java.util.HashMap;
import java.util.Map;

/*

Question#1: Read comma separated list of names from the user and print count 

Sample Input

Enter the string: Ram, Ram, Superman, spider, hey, hello, hey, Spider

Output

Ram: 2

Superman: 1

Spider: 2

hey: 2

hello: 1
 */

public class NameCount {
	
	public static boolean Count(String[] arr) throws IllegalArgumentException{
		
		if(arr == null){
			throw new IllegalArgumentException("Array cannot ba a null");
		}
		
		for(String ele : arr) {
			
			if(ele == null){
				throw new IllegalArgumentException("Array elements cannot be a null");
			}
		}
		
		Map<String,Integer> countMap = new HashMap<String,Integer>();
		
		for(int i = 0; i < arr.length; i++){
			
			//If it's not have any value set 1 as a value
			if(countMap.get(arr[i]) == null){
				countMap.put(arr[i], 1);
			}
			//if it's already have an value increase that value
			else{
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i],count);
			}
		}
	
		for(String ele : countMap.keySet()){
			
			Integer count = countMap.get(ele);
			System.out.println(ele+": "+count);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider"};
		
		NameCount.Count(arr);
		
	}
}
