package day7;

public class Point3D extends Point{
	private int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void moveUp() {
		z += 1;
	}
	
	void moveDown() {
		z -= 1;
	}
	
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + "," + z + ") 의 점";
	}
}
