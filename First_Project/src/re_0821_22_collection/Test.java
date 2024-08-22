package re_0821_22_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	static ArrayList<Human> callHuman() {
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		ArrayList<Human> re = new ArrayList<>();
		re.add(hong);
		re.add(kim);
		re.add(park);
		
		return re;
	}
	
	static String call() {
		String name = "안녕하세요";
		return name;
	}
	
	static int[] callArray() {
		int t[] = {1, 3, 5, 7, 9};
		return t;
	}
	
	static HashMap<String, Object> callPerson(Human human){
		HashMap<String, Object> person = new HashMap<String, Object>(); 
		person.put("name", human.getName());
		person.put("age", human.getAge());
		person.put("addr", human.getAddr());
		return person;
	}
}
