package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
	try {
	Class.forName("org.postgresql.Driver");
	connection= DriverManager.getConnection
	("jdbc:postgresql://localhost:5432/db_mvc_cat","postgres","admin");
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	public static Connection getConnection() {
	return connection;
	}

}
