package by.bsu.dates;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
public class DemoDateFormat{
	public static void main(String[] args){
		/*DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
		Date d = null;
		String str = "April 22, 2016";
		try{
			d = df.parse(str);
			System.out.println(d);
		} catch(ParseException e){
			System.err.print("Error position: " + e.getErrorOffset());
		}
		df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
		System.out.println(df.format(d));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
		System.out.println(df.format(d));*/
		
		System.out.println("----------FULL----------");
		Date d = new Date();
		Locale[] locales = DateFormat.getAvailableLocales();
			for(Locale loc : locales){
				DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, loc);
				System.out.println(loc.toString() + "---> " + df.format(d));
			}
		
	}
}