package day01.practice;
/*
* 	Create a class called cat with an attributes of the classes 
*/

public class Cat {

	int	Age;
	String Color;
	String Speaks;
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getSpeaks() {
		return Speaks;
	}
	public void setSpeaks(String speaks) {
		Speaks = speaks;
	}
	
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setAge(2);
		cat1.setColor("brown");
		cat1.setSpeaks("meow-chan");
		
		Cat cat2 = new Cat();
		cat2.setAge(4);
		cat2.setColor("white");
		cat2.setSpeaks("meowwwww");
		
        // Print the attributes of each Cat
        System.out.println("Cat 1:");
        System.out.println("Age : "+cat1.getAge());
        System.out.println("Color: "+cat1.getColor());
        System.out.println("Speaks : "+ cat1.getSpeaks());
        
        System.out.println("Cat 2:");
        System.out.println("Age : "+cat2.getAge());
        System.out.println("Color: "+cat2.getColor());
        System.out.println("Speaks : "+ cat2.getSpeaks());

	}
	
	
}
