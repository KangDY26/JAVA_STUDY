package database.model;

import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Coffee {

	int coffee_id;
	String coffee_name;
	String coffee_size;
	Integer price;
	
	// 생성자는 클래스가 처음 생길때 
//	public Coffee(Integer coffee_id, String coffee_name, String coffee_size, Integer price) {
//		this.coffee_id = coffee_id;
//		this.coffee_name = coffee_name;
//		this.coffee_size = coffee_size;
//		this.price = price;
//		
//	}
	
	
	public Coffee(ResultSet rs) throws SQLException {
		
		coffee_id = rs.getInt(1);
		coffee_name = rs.getString(2);
		coffee_size = rs.getString(3);
		price = rs.getInt(4);
	
		
	}

	public Integer getCoffee_id() {
		return coffee_id;
	}

	public void setCoffee_id(Integer coffee_id) {
		this.coffee_id = coffee_id;
	}

	public String getCoffee_name() {
		return coffee_name;
	}

	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}

	public String getCoffee_size() {
		return coffee_size;
	}

	public void setCoffee_size(String coffee_size) {
		this.coffee_size = coffee_size;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Coffee [coffee_id=" + coffee_id + ", coffee_name=" + coffee_name + ", coffee_size=" + coffee_size
				+ ", price=" + price + "]";
	}
	

}
