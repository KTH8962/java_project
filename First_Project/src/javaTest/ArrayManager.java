package javaTest;

import java.util.Scanner;

public class ArrayManager {
	public static Scanner scan = new Scanner(System.in);
	
	int maxNum(int[] arr){
		int maxNum = 0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		
		return maxNum;
	}
	
	static int numSum(int[] arr){
		int sum = 0;
		
		for(int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	static int[] numInput() {
		int arr[] = new int[5];
		for(int i=0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			arr[i] = scan.nextInt();
		}
		
		return arr;
	}
}
