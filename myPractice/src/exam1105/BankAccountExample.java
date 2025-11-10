package exam1105;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount("나의 은행", "1234-1234-1234");
		
		
		b.deposit(10000);
		System.out.println(b.getBalance());
		b.withdrawal(5000);
		System.out.println(b.withdrawal(5000));
		System.out.println(b.withdrawal(6000));
		System.out.println(b.getBalance());
	}

}
