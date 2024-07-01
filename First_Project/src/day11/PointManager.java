package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PointManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			System.out.print("이름과 포인트 입력 >> ");
			String info = scan.nextLine();			
			if(info.equals("그만")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(info, " ");
				String name = st.nextToken();
				String num = st.nextToken();
				int intNum = Integer.parseInt(num);
				map.put("name", name);
				map.put("num", intNum);
				list.add(map);
				if(list.size()>0) {
					for(int i=0; i < list.size() - 1; i++) {
						if(list.get(i).get("name").equals(name)) {
							int txt = (int) list.get(i).get("num");
							System.out.println(txt + " " + intNum);
							list.get(i).put("num", txt+intNum);
							list.remove(list.size( ) - 1);
						}
					}					
				}
				for(int i=0; i < list.size(); i++) {					
					System.out.print("(" + list.get(i).get("name") + "," + list.get(i).get("num") + ")");
				}
				System.out.println();
			}
		}
	}

}
