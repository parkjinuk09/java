package exam1020;

public class ColorTire extends Tire {
	
private String color;
	
	public ColorTire(String model, int maxRotation,String color) {
		super(model,maxRotation);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	 powerOn() {
		System.out.println("전원을 켭니다.");
	}
}	
