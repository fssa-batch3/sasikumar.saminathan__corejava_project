package day12.solved;
import java.sql.*;

/**
 * @author BharathwajSoundarara
 *
 */
public class TestUserUpdatePassword {
		 
	    public static void main(String[] args) throws Exception {
			String url = "jdbc:mysql://localhost:3306/users";
			String userNameSql = "root";
			String passwordSql = "123456";

			Connection connection = DriverManager.getConnection(url, userNameSql, passwordSql);
	        
	 
	        // Input
	        String userName = "<username>";
	        String password = "<password>";
	        
	       
	        // DEPOSIT
	        String query = "UPDATE users SET password=? WHERE user_name=?";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, password);
	        pst.setString(2, userName);
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated" + rows);
	    }
	 
	
}
