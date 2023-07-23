package day11.practice;
import java.sql.*;



public class TaskDAO {
	
	public static boolean createTask(Task2 task) throws DAOException {
	    // Write code here to get connection
	    String url = "jdbc:mysql://localhost:3306/task";
	    String userName = "root";
	    String password = "123456";

	    Connection connection;
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			throw new DAOException("cannot create connection");
		}

	    // Create insert statement
	    String query = "INSERT INTO task (id, name, status) VALUES (?, ?, ?)";

	   try {
		   PreparedStatement preparedStatement = connection.prepareStatement(query);

		    int id = task.id;
		    String name = task.name;
		    String status = task.status;

		    preparedStatement.setLong(1, id);
		    preparedStatement.setString(2, name);
		    preparedStatement.setString(3, status);

		    // Execute insert statement using the prepared statement
		    int rows = preparedStatement.executeUpdate();
		    System.out.println("No of rows inserted: " + rows);
		    preparedStatement.close();
	} catch (SQLException e) {
		throw new DAOException("cannot run preperd statement");
	}
	    

	    // Close connection
	    // Step 04: close the connection resources
	    try {
			connection.close();
		} catch (SQLException e) {
			throw new DAOException("cannot close connection");
		}
	    
	    return true;
	}
	
	public static void main(String[] args) {
		
		Task2 task1 = new Task2(2,"sasikumar","pending");
		try {
			createTask(task1);
		} catch (DAOException e) {
		
			e.printStackTrace();
		}
	}
}
