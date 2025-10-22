package exam1020;

public class PartTimeEmployee extends Employee {

	
	private int hour;
	private int amount;
	
	public PartTimeEmployee(String name, String employeeId,int hour, int amount) {
		super(name,employeeId);
		this.hour = hour;
		this.amount = amount;
	}
	
	
	
 	public int getHour() {
		return hour;
	}

 	
	public void setHour(int hour) {
		this.hour = hour;
	}

	
	public int getAmount() {
		return amount;
	}
	
	
	public void setAmount(int amount) {
		this.amount = amount;
	}




	@Override
 	public int calculatePay() {
 		return hour * amount;
 	}
}
