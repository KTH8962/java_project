package day3;

public class While_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i=1; i <= 10; i++)
		int i=1;
		boolean flg = true;
		
		while(flg) { // while(i <= 10)
			if(i >= 10) {
				flg = false;
			}
			System.out.println(i);
			i++;
		}
	}

}
