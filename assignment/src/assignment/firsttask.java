package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class firsttask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

				Connection c = null;
				Statement abcd = null;
				
				try {
				   Class.forName("org.postgresql.Driver");
				   c = DriverManager
				      .getConnection("jdbc:postgresql://localhost:5432/postgres",
				      "postgres", "123");
				   
				   System.out.println("Opened database successfully");
				   
				   Statement abcd1 = c.createStatement();
			         String sql = "CREATE TABLE COMPANY " +
			            "(ID INT PRIMARY KEY     NOT NULL," +
			            " NAME           TEXT    NOT NULL, " +
			            " AGE            INT     NOT NULL, " +
			            " ADDRESS        CHAR(50), " +
			            " SALARY         REAL)";
			         abcd1.executeUpdate(sql);
//			         abcd1.close();
//			         c.close();
			   
				} catch (Exception e) {
				   e.printStackTrace();
				   System.err.println(e.getClass().getName()+": "+e.getMessage());
				   System.exit(0);
				}
				

			

	}
}

