package database.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import database.DBConnector;

public class J03_DBPractice {

	/*
	 	(1) 관리자 계정으로 DB에 새 계정을 추가한다
	 	
	 	(2) 관리자 계정으로 새 계정에 권한을 부여한다
	 	
	 	(3) 해당 계정에 새 테이블을 추가한다
	 		(기본키로 시퀀스를 사용해야 하고, 제약 조건을 종류별로 모두 사용해야 한다)
	 	
	 	(4) 프로그램에서 스캐너로 입력하면 DB에 데이터가 추가되어야 한다
	 	
	 	(5) 콘솔에서 여태까지 추가된 모든 행을 조회 할 수 있어야한다
	 
	 */
	public static void main(String[] args) {
		
		String driverPath = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "test1";
		String password = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(driverPath);
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("로드 실패");
		}
				
		String sql = "INSERT INTO zoo VALUES (zoo_seq.nextval, ?, ?)";  

		try (
			Connection conn = DriverManager.getConnection(url ,user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			System.out.println("한국어 이름 입력하시오");
			pstmt.setString(1, sc.nextLine());
			System.out.println("영어 이름 입력하시오");
			pstmt.setString(2, sc.nextLine());
			
			int row = pstmt.executeUpdate();
			System.out.printf("%d행이 추가되었습니다.\n", row);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	}
}
