package day7;

public class IPTV extends ColorTV {
	private String ip;
	
	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
	void printProperty() {
		int size = getSize();
		System.out.print("나의 IPTV는 "+ ip + " 주소의 ");
		super.printProperty(); // 부모에있는 오버라이딩된 printProperty를 불러올 수 있음
		//System.out.println("나의 IPTV는 "+ ip + " 주소의 " + size + "인치 " + this.color + "컬러");
		//System.out.println("나의 IPTV는 "+ ip + " 주소의 " + getSize() + "인치 " + color + "컬러");
	}
}
