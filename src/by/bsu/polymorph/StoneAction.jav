package by.bsu.polymorph;

import java.text.ParseException;

public class StoneAction{
	public void buildHouse(Stone stone){
		try{
			stone.build("some info");
		} catch(ParseException e){
			System.err.print(e);
		}
	}
}