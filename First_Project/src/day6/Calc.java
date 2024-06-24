package day6;

public class Calc {
	/*- 클래스명 : Calc
	 - 메소드 : sum, multiple
	 - 위 메소드 들은 객체 생성없이 클래스명으로 호출가능하도록
	 - 위에서 정의한 메소드는 각각 2개의 정수를 받아서 덧셈, 곱셈 결과를 리턴*/
	
	static int sum(int x, int y) {
		return x + y; 
	}
	
	static int multiple(int x, int y) {
		return x * y;
	}
	
	static int multiple(int x, int y, int z) {
		return x * y * z;
	}
	
	static double multiple(double x, double y) { //(double x, int y)
		return x * y;
	}
}
