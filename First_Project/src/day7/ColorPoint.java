package day7;

public class ColorPoint extends Point {
	private String color;
	ColorPoint() {
		this(0, 0, "BLACK");
		//super(0, 0);
		//color = "BLACK";
	}
	
	ColorPoint(int x, int y) {
		this(x, y, "BLACK");
		//super(x, y);
		//color = "BLACK";
	}
	
	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y){
		move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}
	//RED색의 (10,20)의 점입니다. 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color + "색의 (" + getX() + ", " + getY() + ")의 점";
	}
}
