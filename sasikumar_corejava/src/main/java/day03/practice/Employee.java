package day03.practice;

public class Employee {
	 
    private int id;
    private String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("id="+id+", name="+name);
    }
}
