package array;

public class Array_Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int) (Math.random() * 9 + 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int sum2 = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
				sum2 += arr[i][j];
			}
			arr[arr.length - 1][i] = sum;
			arr[i][arr.length - 1] = sum2;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
