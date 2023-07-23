package day11.testcase;
import day11.practice.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskDAO {
	@Test
	void testCreateTask() throws DAOException {
		Task2 task = new Task2(8,"sleeping","pending");
		Assertions.assertTrue(TaskDAO.createTask(task));
	}
	@Test
	void testInvalidCreateTask(){
		try {
			Assertions.assertTrue(TaskDAO.createTask(null));
		} catch (DAOException e) {
			Assertions.assertEquals("cannot run prepared statement", e.getMessage());
			e.printStackTrace();
		}
	}
}