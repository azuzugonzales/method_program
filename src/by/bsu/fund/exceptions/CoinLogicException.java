package by.bsu.fund.exceptions;
public class CoinLogicException extends Exception{
	public CoinLogicException(){
		
	}
	public CoinLogicException(String message, Throwable exception){
		super(message, exception);
	}
	public CoinLogicException(String message){
		super(message);
	}
	public CoinLogicException(Throwable exception){
		super(exception);
	}
}