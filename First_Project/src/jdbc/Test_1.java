package jdbc;

import java.util.Random;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 입력받아서 8개 넣고 중복은 2개까지만
		int arr[] = new int[8];
		
		for(int i = 0; i < arr.length; i++) {
			
		}
		
		
		
		/*0 ~ 45 랜덤 숫자 중복 없이
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
		}*/
	}

}
