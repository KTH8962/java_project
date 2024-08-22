package re_0821_22_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("num1", 100);
		map.put("num2", 20);
		
		Calculator calc = new Calculator();
		int result = calc.div(map);
		System.out.println(result);
		
		ArrayList<Double> list = new ArrayList<>();
		list.add(100.5);
		list.add(11.3);
		
		double result2 = calc.minus(list);
		System.out.println(result2);
	}

}
