package exam1020;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("jinuk","1234-1234-1234");
		//BankAccount account = new BankAccount("이자","1234-1234-1234");
		
		
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalance());
		
		int amount = account.withdrawwal(5000);
		System.out.println(amount);
		System.out.println(account.getBalance());
		
		amount = account.withdrawwal(6000);
		System.out.println(amount);
		System.out.println(account.getBalance());
	}

}
