package by.bsu.com.scalability;
public abstract class AbstractQuest{
	private long id;
	private String questContent;
	public abstract boolean check(Answer ans);
}