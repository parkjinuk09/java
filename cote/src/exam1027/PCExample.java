package exam1027;

public class PCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usb u1 = new CommonUsb();
		Usb u2 = new MyStick();
		
		PC pc = new PC();
		
		pc.setPort1(u1);
		System.out.println(pc.port1.read());
		
		pc.setPort2(u2);
		System.out.println(pc.port2.read());
		
		
		
		
	}

}






