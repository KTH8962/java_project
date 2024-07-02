package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map_1 {
	static Scanner scan = new Scanner(System.in);
	static int range(String name, int range) {
		int score = 0;
		while(true) {
			System.out.print(name + " >> ");
			score = scan.nextInt();				
			if(score < 0 || score > range) {
				System.out.println(name + "의 범위는 0부터 "+ range + "까지 입니다.");
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		for(int i=0; i < 3; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("이름 >> ");
			map.put("name", scan.next());
			map.put("java", range("자바", 40));
			map.put("oracle", range("오라클", 35));
			map.put("html", range("html", 25));
			
			list.add(map);
			System.out.println("------------------------------");
		}
		
		for(int i=0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			int sum = (int) user.get("java") + (int) user.get("oracle") + (int) user.get("html");
			System.out.println("이름 : " + user.get("name") + ", 총점 : " + sum + "점");
		}
	}

}
