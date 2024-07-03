package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {
	static Scanner scan  = new Scanner(System.in);
	static void fruitFunc(int choice, int sizeCount, ArrayList<HashMap<String, Object>> list) {
		if(sizeCount == 0 && choice != 1) {
			System.out.println("과일을 추가해주세요");
		} else {			
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("과일명 입력 : ");
			String name = scan.next();
			boolean nameChk = false;
			int numChk = 0;
			if(list.size() > 0) {				
				for(int i=0; i < list.size(); i++) {
					String nameType = (String) list.get(i).get("name");
					if(nameType.equals(name)) {
						nameChk = true;
						numChk = i;
					}
				}
			}
			map.put("name", name);
			if(choice == 1 && !nameChk) {
				System.out.print("가격 입력 : ");
				int price = scan.nextInt();
				if(price < 0) {
					System.out.println("음수 입력은 불가능합니다.");
					return;
				}
				map.put("price", price);
			}
			int count = 0;
			
			if((choice == 2 || choice == 3) && !nameChk) {
				System.out.println(name + "는(은) 없는 과일입니다.");	
				return;
			} else if(choice == 1 && nameChk) {
				System.out.print("개수 입력 : ");
				count = scan.nextInt();
				if(count < 0) {
					System.out.println("음수 입력은 불가능합니다.");
					return;
				}
				
				int currentCount = (int) list.get(numChk).get("num");
				list.get(numChk).put("num", currentCount + count);
			} else if(choice != 3) {
				System.out.print("개수 입력 : ");
				count = scan.nextInt();
				if(count < 0) {
					System.out.println("음수 입력은 불가능합니다.");
					return;
				}
				
				if(choice == 1 && !nameChk) {
					map.put("num", count);					
					list.add(map);
				}
			}
			
			if(choice != 1) {
				for(int i=0; i < list.size(); i++) {
					HashMap<String, Object> Fruit = list.get(i);
					if(Fruit.containsValue(name)) {
						if(choice == 2) {
							int currentNum = (int) Fruit.get("num");
							if(currentNum < count) {
								System.out.println((count - currentNum) + "개 부족합니다. 판개 가능 개수는 " + currentNum + "개 입니다.");
								break;
							} else {
								Fruit.put("num", currentNum - count);
							}
						}
						System.out.println(name + "의 현재 남은 개수는 " + Fruit.get("num") + "개 입니다.");
					} 
				}				
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
				fruitFunc(choice, list.size(), list);
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
