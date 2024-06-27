package day8;

import java.util.Arrays;
import java.util.Scanner;

public class ConcertMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("예약 시스템 심화문제 예약 시스템입니다.");
		Concert con = new Concert();
		
		
		while(true) {
			
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
			int selNum = scan.nextInt();
			int exit = 0;
			switch(selNum) {
				case 1 : {
					System.out.print("S(1), A(2), B(3) >> ");
					int selTable = scan.nextInt()-1;
					Concert.table(selTable);
					
					System.out.print("이름을 입력하세요 : ");
					String name = scan.next();
					
					
					System.out.print("번호를 입력하세요 : ");
					int tableNum = scan.nextInt();
					
					con.reservation(selTable, name, tableNum);
					
					break;
				}
				case 2 : {
					for(int i = 0; i < Concert.getTableSize(); i++) {
						Concert.table(i);
					}
					break;
				}
				case 3 : {
					System.out.println("취소");
					break;
				}
				case 4 : {
					exit = 1;
					break;
				}
				default : {
					System.out.println("번호를 다시 입력해주세요");
					break;
				}
			}
			if(exit == 1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}

}
