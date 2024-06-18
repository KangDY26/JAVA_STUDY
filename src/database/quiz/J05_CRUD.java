package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;
import database.model.Coffee;

public class J05_CRUD {
	
	//(1) 모든 커피 목록을 리스트 형태로 반환하는 메서드
	
	public static void coffeeList() {

		DBConnector connector = new DBConnector("HR", "1234");
		
		List<Coffee> coffees = new ArrayList<>();

		try (
				Connection conn = connector.getConnection();
			){
				String sql = "SELECT * FROM coffee";
				
				
				try (
					PreparedStatement pstmt = conn.prepareStatement(sql);
					ResultSet rs = pstmt.executeQuery()	
				){
					
					while(rs.next()) {
						Coffee cof = new Coffee(rs);
						coffees.add(cof);
					}
						
				} 
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			for (Coffee coffee : coffees) {
				System.out.println(coffee);
			}

	}
	
	//(2) 커피 이름으로 검색한 결과를 리스트 형태로 반환하는 메서드(Like)
	
	public static List<Coffee> searchCoffee (String name) {
		
		DBConnector connector = new DBConnector("HR", "1234");

		List<Coffee> list = new ArrayList<>();
		
		String sql = "SELECT * FROM coffee WHERE coffee_name Like ?";
		
		try (
			Connection conn = connector.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setString(1, name);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Coffee cf = new Coffee(rs);
				list.add(cf);
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return list;
	}
	
	

	//(3) 새로운 커피를 추가하는 메서드 (추가할 때 시퀀스 사용)
	
	//(4) 이미 존재하는 커피의 정보를 수정할 수 있는 메서드 (기본키는 수정불가능)
	
	//(5) 커피 ID를 매개변수로 전달받으면 해당 커피를 삭제하고 삭제 여부를 반환해주는 메서드
	
	
	public static void main(String[] args) {
		
		
		coffeeList();
		
		List<Coffee> coffees1 = new ArrayList<>();

		

		
		System.out.println(searchCoffee("아%"));
		
		
	
//		try (
//				Connection conn = connector.getConnection();
//			){
//				String sql1 = "SELECT * FROM coffee WHERE coffee_name Like ?";
//				
//				
//				try (
//					PreparedStatement pstmt1 = conn.prepareStatement(sql1);
//					ResultSet rs1 = pstmt1.executeQuery()	
//				){
//					pstmt1.setString(1, );
//					
//					while(rs1.next()) {
//						Coffee cof1 = new Coffee(rs1);
//						coffees1.add(cof1);
//					}
//						
//				} 
//					
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		
//
//			for (Coffee coffee1 : coffees1) {
//				System.out.println(coffee1);
//			}

		
	}
	
}
