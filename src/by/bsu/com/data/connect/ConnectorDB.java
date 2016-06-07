package by.bsu.com.data.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class ConnectorDB{
	public static Connection getConnection() throws SQLException{
		ResourceBundle resource = ResourceBundle.getBundle("databse");
		String url = resource.getString("db.url");
		String user = resource.getString("db.user");
		String pass = resource.getString("db.password");
		return DriverManager.getConnection(url, user, pass);

		//Connection cn = ConnectorDB.getConnection();
	}
}