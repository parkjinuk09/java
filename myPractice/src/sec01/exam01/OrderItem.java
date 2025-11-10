package sec01.exam01;

public class OrderItem {
	public Menu menu;
	
	public int quantity;
	
	public OrderItem() {}
	
	public OrderItem(Menu menu,int quantity) {
		
	}
	
	
	public int price() {
		return menu.price * quantity;
	}
}	
