package SeleniumPratices.Topice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mainclassdatabaseconnection {

	public static void main(String[] args) throws Exception{
		 Connection con; 
	     Statement stmnt;
	     try {
	 
	    	 Class.forName("com.mysql.jdbc.Driver");
	 
	         con = DriverManager.getConnection("jdbc:mysql://172.16.1.157/edotco_bd", "root", "Password");
	 
	         stmnt = con.createStatement();
	         ResultSet rs =stmnt.executeQuery("SELECT * FROM site ");
	         rs.next();
	         //String name =rs.getString("name");
	         String userdata =rs.getInt(1)+":"+ rs.getString("smSiteName");

	         while(rs.next()) {
	          userdata =rs.getInt(1)+":"+ rs.getString("smSiteName");
	          System.out.println(userdata);
	         //System.out.println(rs);
	 
	        } 
	     }catch (Exception e) {
	 
	        e.printStackTrace();
	 
	        }
	 
	       }
}
