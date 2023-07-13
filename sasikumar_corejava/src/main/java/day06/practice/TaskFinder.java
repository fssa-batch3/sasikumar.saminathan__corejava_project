package day06.practice;

import java.util.List;

public class TaskFinder {
	
	//Creating a task finding method
	public static boolean find(List<Task> arr, String string) {
		 
		for(int i = 0; i < arr.size(); i++) {
			
			if( string.equals((arr.get(i)).taskName)){
				return true;
			}
		}
		return false;
	} 
}
