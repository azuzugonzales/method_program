package by.bsu.proj.annotation.logic;

import java.lang.reflect.Method;
import by.bsu.proj.annotation.SecurityLevelEnum;
public class SecurityLogic{
	public void onInvoke(SecurityLevelEnum level, Method method, Object[] args){
		StringBuilder argsString = new StringBuilder();
		for(Object arg : args){
			argsString.append(arg.toString() + " :");
		}
		argsString.setLength(argsString.length() - 1);
		System.out.println(String.format("Method %S invoked with parameters : %s", method.getName(), argsString.toString()));
		switch(level){
			case LOW: System.out.println("LOW level inspection security:" + level);
			break;
			case NORMAL: System.out.println("NORMAL level inspected security:" + level);
			break;
			case HIGH: System.out.println("HIGH level inspected security:" + level);
			break;
		}
	}
}