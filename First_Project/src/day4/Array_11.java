package day4;

import java.util.Arrays;

public class Array_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 4, 5, 2, 1};
		int maxIndex = 0;
		int minIndex = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			} else {
				minIndex = i;
			}
			/*if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}*/
		}
		
		temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
