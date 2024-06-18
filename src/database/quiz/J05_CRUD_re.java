package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBConnector;
import database.model.Coffee;

public class J05_CRUD_re {

	// (1) 모든 커피 목록을 리스트 형태로 반환하는 메서드
	public static void main(String[] args) {

		DBConnector connector = new DBConnector("HR", "1234");

		try (Connection conn = connector.getConnection();
			
		){

			String sql = "SELECT * FROM coffee";

			try (
				 PreparedStatement pstmt = conn.prepareStatement(sql);
				 ResultSet rs = pstmt.executeQuery();
			){
				while(rs.next()) {
					Coffee cof = new Coffee(rs);
					System.out.println(cof);
				}
				

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
