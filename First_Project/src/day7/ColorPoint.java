package day7;

public class ColorPoint extends Point {
	String color;
	ColorPoint() {
		super(0, 0);
		color = "BLACK";
	}
	
	ColorPoint(int x, int y) {
		super(x, y);
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
