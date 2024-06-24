package day6;

public class Student {
	//1. 클래스와 객체의 관계에 대해 주석으로 작성해시오. 
	// - 클래스는 객체를 만들어 내는 것으로 클래스에 선언된 내용을 선언하면 객체를 선언한만큼 사용할 수 있다.
	// 클래스 => 객체를 만들어내는 틀, 객체 => 구체화 시킨 요소
	int stuNo;
	String stuName;
	String stuDept;
	int age;
	String gender;
	
	
	// 1. 학번, 이름 초기화 하는 생성자
	//  2. 학번, 이름, 학과 초기화 하는 생성자
	Student(int stuNo, String stuName) {
		//this(stuNo, stuName, "");
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	
	Student(int stuNo, String stuName, String stuDept) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	
	 // 1. setInfo (나이와 성별을 입력받아서 저장, 리턴 x)
	 // 2. getAge (호출 시 객체의 나이 값 리턴)	
	void setInfo (int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	int getAge () {
		return this.age; // age;
	}
}
