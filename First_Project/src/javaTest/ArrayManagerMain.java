package javaTest;

import java.util.Arrays;

public class ArrayManagerMain {

	public static void main(String[] args) {
		int arr[] = {2, 5, 9, 3, 6}; 
		
		ArrayManager array = new ArrayManager();
		
		System.out.println(array.maxNum(arr));
		
		System.out.println(ArrayManager.numSum(arr));
		
		int arr2[] = array.numInput();
		
		System.out.println(Arrays.toString(arr2));
	}

}
