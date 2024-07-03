package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_3 {
	private static void printData(ResultSet rs) throws SQLException {
		//throws try-catch라고 생각하면된다.
		while (rs.next()) {
			System.out.print(rs.getString("STU_NAME"));
			System.out.print("\t|\t" + rs.getString("STU_NO"));
			System.out.println("\t|\t" + rs.getString("STU_DEPT"));
		}
	}

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";// localhost는 해당 ip주소 :포트번호 xe=>sid
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			stmt = conn.createStatement();
			
			while(true) {
				System.out.print("학번을 입력하세요 >> ");
				int stuNo = scan.nextInt();
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO="+ stuNo);
				
				if(!rs.next()) {
					System.out.println("학번을 다시 확인해주세요.");
				} else {				
					stmt.executeUpdate("DELETE FROM STUDENT WHERE STU_NO=" + stuNo);
					System.out.println("삭제되었습니다.");
					break;
				}				
			}
			
			
			

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
