package day7;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다. ");
		//System.out.println(cp+"입니다. ");
		//toString을 오버라이딩해서 cp만 출력해도 같은 결과가 나온다.
	}

}
