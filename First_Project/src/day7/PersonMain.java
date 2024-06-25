package day7;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student("홍길동", 30);
		//hong.name = "홍길동";
		//hong.eat();
		//hong.speak();
		//hong.walk();
		//hong.study();
		
		// 김철수라는 학생 객체를 생성
		// 객체 생성 시 이름, 나이, 학번, 학과를 모두 초기화(변수에 값을 담기)
		Student kim = new Student("김철수", 25, "1235", "컴퓨터학과");
		//System.out.println(kim.stuNo);
		//System.out.println(kim.stuDept);
		
		//Person p = new Person();
		//p.study(); 부모 클래스에서 자식 클래스로는 접근이 불가하다.
	}

}
