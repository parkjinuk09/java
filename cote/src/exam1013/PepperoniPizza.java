package exam1013;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() { this("M"); }
	public PepperoniPizza(String size) {
		this.name = "PepperoniPizza";
		this.size = size;
		this.prices = new int[] {10000, 20000, 30000};
		this.toppings = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "를 추가했습니다.");
		System.out.println(name + size + "이 완성되었습니다.");
	}
}
