package day5;

public class Day5_Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4. int arr[] = {3, 5, 1, 8, 2}	 
		위 배열에서 홀수들의 합과 짝수들이 합의 차이를 구하시오.*/		
		int arr[] = {3, 5, 1, 8, 2};
		
		int odd = 0;
		int even = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		}
		
		System.out.println(even - odd);
	}

}
