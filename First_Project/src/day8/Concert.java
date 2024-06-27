package day8;

import java.util.Arrays;

public class Concert {
	static String[][] arr = new String[3][10];
	static String table;
	static String[] tableName = {"S", "A", "B"};
	
	Concert() {
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "---";
			}
		}
	};
	
	static int getTableSize() {
		return arr.length;
	}
	
	static String table(int num) {
		System.out.print(tableName[num] + ">> ");
		for(int i = 0; i < arr[num].length; i++) {
			System.out.print(arr[num][i] + " ");
		}
		System.out.println("");
		return table;
	}
	
	void reservation(int table, String name, int tableNum) {
		table = table - 1;
		tableNum = tableNum - 1;
		if(arr[table][tableNum] != "---") {
			System.out.println("이미 예약 된 좌석입니다.");
		} else {
			arr[table][tableNum] = name;			
		}
	}
}
