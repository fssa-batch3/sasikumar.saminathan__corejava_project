package day06.testcase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestTasks {
	
	@Test
	public void TestTaskName(){
		try {
			Assertions.assertTrue(ValidateTasks.validateTaskName("Learn java"));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task name cannot be null or empty", e.getMessage());
		}
	}
	
	@Test
	public void TestTaskpriority(){
		try {
			Assertions.assertTrue(ValidateTasks.validatePriority(7));
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Task priority is not valid", e.getMessage());
		}
	}
	
}
