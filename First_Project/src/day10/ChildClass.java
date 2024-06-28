package day10;

public class ChildClass extends ParentClass {
	ChildClass() {
		super("");
	}
	
	void gugudan(int num) {
		System.out.println("=== " + num + "단을 선택했습니다. ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		System.out.println("=== 종료되었습니다. ===");
	}
	
	
	void objType(Object obj) {
		if(obj instanceof String) {
			System.out.println("문자열 입니다.");			
		} else if(obj instanceof Integer) {
			System.out.println("정수 입니다.");			
		} else {
			System.out.println("문자나 정수가 아닙니다.");
		}	
		
	}
}
