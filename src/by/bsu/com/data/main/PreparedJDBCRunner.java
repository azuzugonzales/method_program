package by.bsu.com.data.main;

import by.bsu.com.data.connect.DataBaseHelper;
import by.bsu.com.data.subject.Abonent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PreparedJDBCRunner{
	public static void main(String[] args){
		ArrayList<Abonent> list = new ArrayList<Abonent>(){
			{
				add(new Abonent(87, 1658468, "Koguh Dmitri"));
				add(new Abonent(51, 8866711, "Bujkevich Alecsandr"));
			}
		};
		DataBaseHelper helper = null;
		PreparedStatement statement = null;
		try{
			helper = new DataBaseHelper();
			statement = helper.getPreparedStatement();
			for(Abonent abonent : list){
				helper.insertAbonent(statement, abonent);
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			helper.closeStatement(statement);
		}
	}
}