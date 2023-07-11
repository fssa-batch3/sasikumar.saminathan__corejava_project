package day03.practice;

class User{
	
	private String name;
	private String password;
	private String email;
	
	//Default constructor
	User(){}
	
	//Overloaded construcor
	User(String name, String password, String email){
		this.name = name;
		this.password =  password;
		this.email = email;
	}
}

public class Userdata {
	public static void main(String[] args) {
		User user = new User("sasi","3939j","ssasoo2lf"); 
	}

}
