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
	
	int getTableSize() {
		return arr.length;
	}
	
	String table(int num) {
		System.out.print(tableName[num] + ">> ");
		for(int i = 0; i < arr[num].length; i++) {
			System.out.print(arr[num][i] + " ");
		}
		System.out.println("");
		return table;
	}
	
	void reservation(int selTable, String name, int tableNum) {
		if(arr[selTable][tableNum] != "---") {
			System.out.println("이미 예약 된 좌석입니다.");
		} else {
			arr[selTable][tableNum] = name;			
		}
	}
	
	void cancel(int selTable, String name) {
		int count = 0;
		for(int i = 0; i < arr[selTable].length; i++) {
			if(arr[selTable][i].equals(name)) {
				count = i;
			}
		}
		if(count > 0) {
			arr[selTable][count] = "---";
		} else {
			System.out.println("예약자 이름을 찾을 수 없습니다.");
		}
	}
}
