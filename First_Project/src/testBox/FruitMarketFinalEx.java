package testBox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarketFinalEx {
	private static Scanner scan = new Scanner(System.in);
	
	public static void addFunc() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		while(true) {
			System.out.println("== (1)과일 추가 (2) 판매 (3) 개수확인 (그외) 종료");
			HashMap<String, Object> map = new HashMap<String, Object>();
			int menu = scan.nextInt();
			
			if(menu == 1) {
				addFunc();
				System.out.print("과일명 : ");
				map.put("name", scan.next());
				System.out.print("가격 : ");
				map.put("price", scan.nextInt());
				System.out.print("개수 : ");
				map.put("num", scan.nextInt());
				
				list.add(map);
			} else if (menu == 2) {
				System.out.print("과일명 : ");
				String inputName = scan.next();
				System.out.print("개수 : ");
				int inputNum = scan.nextInt();
				for(int i=0; i < list.size(); i++) {
					HashMap<String, Object> data = list.get(i);
					String name = (String) data.get("name");
					if(name.equals(inputName)) {
						int currentNum = (int) data.get("num");
						data.put("num", currentNum - inputNum);
					}
				}
			} else if (menu == 3) {
				System.out.print("과일명 : ");
				String inputName = scan.next();
				for(int i=0; i < list.size(); i++) {
					HashMap<String, Object> data = list.get(i);
					String name = (String) data.get("name");
					if(name.equals(inputName)) {
						int num = (int) list.get(i).get("num");
						System.out.println(name + "의 현재 남은 개수는 " + num + "개 입니다.");
					}
				}
			} else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}

}
