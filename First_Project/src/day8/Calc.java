package day8;

public interface Calc {
	// 덧셈, 뺄셈, 나눗셈, 곱셈 설계
	// 매개변수는 2개(정수)만 받아서 처리
	int sum(int x, int y); // 덧셈
	// 2개의 정수를 받아서 뺄셈 결과를 리턴해주는 함수
	int sub(int x, int y); // 뺄셈
	int mul(int x, int y); // 곱셈
	int div(int x, int y); // 나눗셈
}
