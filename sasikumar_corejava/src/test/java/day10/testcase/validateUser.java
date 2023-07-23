package day10.testcase;
import java.util.regex.Pattern;
import day10.practice.*;

public class validateUser{
	
	public static boolean validateObj(User user) throws IllegalArgumentException{
		if(user == null) {
			throw new IllegalArgumentException("Argument is null");
		}
		validateEmail(user.emailId);
		validateName(user.name);
		validateId(user.id);
		return true;
	}
	
	public static boolean validateEmail(String email) throws IllegalArgumentException{
		
		//Pattern for email
		String emailPattern = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$";
		
		//If it's match with argument email it will return true else false
		Boolean isMatch = Pattern.matches(emailPattern, email);
		
		if(!isMatch){
			throw new IllegalArgumentException("Invalid email");
		}
		
		return true;
		
	}
	
	public static boolean validateName(String name) throws IllegalArgumentException{
		
		if(name == null || name.isEmpty() || name.length() < 2){
			throw new IllegalArgumentException("Name is invalid");
		}
		return true;
		
	}
	
	public static boolean validateId(int id) throws IllegalArgumentException{
		if( id < 0 || id > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("Id is not valid");
		}
		return true;
	}
}


