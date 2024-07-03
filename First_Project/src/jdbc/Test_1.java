package jdbc;

import java.util.Arrays;
import java.util.Random;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [6];
		Random ran = new Random();
		
		
		for(int i=0; i < arr.length; i++) {
			int ranNum = ran.nextInt(45)+1;
			arr[i] = ranNum;
			for(int j=0; j < i; j++) {
				if(arr[j] == ranNum) {
					i--;
					break;
				}
			}
		}
	}

}
