package exam0603;

public class Car1 {
	String company = "현대 자동차";
	String color;
	String model;
	int maxSpeed;
	
	
	
	Car1(){
		
	}
	
	Car1(String model) {
		this.model = model;
	}
	
	
	Car1(String model,String color) {
		this.model = model;
		this.color = color;
	}
	
	
	Car1(String model,String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
