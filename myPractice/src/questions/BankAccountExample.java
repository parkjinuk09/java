package questions;

public class BankAccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ab = new BankAccount("박진욱", "1234-1234-1234",0);
		
		System.out.println(ab.deposit(10000));	//10000원 입금
		
		System.out.println(ab.withdrawal(5000));	//5000원 출금
		
		
		System.out.println(ab.withdrawal(6000));
		
		System.out.println("잔고 : " + ab.getBalance());
		
		
		
		
	}

}
