package day3;

public class While_2 {
	public static void main(String[] args) {
		// while 문으로 구구단 만들기
		int i = 2;
		while(i <= 9) {
			System.out.println("--- " + i + "단 ---");
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			i++;
		}
	}

}
