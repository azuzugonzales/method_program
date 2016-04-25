package by.bsu.conn;

import by.bsu.fund.entity.Coin;
import by.bsu.fund.exceptions.CoinLogicException;

public class ResourceAction{
	public void doAction(String value) throws CoinLogicException {
		Coin ob = new Coin();
		try{
			double d = Double.parseDouble(value);
			ob.setDiameter(d);
		} catch(CoinException e){
			throw e;
		}		
	}
}