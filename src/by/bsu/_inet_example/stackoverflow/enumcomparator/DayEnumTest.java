package by.bsu.com._inet_example.stackoverflow.enumcomparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DayEnumTest{
	public static void main(String[] args){
		List<Day> allDays = Arrays.asList(Day.values());
		System.out.println("===\nListing days in order of calendar position:");
		Collections.sort(allDays, Day.calendarPositionComparator);
		showItems(allDays);
		System.out.println("===\nListining days in order of work level:");
		Collections.sort(allDays, Day.workLevelComparator);
		showItems(allDays);
	}
	
	public static void showItems(List<Day> days){
		for(Day day : days){
			System.out.println(day.name());
		}
	}
}