package day06.practice;

import java.util.*;

/*
 * This code contains task creating class with task name and priority and also
 *  we can find the task there in a list or not 
 */

public class Task {

	public String taskName;

	public int priority;

	public Task(String taskName, int priority) {
		// TODO Auto-generated constructor stub
		this.taskName = taskName;
		this.priority = priority;
	}

}

	class AddTask {
	public static void main(String[] args) {

		List<Task> arr = new ArrayList<Task>();

		// Creating tasks
		Task task1 = new Task("practice java", 10);
		Task task2 = new Task("practice DSA", 8);
		Task task3 = new Task("practice English", 7);

		// Push the task objects into array
		arr.add(task1);
		arr.add(task2);
		arr.add(task3);

		if (TaskFinder.find(arr, "practice java")) {
			System.out.println("Task founded");
		} else {
			System.out.println("Task not founded");
		}

	}
}
