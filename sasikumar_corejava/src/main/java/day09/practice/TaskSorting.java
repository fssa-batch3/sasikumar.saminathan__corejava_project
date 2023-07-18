package day09.practice;

import java.time.LocalDate;
import java.util.*;

		class Task implements Comparable<Task> {
			private int id;
			private String name;
			private LocalDate deadline;
			
			public Task(int id,String name,LocalDate deadline) {
				
				this.id = id;
				this.name = name;
				this.deadline = deadline;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
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
			public int compareTo(Task task) {

				if (deadline.equals(task.getDeadline())) {
					return 0;
				} else {
					if (deadline.isAfter(task.getDeadline())) {
						return 1;
					} else {
						return -1;
					}
					// return ( this.balance > o.getBalance()) ? 1: -1;
				}
			}

			@Override
			public String toString() {
				return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
			}
			
			
			
			
		
		}

public class TaskSorting {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2023, 1, 8);
		LocalDate date2 = LocalDate.of(2021, 1, 8);
		LocalDate date3 = LocalDate.of(2022, 1, 8);
		
		Task task1 = new Task(1, "sasi",date1);
		Task task2 = new Task(2, "pranaw",date2);
		Task task3 = new Task(3, "sandeep",date3);
		
		List<Task> list = new ArrayList<Task>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
