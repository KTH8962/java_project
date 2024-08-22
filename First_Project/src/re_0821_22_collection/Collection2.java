package re_0821_22_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동, 30, 서울
		// 김철수, 20, 인천
		// 박영희, 25, 제주도
		
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		ArrayList<Human> humanList = new ArrayList<>();
		humanList.add(hong);
		humanList.add(kim);
		humanList.add(park);
		
//		for(Human hu : humanList) {
//			System.out.println("이름: " + hu.getName()+ ", 나이: " + hu.getAge() + ", 주소: " + hu.getAddr());
//		}
		
		// Test 클래스에 있는 callHuman 메소드 호출
		// 리턴으로는 hong, kim, park 3개의 객체를 받고싶어
		// 그 결과를 ArrayList에 저장
		ArrayList<Human> list = Test.callHuman();
		
		for(Human a : list) {
			//System.out.println(a.getName());
		}
		
		String test = Test.call();
		//System.out.println(test);
		
		int arr[] = Test.callArray();
		// [1, 3, 5, 7, 9]
		//System.out.println(Arrays.toString(arr));
		
		HashMap<String, Object> map = Test.callPerson(hong);
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("addr"));
	}

}
