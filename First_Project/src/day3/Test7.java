package day3;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		while(i <= 9) {
			int j = 1;
			if(i != 4 && i != 8)  {
				System.out.println("--- " + i + " 단---");				
				while(j <= 9) {
					System.out.println(i + " * " + j + " = " + (i*j));
					j++;
				}				
			}
			i++;
		}

	}

}
