package day2;

import java.util.Scanner;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String(문자)에서는 주소값을 저장하기에 값을 비교할 때는 equals를 사용해서 비교
		Scanner s = new Scanner(System.in);
		String name1 = "홍길동";
		String name2 = s.next();
		System.out.println(name1.equals(name2));
		
		s.close();
	}

}
