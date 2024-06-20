package day4;

public class Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 5, 1, 2};
		int minIndex = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println(minIndex);
	}

}
