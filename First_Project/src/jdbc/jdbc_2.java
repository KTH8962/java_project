package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_2 {
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
			// System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			//INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES(12345678, '홍길동');
			//stmt.executeUpdate("INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES(12345678, '홍길동')");
			
			while(true) {
				System.out.print("이름을 입력하세요 >> ");
				String name = scan.next();
				System.out.print("학번을 입력하세요 >> ");
				int stuNo = scan.nextInt();
				ResultSet stuNoChk = stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO="+stuNo);
				if(stuNoChk.next()) {
					System.out.println("이미 등록된 학번입니다.");
				} else {
					String query = "INSERT INTO STUDENT(STU_NO, STU_NAME) VALUES(" + stuNo + ", '" + name + "')";
					stmt.executeUpdate(query);
					break;
				}				
			}
			System.out.println("가입되었습니다.");
					
			//ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			//printData(rs);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
