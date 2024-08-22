package re_0821_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection1 {

	public static void main(String[] args) {
		
		// 자바, 오라클, html, jsp
		// String str[] = new String[4];
		ArrayList<String> srtList = new ArrayList<>();
		srtList.add("자바");
		srtList.add("오라클");
		srtList.add("html");
		srtList.add("jsp");
		// [자바, 오라클, html, jsp]
//		for(int i=0; i < srtList.size(); i++) {
//			System.out.println("기본 for : " + srtList.get(i));
//		}		
//		for(String str : srtList) {
//			System.out.println("향상된 for : " + str);
//		}
		
		// 10, 30, 50, 100
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(10);
		numList.add(30);
		numList.add(50);
		numList.add(100);
		
		// 홍길동, 30, 서울, 1234, new HashMap<String, Integer> map
		ArrayList<Object> objList = new ArrayList<>();
		objList.add("홍길동");
		objList.add(30);
		
		//int a = (int) objList.get(1);
		int a = (Integer) objList.get(1);
		System.out.println(a);
		
		String str[] = new String[3];
		str[0] = "v";
		str[1] = "r";
		str[2] = "d";
//		for(int i=0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
	}

}
