package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		for(;;) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("메뉴 선택 : ");
			String menu = scan.next();
			if(menu.equals("1")) {
				System.out.print("과일명 : ");
				map.put("name", scan.next());
				
				System.out.print("가격 : ");
				int price = scan.nextInt();
				map.put("price", price);
				
				System.out.print("개수 : ");
				map.put("num", scan.nextInt());
				list.add(map);
			} else if(menu.equals("2")) {
				System.out.print("과일명 : ");
				String inputName = scan.next();
				System.out.print("개수 : ");
				int inputNum = scan.nextInt();
				for(int i=0; i < list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(inputName.equals(name)) {
						int num = (int) list.get(i).get("num");
						list.get(i).put("num", num - inputNum);
						System.out.println("판매되었습니다.");
						System.out.println(name + "의 현재 남은 개수는 " + (num - inputNum) +"개 입니다.");
					}
				}
			} else if(menu.equals("3")) {
				System.out.print("과일명 : ");
				String inputName = scan.next();
				for(int i=0; i < list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(inputName.equals(name)) {
						int num = (int) list.get(i).get("num");
						System.out.println("판매되었습니다.");
						System.out.println(name + "의 현재 남은 개수는 " + num +"개 입니다.");
					}
				}
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
			//1. 중복된 과일이 입력될 경우 기존 값에 개수를 더해 줌
			//(+ 중복된 과일일 경우 가격은 물어보지 않는다.)
			//2.과일의 판매개수가 보유 개수보다 많을 경우
			//판매하지 않고 메시지("개수가 부족합니다.") 출력 후
			//메인으로 이동
			//3.가격이나 수량을 음수로 입력할 경우
			//메시지("음수 입력은 불가능")를 출력 후 메인으로 이동
		}
	}

}
