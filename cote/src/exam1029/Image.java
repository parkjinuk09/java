package exam1029;

public class Image implements Clickable, Drawable {

	public String url;
	
	@Override
	public void click() {
		System.out.println("그림이 클릭되었습니다.");		
	}
	
	
	public Image() {
		
	}
	
	public Image(String url) {
		this.url = url;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		if(url != null) {
			System.out.println(url + "파일을 그립니다.");
		}
	}
	
	
	
}
