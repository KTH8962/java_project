package day10;

public class Circle {
	private int x;	
	private int y;
	private int radius;

	Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public boolean equals(Object c) {
		Circle obj = (Circle) c;
		if(this.x == obj.x && this.y == obj.y) {
			return true;			
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cricle("+ this.x + "," + this.y + ")반지름 " + radius;
	}
	
}
