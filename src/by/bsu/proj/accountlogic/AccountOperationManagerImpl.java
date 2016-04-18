package by.bsu.proj.accountlogic;
import by.bsu.proj.annotation.BankingAnnotation;
import by.bsu.proj.annotation.SecurityLevelEnum;
public class AccountOperationManagerImpl implements AccountOperationManager{
	@BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
	public double depositInCash(int accountNumber, int amount){
		return 0;
	}
	@BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
	public boolean withdraw(int accountNumber, int amount){
		return true;
	}
	@BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
	public boolean convert(double amount){
		return true;
	}
	@BankingAnnotation
	public boolean transfer(int accountNumber, double amount){
		return true;
	}
}