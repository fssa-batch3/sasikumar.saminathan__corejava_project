package day04.solved;

public class name extends Animal2 {

	public name(String name) {
		super(name);		// Calling the constructor of Animal class
		System.out.println("Calling Child Constructor");
	}

	private void roar() {
		System.out.println("The " + getAge() + " year old " + getAge() + " says: Roar!");
	}

	public static void main(String[] args) {
		name simba = new name("Simba");
		simba.setAge(10); // setAge() method was not defined in Lion; it is inherited from Animal
		simba.roar();
	}
}
