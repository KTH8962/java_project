package day10;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Split_Tokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print(">> ");
			String inputTxt = scan.nextLine();
			if(inputTxt.equals("그만")) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				//String arr[] = inputTxt.split(" ");
				//System.out.println("어절 개수는 " + arr.length);
				StringTokenizer st = new StringTokenizer(inputTxt, " ");
				System.out.println("어절 개수는 " + st.countTokens());
			}
		}
		
		scan.close();
	}

}
