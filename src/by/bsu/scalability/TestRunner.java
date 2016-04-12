package by.bsu.scalability;
public class TestRunner{
	public static void main(String[] args){
		TestAction bt = new TestAction();
		AbstractQuest[] test = bt.generateTest(60, 2);
		bt.checkTest(test);
	}
}