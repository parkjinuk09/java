package exam1029;

public class Button implements Clickable,Drawable {

	String label;
	
	
	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("버튼이 클릭되었습니다.");
	}

	
	public Button() {
		
	}
	
	
	public Button(String label) {
		this.label = label;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if(label != null) {
			System.out.println(label + "버튼을 그립니다.");
		}
	}
}
