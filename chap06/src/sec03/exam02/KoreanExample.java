package sec03.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean k1 = new Korean("박자바","011225-1234566");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.snn : " + k1.ssn);
		
		Korean k2 = new Korean("김자바", "930525-0654321");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.snn : " +  k2.ssn);
	}

}
