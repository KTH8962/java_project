package day5;

public class Day5_Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6. int arr[] = {3, 5, 1, 8, 2}
		위 배열에서 3이상의 숫자들에 대한 평균 값을 구하시오.*/
		int arr[] = {3, 5, 1, 8, 2};
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 3) {
				sum += arr[i];
				cnt++;
			}
		}
		
		System.out.println((double) sum / cnt);
	}

}
