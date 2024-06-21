package day5;

import java.util.Arrays;

public class Day5_Test5 {
	public static void main(String[] args) {
		/*5. int arr[] = {3, 5, 1, 8, 2}
		위 배열에서 가장 작은 숫자를 찾아서 맨 처음 위치의 숫자와 위치를 바꾸시오*/
		int arr[] = {3, 5, 1, 8, 2};
		
		int maxNum = 0;
		int minNum = 0;
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[maxNum]) {
				maxNum = i;
			}
			if(arr[i] < arr[minNum]) {
				minNum = i;
			}
		}
		
		temp = arr[maxNum];
		arr[maxNum] = arr[minNum];
		arr[minNum] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
