package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("박자바","010-1234-1234");
		Customer c2 = new Customer("이자바","010-1212-1212",100);
		
		
		System.out.println(c1.updatePoint(50));
		System.out.println(c2.updatePoint(-50));
		c2.setPoint(200);
		System.out.println(c2.getPoint());
		
	}

}
