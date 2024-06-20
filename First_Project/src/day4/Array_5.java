package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력해 주세요 : ");
			arr[i] = scan.nextInt();
			if(arr[i] < 0) {
				System.out.println("0이상 수를 입려해주세요.");
				i--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}
