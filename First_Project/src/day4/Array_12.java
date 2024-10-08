package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 크기가 5인 배열을 만들고
		// 5개의 숫자를 직접 입력해서 배열을 채우기
		// 그 중 가장 큰 숫자와 작은 수자의 위치 바꾸기
		// -- 중복된 숫자는 입력하지 않는다고 가정
		
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자 입력 : ");
			arr[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int maxIndex = 0;
		int minIndex = 0;
		int temp = 0;
		
		for(int j = 1; j < arr.length; j++) {
			if(arr[j] > arr[maxIndex]) {
				maxIndex = j;
			}
			if(arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		
		temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		System.out.println(Arrays.toString(arr));
	}

}











