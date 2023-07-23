package day09.practice;

import java.time.LocalDate;
import java.util.*;



public class TaskSorting {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2023, 1, 8);
		LocalDate date2 = LocalDate.of(2021, 1, 8);
		LocalDate date3 = LocalDate.of(2022, 1, 8);
		
		TaskNew task1 = new TaskNew(1, "sasi",date1);
		TaskNew task2 = new TaskNew(2, "pranaw",date2);
		TaskNew task3 = new TaskNew(3, "sandeep",date3);
		
		List<TaskNew> list = new ArrayList<TaskNew>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}
