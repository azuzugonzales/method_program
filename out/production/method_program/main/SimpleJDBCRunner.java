package by.bsu.data.main;

import by.bsu.data.subject.Abonent;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class SimpleJDBCRunner{
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/testphones";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "2002138");
		prop.put("autoReconect", "true");
		prop.put("characterEncoding", "UTF-8");
		prop.put("useUnicode", "true");
		Connection cn = null;
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		try{	// 1 block
			cn = DriverManager.getConnection(new com.mysql.jdbc.Driver());
			Statement st = null;
			try{	// 2 block
				st = cn.createStatement();
				ResultSet rs = null;
				try{	// 3 block
					rs = st.executeQuery("SELECT * FROM phonebook");
					ArrayList<Abonent> lst = new ArrayList<>();
					while (rs.next()){
						int id = rs.getInt(1);
						int phone = rs.getInt(3);
						String name = rs.getString(2);
						lst.add(new Abonent(id, phone, name));
					}
					if(lst.size() > 0) {
						System.out.println(lst);
					} else{
						System.out.println("Not found");
					}
				} finally{ // on 3 block
					// close ResultSet if he be open
					if(rs != null){
						rs.close();
					} else{
						System.err.println("err in time read from BD");
					}
				}
			} finally{
				// close Statement
				if (st != null){ // on 2 block
					st.close();
				} else{
					System.err.println("Statement dont create");
				}			
			}
		} catch(SQLException e){ // on 1 block
			System.err.println("DB connection err: " + e);
		} finally{
			// close Connection
			if(cn != null){
				try{
					cn.close();
				} catch(SQLException e){
					System.err.println("Connection close error: " + e);
				}
			}
		}
	}
}
