package Task9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	
	public static void main(String args[]) {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemgnt", "root", "SOWmgs@11");
			PreparedStatement stmt = con.prepareStatement("insert into jdbc (empcode, empname, empage, esalary) values (?, ?, ?,?)");
			int[] empcodes = {101, 102, 103, 104, 105};
	        String[] empnames = {"jeny", "jacky", "joe", "john", "shameer"};
	        int[] empages = {20, 30, 20, 40, 25};
	        double[] esalaries = {10000, 20000, 40000, 80000, 90000};
	        for (int i = 0; i < empcodes.length; i++) {
	        	stmt.setInt(1, empcodes[i]);
	        	stmt.setString(2,empnames[i]);
	        	stmt.setInt(3, empages[i]);
	        	stmt.setDouble(4,esalaries[i]);
	        	stmt.addBatch();
	        	}
			int[] status = stmt.executeBatch();
			System.out.println("status= " + status);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
}

}
