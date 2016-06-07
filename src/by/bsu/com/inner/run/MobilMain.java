package by.bsu.com.inner.run;
import by.bsu.com.inner.Abonent;
public class MobilMain{
	public static void main(String[] args){
		Abonent abonent = new Abonent(819002, "Timofey Balashov");
		abonent.setTariffPlan("free");
		abonent.obtainPhoneNumber(375, 25);
		System.out.println(abonent);
	}
}