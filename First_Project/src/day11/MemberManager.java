package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MemberManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		while(true) {
			System.out.println("== (1)입력 (2)검색 (3) 종료 ==");		
			System.out.print("메뉴를 선택하세요 : ");
			String menu = scan.next();
			HashMap<String, Object> map = new HashMap<String, Object>(); 
			if(menu.equals("1")) {
				// 입력 부분 작성
				System.out.print("이름을 입력하세요 : ");
				map.put("name", scan.next());
				System.out.print("나이를 입력하세요 : ");
				map.put("age", scan.nextInt());
				System.out.print("주소를 입력하세요 : ");
				map.put("addr", scan.next());
				System.out.print("핸드폰번호를 입력하세요 : ");
				map.put("phone", scan.next());
				list.add(map);
				System.out.println("저장되었습니다!");
			} else if(menu.equals("2")) {
				// 검색 부분 작성
				System.out.print("검색할 이름을 입력하세요 : ");
				String name = scan.next();
				//String str = (String) map.get("name");
				boolean isUser = false;
				for(int i=0; i < list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					// Object로받고 String으로 받으려면 다운캐스팅 필요
					String userName = (String) user.get("name");
					if(userName.equals(name)) {
						System.out.println("이름을 입력하세요 : " + user.get("name"));
						System.out.println("나이를 입력하세요 : " + user.get("age"));
						System.out.println("주소를 입력하세요 : " + user.get("addr"));
						System.out.println("핸드폰번호를 입력하세요 : " + user.get("phone"));
						isUser = true;
						break;
					}
				}
				if(!isUser) {
					System.out.println("찾는 사람이 없습니다.");
				}
//				if(map.get("name").equals(name)) {
//					System.out.println("이름을 입력하세요 : " + map.get("name"));
//					System.out.println("나이를 입력하세요 : " + map.get("age"));
//					System.out.println("주소를 입력하세요 : " + map.get("addr"));
//					System.out.println("핸드폰번호를 입력하세요 : " + map.get("phone"));
//				} else {
//					System.out.println("찾는 사람이 없습니다.");
//				}					
			} else if(menu.equals("3")) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("1, 2, 3중에 하나를 입력해주세요");
			}
		}		
		
	}

}
