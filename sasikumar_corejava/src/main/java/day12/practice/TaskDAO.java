package day12.practice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import day11.practice.DAOException;

public class TaskDAO {
	public static Connection getConnection() throws DAOException {

		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/task"; // url for to connect local database
		String userName = "root";
		String passWord = "123456";
		try {
//	            Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DAOException("Unable to connect to the database");
		}
		return connection;
	}

	public static void createTask(Task task) throws DAOException {
		// Write code here to get connection
		Connection connection = null;
		try {
			// Create insert statement
			String query = "INSERT INTO task (name, status) VALUES (?, ?)";
			connection = getConnection();

			// Execute insert statement
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error in creating task", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error in closing connection", e);
			}
		}
	}

	public void updateTask(Task task) throws DAOException {
	
		Connection connection = null;
		try {
			// Create update statement using task id
			String query = "UPDATE task SET name = ?, status = ? WHERE id = ?";
			connection = getConnection();

			// Execute update statement using task id
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.setInt(3, task.id);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error in updating task", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}

	public void deleteTask(int taskId) throws DAOException {
		
		Connection connection = null;
		try {
			// Create delete statement query task id
			String query = "DELETE FROM task WHERE id = ?";
			connection = getConnection();

			// Execute delete statement 
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setInt(1, taskId);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error deleting task", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}

	public static List<Task> getAllTasks() throws DAOException {
		// Write code here to get connection
		Connection connection = null;
		try {
			// Create a Select all query
			String query = "SELECT * FROM task";
			connection = getConnection();

			// Execute query
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			// Create an ArrayList for get and insert all task from databse  
			List<Task> tasks = new ArrayList<>();
			while (resultSet.next()) {
				Task task = new Task();
				task.id = resultSet.getInt("id");
				task.name = resultSet.getString("name");
				task.status = resultSet.getString("status");
				tasks.add(task);
			}
			return tasks;
		} catch (SQLException e) {
			throw new DAOException("Error fetching tasks", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Task task1 = new Task();
		task1.name = "workout";
		task1.id = 5;
		task1.status = "completed";
		try {
			createTask(task1);
			System.out.println(getAllTasks().toString());
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
