package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayList_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		while(true) {
			System.out.print(">> ");
			String input = scan.nextLine();
			if(input.equals("그만")) {
				break;
			} else {
				HashMap<String, Object> map = new HashMap<String, Object>();
				StringTokenizer st = new StringTokenizer(input, ",");
				String name = st.nextToken();
				String dept = st.nextToken();
				String id= st.nextToken();
				String grade = st.nextToken();
				double parseDouble = Double.parseDouble(grade);
				map.put("name",name);
				map.put("dept",dept);
				map.put("id",id);
				map.put("grade",parseDouble);
				list.add(map);
			}			
		}

		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println("----------------");
			System.out.println("이름:"+ list.get(i).get("name"));
			System.out.println("학과:"+ list.get(i).get("dept"));
			System.out.println("학번:"+ list.get(i).get("id"));
			System.out.println("학점평균:"+ list.get(i).get("grade"));
			System.out.println("----------------");
		}
	}

}
