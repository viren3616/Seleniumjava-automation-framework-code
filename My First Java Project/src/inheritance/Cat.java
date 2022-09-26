package inheritance;

public class Cat extends Animal {
	
	String size="small";
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cat c1=new Cat();
		
		System.out.println(c1.eyes);
		System.out.println(c1.legs);
		System.out.println(c1.size);
		
		c1.walk();
		c1.run();
	}

}
