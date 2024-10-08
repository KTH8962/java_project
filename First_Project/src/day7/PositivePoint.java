package day7;

public class PositivePoint extends Point {
	PositivePoint() {
		this(0, 0);
		//super(0, 0);
	}
	
	PositivePoint (int x, int y) {
		super(x, y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	protected void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            super.move(x, y);
        }
    }
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ") 의 점";
	}
}
