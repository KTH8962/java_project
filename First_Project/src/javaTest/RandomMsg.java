package javaTest;

public class RandomMsg {
	static String ranMsg() {
		String ran = "";
		for(int i=0; i < 6; i++) {
			ran += (int)(Math.random()*10);
		}
		return ran;
	}
	
	public static void main(String[] args) {
		String test = ranMsg();
		System.out.println(test);
	}
}
