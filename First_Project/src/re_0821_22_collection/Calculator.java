package re_0821_22_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculator implements CalculatorImpl {
	public int sum(int x, int y) {
		return x + y;
	}

	@Override
	public int mul(int x, int y) {
		return x * y;
	}

	@Override
	public int div(HashMap<String, Integer> map) {
		int t = map.get("num1") / map.get("num2");
		return t;
	}

	@Override
	public double minus(ArrayList<Double> list) {
		return list.get(0) - list.get(1);
	}
	
}
