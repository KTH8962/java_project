package day4;

public class Array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 5, 1, 2};
		int maxIndex = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}

}
