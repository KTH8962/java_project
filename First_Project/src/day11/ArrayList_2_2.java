package day11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayList_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		Scanner scan = new Scanner(System.in);
		HashMap<String, Student> list = new HashMap<String, Student>();
		
		while(true) {
			System.out.print(">> ");
			String input = scan.nextLine();
			if(input.equals("그만")) {
				break;
			} else {
				String arr[] = input.split(",");
				String name = arr[0];
				String dept = arr[1];
				String id= arr[2];
				String grade = arr[3];
				double parseDouble = Double.parseDouble(grade);
				//Student student = new Student(name, dept, id, parseDouble);
				list.put(name, new Student(name, dept, id, parseDouble));
			}			
		}

		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println("----------------");
			System.out.println("이름:"+ list.get(i).getName());
			System.out.println("학과:"+ list.get(i).getDepartment());
			System.out.println("학번:"+ list.get(i).getId());
			System.out.println("학점평균:"+ list.get(i).getGrade());
			System.out.println("----------------");
		}
	}

}
