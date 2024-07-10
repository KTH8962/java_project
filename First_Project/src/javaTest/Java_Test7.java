package javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class Java_Test7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[6];
		
		for(int i=0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int inputNum = scan.nextInt();
			arr[i] = inputNum;
			int cntCount = 0;
			for(int j=0; j <= i; j++) {
				if(arr[j] == inputNum) {
					cntCount++;
					if(cntCount > 2) {
						System.out.println("중복 된 값은 2개까지만 허용합니다. 다른 숫자를 입력해 주세요.");
						System.out.println("현재 입력 되어있는 숫자 " + Arrays.toString(arr));
						i--;
						break;
					}
				}
			}
		}
		System.out.println("입력이 완료 되었습니다. " + Arrays.toString(arr));
	}

}
