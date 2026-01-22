package M5.Activity2.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Hello world!
 *
 */
public class DBConnection {
	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
    private static final String USER = "rbtortogo";
    private static final String PASSWORD = "postgres";
    
    public static void main( String[] args ) {
    	
    	Connection connection = null;
    	
    	
        try {
        	//connection
        	connection=DriverManager.getConnection(URL,USER,PASSWORD);
        	System.out.print("Connected to Postgre Successfully!!!");
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }finally {
        	try {
        		connection.close();
        	}catch(SQLException e) {
        		e.printStackTrace();
        	}
        }
    }
}
