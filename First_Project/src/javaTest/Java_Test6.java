package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Java_Test6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		for(int i = 1; i <= 3; i++) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("이름 입력 : ");
			String name = scan.next();
			map.put("name", name);
			while(true) {
				System.out.print("나이 입력 : ");
				int age = scan.nextInt();
				if(age > 0 && age < 100) {
					map.put("age", age);
					break;
				} else {
					System.out.println("나이는 0 ~ 100 범위 안에서만 입력이 가능합니다.");
				}
			}
			System.out.print("주소 입력 : ");
			String addr = scan.next();
			map.put("addr", addr);
			System.out.println(name + "님의 정보가 저장 되었습니다.");
			list.add(map);
		}
		
		System.out.println(list);
	}

}
