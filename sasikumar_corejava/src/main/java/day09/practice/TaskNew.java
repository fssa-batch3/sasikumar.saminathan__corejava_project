package day09.practice;

import java.time.LocalDate;

public class TaskNew implements Comparable<TaskNew> {
	private int id;
	private String name;
	private LocalDate deadline;
	
	public TaskNew(int id,String name,LocalDate deadline) {
		
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
	public int compareTo(TaskNew task) {

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
