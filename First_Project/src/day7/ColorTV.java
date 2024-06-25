package day7;

public class ColorTV extends TV {
	protected int color;
	
	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		int size = getSize();
		System.out.println(size + "인치 " + color + "컬러");
		//System.out.println(getSize() + "인치 " + color + "컬러");
	}
}
