package day5;

public class Day5_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. 구구단을 하시오. 단, 2번째 오는 숫자를 거꾸로(9부터 1까지) 출력하시오.
		예시) 2*9=18
			 2*8=16
			 ....
			 2*1=2
			 3*9=27
			 3*8=24
			 ..
			 ..
			 9*1=9 (마지막)*/
		for(int i = 2; i <= 9; i++) {
			System.out.println("---" + i + "단 ---");
			for(int j = 9; j >= 1; j--) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

}
