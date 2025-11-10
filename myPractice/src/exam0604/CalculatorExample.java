package exam0604;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		
		c.powerOn();
		
		int result1 = c.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		
		byte int1 = 10;
		byte int2 = 4;
		
		double result2 = c.divide(int1,int2);
		System.out.println("result2 : " + result2);
		
		c.powerOff();
	}

}
