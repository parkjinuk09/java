package exam1013;

import java.util.Scanner;

public class PizzaExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String size = sc.next();
		sc.close();
		
		Pizza pizza;
		
		pizza = new Pizza(); 
		
		if(name.equals("C")) {
			pizza = new CheesePizza(size);
		} else if(name.equals("P")){
			pizza = new PepperoniPizza(size);
		} else {
			pizza = new BulgogiPizza(size);
		}
		
		pizza.cook();
		pizza.serve();
	}
}
