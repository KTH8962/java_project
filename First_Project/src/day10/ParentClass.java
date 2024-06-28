package day10;

public class ParentClass {
	private String name;
	
	ParentClass(String name) {
		this.name =name;
	}
	
	void gugudan(int num) {
		System.out.println(this.name+"님 자바 클래스 테스트를 시작합니다!");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	int arrBigNum(int[] arr) {
		int max = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
