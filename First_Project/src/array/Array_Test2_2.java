package array;

import java.util.Random;

public class Array_Test2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		int num = 0;
		
		//1,2,3,4,5,6,7,8,9,10
		while (num < 10) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if(arr[row][col] != 0) {
				continue;
			} else {
				arr[row][col] = ++num;
			}
		}	
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
