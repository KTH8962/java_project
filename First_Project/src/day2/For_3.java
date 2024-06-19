package day2;

public class For_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 9; i++) {
			System.out.println("--- " + i + "단 ---");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
		
		int sum = 0;
		for(int i=1; i<=2532; i++) {
			sum += i; //sum = sum + i;
		}
		System.out.println(sum);
	}

}
