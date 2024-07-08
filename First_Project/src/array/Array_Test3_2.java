package array;

public class Array_Test3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
		int rowLast = arr.length - 1;
		int colLast = arr[0].length - 1;
		
		
		for(int row = 0; row < arr.length; row++) {
			for(int  col = 0; col < arr[row].length; col++) {
				if(row != rowLast && col != colLast) {
					arr[row][col] = (int)(Math.random()*10 + 1);
					arr[row][colLast] += arr[row][col];
					arr[rowLast][col] += arr[row][col];
					arr[rowLast][colLast] += arr[row][col];
				}
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}
	}

}
