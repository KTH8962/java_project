package re_0821_22_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection3 {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> hong = new HashMap<>();
		HashMap<String, Object> kim = new HashMap<>();
		HashMap<String, Object> park = new HashMap<>();
		
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("addr", "서울");
		list.add(hong);
		kim.put("name", "김철수");
		kim.put("age", 20);
		kim.put("addr", "인천");
		list.add(kim);
		park.put("name", "박영희");
		park.put("age", 25);
		park.put("addr", "제주도");
		list.add(park);
		
		System.out.println(list);
		
		int num = 0;
		int age = 0;
		for(int i = 0; i < list.size(); i++) {
			if((int) list.get(i).get("age") >= 25) {
				num += 1;
			}
			if(list.get(i).get("name").equals("김철수")) {
				age = (int) list.get(i).get("age");
			}
		}
		System.out.println("25세 이상의 사람의 수는 " + num + "입니다.");
		System.out.println("김철수의 나이는 " + age + "입니다.");
	}

}
