package samples;

public class Array {
	// 배열을 인자값을 받아서 배열중에서 가장 큰 숫자를 리턴
	public static int maxNum(int arr[]) {
		int maxNum=arr[0];
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		int arr[] = {12, 3, 1, 5, 4};
		int max = maxNum(arr);
		System.out.println("가장 큰 수는 " + max);
	}

}
