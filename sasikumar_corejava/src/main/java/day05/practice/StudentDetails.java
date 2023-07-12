package day05.practice;

//In this code we are creating a department and student objects and initializing the values
//and creating a get method for get student details

class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName,int deptId) {
		// TODO Auto-generated constructor stub
		this.deptName = deptName;
		this.deptId = deptId;
	}
	
}

class Student {
	String name;
	int id;
	Department department;
	
	// Create a constructor and assign depart and respective attributes
	public Student(String name,int id,Department department) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.department = department;
	}
	// Add toString method to get the Student details.
	public void getStudent() {
		System.out.println("Student details");
		System.out.println("Department name : "+department.deptName);
		System.out.println("Department ID : "+department.deptId);
		System.out.println("Student name : "+name);
		System.out.println("Student ID : "+id);
	}
}

// Create a main class to create a Student and Department objects 
// and print the details

public class StudentDetails {
	public static void main(String[] args) {
		
		Department department = new Department("FWSA",1);
		
		Student sasi = new Student("sasi kumar", 7, department);
		
		sasi.getStudent();
		
	}
}
