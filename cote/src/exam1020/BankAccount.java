package exam1020;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balance = 0;	//잔고
	private static int count = 0;
	
	public BankAccount(String name,String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	public BankAccount(String name,String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	
	public int withdrawwal(int amount) {

		
		int finalAmount = amount > balance ? balance : amount;
		balance -= finalAmount;
		return finalAmount;
		
	}
	
	public static int getCount()
	{
		return count;
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}


