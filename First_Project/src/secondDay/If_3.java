package secondDay;

public class If_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ~ else if
		int score = 75;
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}

}
