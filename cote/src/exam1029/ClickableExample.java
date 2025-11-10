package exam1029;

public class ClickableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image img = new Image("a.jpg");
		Button btn = new Button("OK");
		
		
		img.click();
		btn.click();
		
		
		//캐스팅 원래타입으로 돌리는 것 
//		if(img instanceof Image) {
//			Image i  = (Image) img;
//			System.out.println(i.url);
//			Drawable d = i;
//			d.draw();
//		}
//		
//		if(btn instanceof Button) {
//			Button b = (Button) btn;
//			System.out.println(b.label);
//			Drawable d = b;
//			d.draw();
//		}
		
		
		Drawable d1 = (Image) img;
		Drawable d2 = (Button) btn;
		
		d1.draw();
		d2.draw();
		
	}

}
