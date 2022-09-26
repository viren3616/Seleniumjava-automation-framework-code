package encapsulation;

public class citibank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralBank c1=new CentralBank();
		System.out.println(c1.getIntrate());
		
		c1.setIntrate("10%");
		System.out.println(c1.getIntrate());
		
		c1.deposit();
		c1.withdrow();

	}

}
