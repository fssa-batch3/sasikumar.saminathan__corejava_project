package day09.testcase;
import java.time.LocalDate;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestTasks {
	
	@Test
	public void TestTaskName(){
		try {
			Assertions.assertTrue(ValidateTask.validateTaskName("Practice java"));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task name cannot be null or empty", e.getMessage());
		}
	}
	
	@Test
	public void TestTaskId(){
		try {
			Assertions.assertTrue(ValidateTask.validateId(7));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task id is not valid", e.getMessage());
		}
	}
	
	@Test
	public void TestTaskDeadline(){
		
		LocalDate date = LocalDate.of(2023, 7, 15);
		
		try {
			Assertions.assertTrue(ValidateTask.validateDeadline(date));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Deadline date cannot be null or in the past", e.getMessage());
		}
	}
	
//	public void testTask(){
//		
//		LocalDate date = LocalDate.of(2023, 7, 15);
//		
//		Task task =	new Task(1, "Practice java",date);
//		
//		try {
//			Assertions.assertTrue(ValidateTask.validate(task));
//		} catch (Exception e) {
//			Assertions.assertEquals("Argument is null", e.getMessage());
//		}
//		
//	}
	
}
