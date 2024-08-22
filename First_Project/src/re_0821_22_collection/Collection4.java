package re_0821_22_collection;

import java.util.ArrayList;

public class Collection4 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		ArrayList<Human> humanList = new ArrayList<>();
		humanList.add(hong);
		humanList.add(kim);
		humanList.add(park);
		
		Human human = Test.maxAge(humanList);
		System.out.println(human.getName());
	}

}
