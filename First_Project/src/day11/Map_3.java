package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Map_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		System.out.println("미래장학금관리시스템입니다.");
		
		for(int i=0; i < 5; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("이름과 학점 >> ");
			String info = scan.nextLine();
			String arr[] = info.split("\\s+");
			System.out.println(Arrays.toString(arr));
//			StringTokenizer st = new StringTokenizer(info," ");
//			System.out.println(st);
//			String name = st.nextToken();
//			String grade = st.nextToken();
//			double doubleGrade = Double.parseDouble(grade);
			map.put("name", arr[0]);
			map.put("grade", Double.parseDouble(arr[1]));
//			map.put("name", name);
//			map.put("grade", doubleGrade);
			list.add(map);
			
		}
		
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double number = scan.nextDouble();
		System.out.print("장학생 명단 : ");
		for(int i=0; i < list.size(); i++) {
			double score = (double) list.get(i).get("grade");
			if(score >= number) {
				System.out.print(list.get(i).get("name") + " ");
			}
			
		}
		
	}

}
