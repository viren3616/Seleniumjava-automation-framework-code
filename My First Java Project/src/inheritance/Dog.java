package inheritance;

public class Dog extends Animal {

	String size="small";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Dog d1=new Dog();
		
		System.out.println(d1.eyes);
		System.out.println(d1.legs);
		System.out.println(d1.size);
		
		d1.walk();
		d1.run();
	}

}

