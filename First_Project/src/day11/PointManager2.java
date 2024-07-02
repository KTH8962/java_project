package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class PointManager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Integer>> list = new ArrayList<HashMap<String, Integer>>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while (true) {
			System.out.print("이름과 포인트 입력 >> ");
			String info = scan.nextLine();
			if (info.equals("그만")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(info, " ");
				String name = st.nextToken();
				int points = Integer.parseInt(st.nextToken());
				boolean check = false;
				for (HashMap<String, Integer> map : list) {
					if (map.containsKey(name)) {
						map.put(name, map.get(name) + points);
						check = true;
						break;
					}
				}
				if (!check) {
					HashMap<String, Integer> map = new HashMap<String, Integer>();
					map.put(name, points);
					list.add(map);
				}

				for (HashMap<String, Integer> map : list) {
					for (String key : map.keySet()) {
						System.out.print("(" + key + "," + map.get(key) + ")");
					}
				}

				System.out.println("");
			}
		}
	}

}
