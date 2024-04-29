package SeleniumPratices.Topice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DataBaseconnection {
	Connection connection;
	Statement statement;
	String url = "jdbc:mysql://172.16.1.157/edotco_bd";
	String username = "root";
	String password = "Password";
	
	@Test
	public void databaseconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			System.out.println(" Data base connected succesfully");
			//stmt = con.createStatement();
			//ResultSet rs = stmt.executeQuery("SELECT * FROM site ");
			//System.out.println(rs);	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public void closeConnection() {
//		try {
//			if(connection != null) {
//				connection.close();
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	public void fetchDataFromSiteTable() {
		try {
			statement = connection.createStatement();
			String sitequery = "SELECT * FROM site" ;
			ResultSet resultSet = statement.executeQuery(sitequery);
			while (resultSet.next()) {
                // Process data from Table2
                System.out.println("Data from Table2: " + resultSet.getString("smSiteName"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
