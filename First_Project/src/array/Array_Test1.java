package array;

import java.util.Random;

public class Array_Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int arr[][] = new int[4][4];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int num = ran.nextInt(10) + 1;
				// int num = (int)(Math.random()*10 + 1);
				arr[i][j] = num;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
