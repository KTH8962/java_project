package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_1 {
	private static void printData(ResultSet rs) throws SQLException {
		//throws try-catch라고 생각하면된다.
		while (rs.next()) {
			System.out.print(rs.getString("STU_NAME"));
			System.out.print("\t|\t" + rs.getString("STU_NO"));
			System.out.print("\t|\t" + rs.getString("STU_HEIGHT"));
			System.out.println("\t|\t" + rs.getString("STU_DEPT"));
		}
	}

	public static void main(String[] args) {
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

			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			printData(rs);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
