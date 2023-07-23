package day12.testcase;
import day12.practice.*;
import day12.practice.TaskDAO;
import day11.practice.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestTaskDAO {

    
    @Test
    public void testCreateTask() throws DAOException {
        // Create a new Task object with test data
        Task task = new Task();
        task.name = "Testing Task";
        task.status = "New";

        // Call the createTask method
        TaskDAO.createTask(task);

        // Now, you can retrieve the task using getAllTasks and verify if it was created successfully
        List<Task> allTasks = TaskDAO.getAllTasks();
        boolean taskFound = false;
        for (Task t : allTasks) {
            if (t.name.equals("Testing Task") && t.status.equals("New")) {
                taskFound = true;
                break;
            }
        }

        // Assert that the task was found in the list
        Assertions.assertTrue(taskFound);
    }

    @Test
    public void testGetAllTasks() throws DAOException {
        // This test case will check if the getAllTasks method returns a non-empty list
        List<Task> allTasks = TaskDAO.getAllTasks();

        // Assert that the list is not null and not empty
        Assertions.assertFalse(allTasks.isEmpty());
    }
}
