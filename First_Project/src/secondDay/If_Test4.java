package secondDay;

import java.util.Scanner;

public class If_Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력해 주세요 : ");
		String name = scan.nextLine();
		
		System.out.print("수학 점수 : ");
		int math = scan.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		
		double avg = (math + eng) / 2.0;
		String grade = "";
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80) {
			grade = "B";
		} else if(avg >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		
		System.out.println(name + "님의 평균 점수는 " + avg + "점, 등급은 " + grade + "입니다.");
		
		scan.close();
	}
}
