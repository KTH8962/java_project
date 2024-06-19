package secondDay;

import java.util.Arrays;

public class Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 5, 2, 4, 1};
		int maxNum = arr[0];
		int minNum = arr[0];
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + " " + maxNum + " " + minNum + " " + arr[i]);
			if(maxNum < arr[i]) {
				maxNum = i;
			}
			if(minNum > arr[i]) {
				minNum = i;
			}
		}
		
		//System.out.println( Arrays.toString(arr));
	}

}
