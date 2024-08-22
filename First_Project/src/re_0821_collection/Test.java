package re_0821_collection;

import java.util.ArrayList;

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
}
