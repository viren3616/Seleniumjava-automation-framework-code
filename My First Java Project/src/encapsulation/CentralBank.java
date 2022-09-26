package encapsulation;

public class CentralBank {
	
	private String intrate="8%";
	
	public void deposit() {
		System.out.println("Deposit the amount");
		
	}
	
	public void withdrow() {
		System.out.println("Withdrow the amount");
}

	public String getIntrate() {
		return intrate;
	}

	public void setIntrate(String intrate) {
		this.intrate = intrate;
	}
}