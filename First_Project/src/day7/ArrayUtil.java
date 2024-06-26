package day7;

public class ArrayUtil {
	static int totalLength = 0;
	
	static int[] concat(int[] a, int[] b) {
		totalLength = a.length + b.length;
		int arr[] = new int[totalLength];
		for(int i=0; i < a.length; i++) {
			arr[i] = a[i];
		}
		for(int i=0; i < b.length; i++) {
			arr[i+a.length] = b[i];
		}
		return arr;
	}
}
