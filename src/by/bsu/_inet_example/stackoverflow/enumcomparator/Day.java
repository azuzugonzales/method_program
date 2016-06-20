package by.bsu._inet_example.stackoverflow.enumcomparator;

import java.util.Comparator;

public enum Day{
	MONDAY(1, 3),
	TUESDAY(2, 6),
	WEDNESDAY(3, 5),
	THURSDAY(4, 4),
	FRIDAY(5, 2),
	SATURDAY(6, 1),
	SUNDAY(0, 0);
	
	private final int calendarPosition;
	private final int workLevel;
	
	Day(int position, int level){
		calendarPosition = position;
		workLevel = level;
	}
	
	int getCalendarPosition(){
		return calendarPosition;
	}
	int getWorkLevel(){
		return workLevel;
	}
	
	public static Comparator<Day> calendarPositionComparator = new Comparator<Day>(){
		public int compare(Day d1, Day d2){
			return d1.getCalendarPosition() - d2.getCalendarPosition();
		}
	};
	
	public static Comparator<Day> workLevelComparator = new Comparator<Day>(){
		public int compare(Day d1, Day d2){
			return d2.getWorkLevel() - d1.getWorkLevel();
		}
	};
}