package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {
	static Scanner scan  = new Scanner(System.in);
	static void fruitFunc(int choice, int sizeCount, ArrayList<HashMap<String, Object>> list) {
		if(sizeCount == 0) {
			System.out.println("과일을 추가해주세요");
		}
		System.out.print("과일명 입력 : ");
		String name = scan.next();
		int count = 0;
		if(choice == 2) {
			System.out.print("개수 입력 : ");
			count = scan.nextInt();
		}		
		for(int i=0; i < list.size(); i++) {
			HashMap<String, Object> Fruit = list.get(i);
			if(Fruit.containsValue(name)) {
				if(choice == 2) {
					int currentCount = (int) Fruit.get("count");
					if(currentCount < count) {
						System.out.println("개수가 부족합니다.");
						break;
					} else {
						Fruit.put("count", currentCount - count);
					}
				}
				System.out.println(name + "의 현재 남은 개수는 " + Fruit.get("count") + "개 입니다.");
			} else {
				System.out.println(name + "는(은) 없는 과일입니다.");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		while(true) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			if(choice == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				System.out.print("과일명 입력 : ");
				String name = scan.next();
				if(list.size() > 0) {
					for(HashMap<String, Object> str : list) {
						
					}
				}
				map.put("name", name);
				
				System.out.print("가격 입력 : ");
				int price = scan.nextInt();
				if(price < 0) {
					System.out.println("음수 입력은 불가능");
					continue;
				}
				map.put("price", price);
				
				System.out.print("개수 입력 : ");
				int count = scan.nextInt();
				if(count < 0) {
					System.out.println("음수 입력은 불가능");
					continue;
				}
				map.put("count", count);
				list.add(map);
			} else if(choice == 2) {
				fruitFunc(choice, list.size(), list);
			} else if(choice == 3) {
				fruitFunc(choice, list.size(), list);
				
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
		scan.close();
	}

}
