package day5;

public class Class_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		int a = calc.sum(1, 2);
		int b = calc.sum(3, 5, 6);
		double c = calc.sum(3.2, 5.5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
