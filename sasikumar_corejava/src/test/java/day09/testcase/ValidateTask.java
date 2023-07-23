package day09.testcase;
import day09.practice.*;
import java.time.LocalDate;

/*
 *  Validate Tasks Object
 *  attributes:-
 *  
 *  1. taskName
 *  2. TaskId
 *  3. Deadline
 */

public class ValidateTask {
		
		public static boolean validate(TaskNew task) throws IllegalArgumentException {
			
			//Check whether the object is null or not
			if(task == null) {
				throw new IllegalArgumentException("Argument is null");
			}
			
			validateId(task.getId());
			validateTaskName(task.getName());
			validateDeadline(task.getDeadline());
			
			return true;
			
		}
		
		//validate the TaskName if it's empty or null throw exception or return true
		public static boolean validateTaskName(String taskname) throws IllegalArgumentException {
			if(taskname == null || "".equals(taskname.trim()) || taskname.length() < 3){
				throw new IllegalArgumentException("Task name cannot be null or empty");
			}
			return true;
		}
		
		//Validate ID
		public static boolean validateId(int id) throws IllegalArgumentException {
			if(id < 0 || id < Integer.MAX_VALUE){
				throw new IllegalArgumentException("Task id is not valid");
			}
			return true;
		}		
		
		//Validate the date if if it's null or past date it's not a valid date
		public static boolean validateDeadline(LocalDate date) throws IllegalArgumentException{
	        if (date == null || date.isBefore(LocalDate.now())) {
	            throw new IllegalArgumentException("Deadline date cannot be null or in the past");
	        }
	        return true;
		}
}


