package day4;

public class Array_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, -5, 7, 6, 8};
		
		int sum = 0;
		for(int num : arr) {
			System.out.println(num);
			sum += num;
		}
		
		// int a = (int) 10.5; 형변환으로 int에 실수를 저장. 그러나 .5는 저장이안된다.
		// double a = 10; double에 정수를 저장하면 실수로 저장된다. 10.0
		
		System.out.println((double) sum / arr.length);
	}

}
