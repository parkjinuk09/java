package sec03.exam02;

public class Dog extends Animal {
	public Dog() {
		this.Kind = "포우류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
