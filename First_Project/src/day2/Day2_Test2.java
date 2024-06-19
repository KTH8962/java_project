package day2;

public class Day2_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문을 통해 1부터 30까지 중 홀수의 합과 짝수의 합의 차이를 구하기
		int oddSum = 0;
		int evenSum = 0;
		for(int i=1; i <= 30; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println(Math.abs(oddSum - evenSum));
	}

}
