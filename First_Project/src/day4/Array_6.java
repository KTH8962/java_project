package day4;

public class Array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 5, 3, 2};
		
		// 배열에서 가장 큰 숫자 찾기 (배열에는 양수만 담겨있다)
		// 가장 큰 숫자는 oo 입니다. 출력;		
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("가장 큰 숫자는 " + max + " 입니다.");
	}

}
