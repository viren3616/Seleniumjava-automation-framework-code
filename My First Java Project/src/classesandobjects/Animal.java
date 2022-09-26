package classesandobjects;

public class Animal {

	int legs=4;
	int eyes=2;
	int ears=2;
	
	public void walk() {
		System.out.println("I can walk");
	}
	public void run() {
		System.out.println("I can run");
	}
	
	
	public static void main(String args[]) {
		Animal cat=new Animal();
		
		System.out.println(cat.ears);
		System.out.println(cat.eyes);
		
		cat.run();
		cat.walk();
		
Animal dog=new Animal();
		
		System.out.println(dog.ears);
		System.out.println(dog.eyes);
		
		dog.run();
		dog.walk();
		
	}
}
