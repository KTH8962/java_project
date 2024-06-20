package day4;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 7, 6, 2};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int sum = 0;
		
		for(int j = 0; j < arr.length; j++) {
			sum += arr[j];
		}
		System.out.println("------");
		System.out.println(sum);
	}

}
