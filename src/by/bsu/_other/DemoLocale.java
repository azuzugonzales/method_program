package by.bsu._other;
import java.util.Locale;
public class DemoLocale{
	public static void main(String[] args){
		//Locale rus = new Locale("ru", "RU");
		//System.out.println(rus);
		
		Locale current = Locale.getDefault();
		System.out.println(current);
		
		//Locale.setDefault(Locale.CANADA);
		//Locale current1 = Locale.getDefault();
		//System.out.println(current1);				
	}
}