package exam1013;

public class BulgogiPizza extends Pizza {
	public BulgogiPizza() {
		this("M");
	}
	
	public BulgogiPizza(String size) {
		this.name = "BulgogiPizza";
		this.size = size;
		this.prices = new int[] {10000, 12000, 14000};
		this.toppings = "Bulgogi";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "를 추가했습니다.");
		System.out.println(name + size + "이 완성되었습니다.");
	}
}