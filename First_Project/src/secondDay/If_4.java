package secondDay;

public class If_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나이가 20이상이면서 홀수일 경우 "안녕하세요" 출력
		int age = 15;
		
		if(age >= 20) {
			if(age % 2 == 1) {
				System.out.println("안녕하세요");
			}
		}
		
		age = 30;
		// AND(둘 다 만족할 때) , OR(하나라도 만족할 때)
//		if(age >= 20 && age % 2 == 1) {
//			System.out.println("안녕하세요");
//		}
		if(age >= 20 || age % 2 == 1) {
			System.out.println("안녕하세요");
		}
	}

}
