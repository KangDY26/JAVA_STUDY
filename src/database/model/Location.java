package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Location {
	
	 Integer LOCATION_ID;   
	 String STREET_ADDRESS; 
	 String POSTAL_CODE;
	 String CITY;
	 String STATE_PROVINCE;
	 String COUNTRY_ID; 

	 
	 public Location(ResultSet rs) throws SQLException{
		 
		 LOCATION_ID = rs.getInt(1);   
		 STREET_ADDRESS = rs.getString(2);
		 POSTAL_CODE = rs.getString(3);
		 CITY = rs.getString(4);
		 STATE_PROVINCE = rs.getString(5);
		 COUNTRY_ID = rs.getString(6); 
		 
	 }


	public Integer getLOCATION_ID() {
		return LOCATION_ID;
	}


	public void setLOCATION_ID(Integer lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}


	public String getSTREET_ADDRESS() {
		return STREET_ADDRESS;
	}


	public void setSTREET_ADDRESS(String sTREET_ADDRESS) {
		STREET_ADDRESS = sTREET_ADDRESS;
	}


	public String getPOSTAL_CODE() {
		return POSTAL_CODE;
	}


	public void setPOSTAL_CODE(String pOSTAL_CODE) {
		POSTAL_CODE = pOSTAL_CODE;
	}


	public String getCITY() {
		return CITY;
	}


	public void setCITY(String cITY) {
		CITY = cITY;
	}


	public String getSTATE_PROVINCE() {
		return STATE_PROVINCE;
	}


	public void setSTATE_PROVINCE(String sTATE_PROVINCE) {
		STATE_PROVINCE = sTATE_PROVINCE;
	}


	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}


	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}

	@Override
	public String toString() {
		return "Location [LOCATION_ID=" + LOCATION_ID + ", STREET_ADDRESS=" + STREET_ADDRESS + ", POSTAL_CODE="
				+ POSTAL_CODE + ", CITY=" + CITY + ", STATE_PROVINCE=" + STATE_PROVINCE + ", COUNTRY_ID=" + COUNTRY_ID
				+ "]";
	}
	
}
