package day07.practice;


import java.time.LocalDate;
import java.util.*;

/*
 * This code contains task creating class with task name and priority and also
 *  we can find the task there in a list or not 
 */



public class RemoveDuplicateTasks {
	public static void main(String[] args) {

		List<Task> arr = new ArrayList<Task>();
		
		LocalDate date = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2023, 5, 10);
		
		// Creating tasks
		Task task1 = new Task(1,"wake-up",date);
		Task task2 = new Task(2,"wake-up",date);
		Task task3 = new Task(3,"write",date2);

		// Push the task objects into array
		arr.add(task1);
		arr.add(task2);
		arr.add(task3);
		
		
		HashSet<Task> arr2 = new HashSet<Task>(arr);
		
		for(Task ele : arr2){
			System.out.println(ele.toString());
		}
		
		

	}
}

