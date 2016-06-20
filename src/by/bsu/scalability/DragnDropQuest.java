package by.bsu.scalability;
public class DragnDropQuest extends AbstractQuest{
	@Override
	public boolean check(Answer ans){
		System.out.println("Drag'n'Drop quest");
		return true;
	}
}