package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket_Ex {
	static ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	static Scanner s = new Scanner(System.in);
	public static HashMap<String, Object> searchFruit(String inputName){
		for(int i=0; i<list.size(); i++) {
			String name = (String) list.get(i).get("name");
			if(inputName.equals(name)) {
				return list.get(i);
			}
		}
		return new HashMap<String, Object>();
	}

	public static boolean checkNum(String strName, String key, HashMap<String, Object> map) {
		System.out.print(strName);
		int num = s.nextInt();
		if(num > 0) {
			map.put(key, num);
			return true;
		} else {
			System.out.println("음수 입력 안됨");
			return false;
		}
	}
	public static boolean checkNum(int num) {
		return num > 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			System.out.print("메뉴 선택 : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("과일명 : ");
				String inputName = s.next();
				map = searchFruit(inputName);
				if(map.containsKey("name")) {
					System.out.print("개수 : ");
					int inputNum = s.nextInt();
					if(inputNum < 0) {
						System.out.println("음수 입력 안됨");
						break;
					} 
					map.put("num", (int) map.get("num") + inputNum);
					
				} else {
					map.put("name", inputName);
					if(!checkNum("가격 : ", "price", map)) {
						continue;
					}
					if(!checkNum("개수 : ", "num", map)) {
						continue;
					}
					list.add(map);
				}
				
			} else if(menu == 2) {
				// 판매
				System.out.print("과일명 : ");
				String inputName = s.next();
				HashMap<String, Object> map = searchFruit(inputName);
				if(map.containsKey("name")) {
					System.out.print("개수 : ");
					int inputNum = s.nextInt();
					if(!checkNum(inputNum)) {
						System.out.println("음수 입력 안됨");
						continue;
					}
					int num = (int) map.get("num");
					if(num < inputNum) {
						System.out.println("개수 부족!");
					} else {
						map.put("num", num - inputNum);
						System.out.println("현재 남은 " + inputName +  "의 개수는 " + map.get("num") + "개");
					} 
				} else {
					System.out.println("해당 과일 없음");
				}
			} else if(menu == 3) {
				// 개수확인
				System.out.print("과일명 : ");
				String inputName = s.next();
				HashMap<String, Object> map = searchFruit(inputName);
				if(map.containsKey("name")) {
					System.out.println("현재 남은 " + inputName +  "의 개수는 " + map.get("num") + "개");
				} else {
					System.out.println("해당 과일 없음");
				}
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}
