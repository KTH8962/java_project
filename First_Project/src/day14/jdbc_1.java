package day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class jdbc_1 {
	private static Scanner scan = new Scanner(System.in);
	private static void printData(ResultSet rs) throws SQLException {
		//throws try-catch라고 생각하면된다.
		System.out.println("========= 학생 목록 =========");
		while (rs.next()) {
			System.out.print(rs.getString("ID"));
			System.out.print("\t|\t" + rs.getString("NAME"));
			System.out.println("\t|\t" + rs.getString("DEPT"));
		}
	}
	
	// 추가 함수
	private static void addFunc(int num, Statement stmt) throws SQLException {
		String id = scanFunc("아이디");
		boolean chk = idChk(num, stmt, id);
		if(!chk) return;
		String name = scanFunc("이름");
		String dept = scanFunc("학과");	
		
		String query = "INSERT INTO TBL_STUDENT VALUES('"+ id + "', '" + name + "','"+ dept + "')";
		updateFunc("가입 완료", query, stmt);
	}
	
	// 삭제 함수
	private static void removeFunc(int num, Statement stmt) throws SQLException {
		String id = scanFunc("아이디");
		boolean chk = idChk(num, stmt, id);
		if(!chk) return;	
		
		String query = "DELETE FROM TBL_STUDENT WHERE ID='"+id+"'";
		updateFunc("삭제", query, stmt);
	}
	
	// 수정 함수
	private static void editFunc(int num, Statement stmt) throws SQLException {
		String id = scanFunc("아이디");
		boolean chk = idChk(num, stmt, id);
		if(!chk) return;
		String dept = scanFunc("수정 할 학과");		
		
		String query = "UPDATE TBL_STUDENT SET DEPT = '"+ dept +"' WHERE ID='"+id+"'";
		updateFunc("수정", query, stmt);
	}

	// 아이디 체크 함수
	private static boolean idChk(int num, Statement stmt, String id) throws SQLException {
		ResultSet idChk = stmt.executeQuery("SELECT * FROM TBL_STUDENT WHERE ID='" + id +"'");
		if(num == 1) {
			if(idChk.next()) {
				System.out.println("이미 가입 된 아이디입니다.");
				return false;
			}			
		} else if(num == 2 || num == 3) {
			if(!idChk.next()) {
				System.out.println("존재하지 않는 아이디입니다.");
				return false;
			}
		}
		return true;
	}
	
	// 업데이트 함수
	private static void updateFunc(String type, String query, Statement stmt) throws SQLException {
		stmt.executeUpdate(query);
		System.out.println(type + " 되었습니다.");
	}
	
	// 사용자 입력 함수
	private static String scanFunc(String title) {
		System.out.print(title + " 입력 : ");
		return scan.next();
	}

	// 메인 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		Statement stmt = null;		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";// localhost는 해당 ip주소 :포트번호 xe=>sid
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			// System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			
			try {
				while (true) {
					System.out.print("추가(1), 삭제(2), 수정(3), 확인(4), 끝내기(5) ");
					int num = scan.nextInt();
					if(num == 1) {
						addFunc(num, stmt);
					} else if(num == 2) {
						removeFunc(num, stmt);					
					} else if(num == 3) {
						editFunc(num, stmt);
					} else if(num == 4) {					
						ResultSet rs = stmt.executeQuery("SELECT * FROM TBL_STUDENT");
						printData(rs);
					} else if(num == 5) {
						System.out.println("종료되었습니다.");
						break;
					} else {
						System.out.println("1 ~ 5 사이의 숫자를 입력해주세요.");
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요.");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}

}
