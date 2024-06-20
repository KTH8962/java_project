package secondDay;

import java.util.Arrays;

public class Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 5, 2, 1};
		int maxNum = 0;
		int minNum = 0;
		int swap = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[maxNum] < arr[i]) {
				maxNum = i;
			}
			if(arr[minNum] > arr[i]) {
				minNum = i;
			}
			System.out.println(maxNum + " " + minNum);
		}
		swap = arr[maxNum];
		arr[maxNum] = arr[minNum];
		arr[minNum] = swap;
		System.out.println(Arrays.toString(arr));
		//System.out.println( Arrays.toString(arr));
	}

}
