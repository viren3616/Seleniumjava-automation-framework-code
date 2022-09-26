package overriding;

public class Cat extends Animal {
	public void sound() {
		System.out.println("meow meow");
		
	}
	public static void main(String args[]) {
		Cat c1=new Cat();
		c1.walk();
		c1.run();
		c1.sound();
	}
}
