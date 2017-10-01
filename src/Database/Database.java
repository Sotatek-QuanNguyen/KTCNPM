package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	private static Database instance;
	private final String url = "jdbc:ucanaccess://CSDL//databaseQuanly.accdb";
	public Connection connection;
	public static Database shareInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public Connection connect() {
		try
		{
			String strConn=url;
			connection = DriverManager.getConnection(strConn);
			return connection;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	
	public String getMa() {
  		// TODO Auto-generated method stub
    	  int random1 = (int )(Math.random() * 10);
	    	int random2 = (int )(Math.random() * 10);
	    	int random3 = (int )(Math.random() * 10);
	    	int random4 = (int )(Math.random() * 10);
	    	int random5 = (int )(Math.random() * 10);
	    	int random6 = (int )(Math.random() * 10);
	    	int random7 = (int )(Math.random() * 10);
	    	int random8 = (int )(Math.random() * 10);
	    	
  		return random1 +""+ random2 +""+ random3 +""+ random4 +""+ random5 +""+ random6 +""+ random7 +""+ random8;
	}
}
