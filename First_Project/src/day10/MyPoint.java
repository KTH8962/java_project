package day10;

public class MyPoint {
	private int x;	
	private int y;	
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {			
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point("+ this.x + "," + this.y + ")";
	}
}
