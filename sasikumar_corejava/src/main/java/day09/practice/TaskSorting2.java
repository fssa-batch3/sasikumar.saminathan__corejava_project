package day09.practice;

import java.time.LocalDate;
import java.util.*;

		class Task2 implements Comparable<Task2> {
			
			private int priority;
			private String name;
			private LocalDate deadline;
			
			public Task2(int priority,String name,LocalDate deadline) {
				
				this.priority = priority;
				this.name = name;
				this.deadline = deadline;
			}

			public int getPriority() {
				return priority;
			}

			public void setPriority(int id) {
				this.priority = priority;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public LocalDate getDeadline() {
				return deadline;
			}

			public void setDeadline(LocalDate deadline) {
				this.deadline = deadline;
			}
			
			@Override
			public int compareTo(Task2 task) {

				if (deadline.equals(task.getDeadline())) {
					if(priority == task.priority) {
						return 0;
					}
					else if(priority < task.priority){
						return -1;
					}
					else {
						return 1;
					}
				} else {
					if (deadline.isAfter(task.getDeadline())) {
						return 1;
					} else {
						return -1;
					}
				}
			}

			@Override
			public String toString() {
				return "Task [priority=" + priority + ", name=" + name + ", deadline=" + deadline + "]\n";
			}
			
			
			
			
		
		}

public class TaskSorting2 {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2022, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 1, 8);
		LocalDate date3 = LocalDate.of(2022, 1, 8);
		
		Task2 task1 = new Task2(3, "sasi",date1);
		Task2 task2 = new Task2(4, "pranaw",date2);
		Task2 task3 = new Task2(1, "sandeep",date3);
		
		List<Task2> list = new ArrayList<Task2>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}

