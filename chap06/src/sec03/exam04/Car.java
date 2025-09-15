package sec03.exam04;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car() {
		
	};
	
	Car(String model){
		this(model, "은색", 0);
	}
	
	Car(String model, String color){
		this(model,color,0);
	}
	
	
}
