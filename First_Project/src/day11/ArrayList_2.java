package day11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요");
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		
		while(true) {
			System.out.print(">> ");
			String input = scan.nextLine();
			if(input.equals("그만")) {
				break;
			} else {
//				StringTokenizer st = new StringTokenizer(input, ",");
//				String name = st.nextToken();
//				String dept = st.nextToken();
//				String id= st.nextToken();
//				String grade = st.nextToken();
//				double parseDouble = Double.parseDouble(grade);
//				Student student = new Student(name, dept, id, parseDouble);
				String arr[] = input.split(",");
				Student student = new Student(arr[0], arr[1], arr[2],Double.parseDouble(arr[3]));
				list.add(student);				
			}			
		}

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
