package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		System.out.println("미래장학금관리시스템입니다.");
		
		for(int i=0; i < 5; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("이름과 학점 >> ");
			String name = scan.next();
			double score = scan.nextDouble();
			map.put("name", name);
			map.put("score", score);
			list.add(map);
		}
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double limit = scan.nextDouble();
		
		System.out.print("장학생 명단 : ");
		for(int i=0; i < list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			double score = (double) user.get("score");
			if(score >= limit) {
				System.out.print(user.get("name") + " ");
			}
		}
	}

}
