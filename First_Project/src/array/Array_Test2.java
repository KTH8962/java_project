package array;

import java.util.Random;

public class Array_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[][] = new int[4][4];
		final int numRange = 10;
		
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		for(int i = 1; i <= numRange; i++) {
			int num1 = ran.nextInt(4);
			int num2 = ran.nextInt(4);
			if(arr[num1][num2] == 0) {
				arr[num1][num2] = i;
			} else {
				i--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
