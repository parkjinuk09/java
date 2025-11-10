package exam1027;

public class CommonUsb implements Usb {
	public long size = 16 * 1073741824L;
	public long currentUsage = 0;
	
	public CommonUsb() {
		
	}
	
	public CommonUsb(int giga) {
		size = giga * 1073741824L;
	}
	
	public String read() {
		return "총" + currentUsage + "사용";
	}
	
	public void write(long dataSize) {
		long leftSize = size - currentUsage;
		if(dataSize <= leftSize) {
			currentUsage += dataSize;
		}
	}
}
