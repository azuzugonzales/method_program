package by.bsu.resource.exception;
public class ResourceException extends Exception{
	public ResourceException(String message, Throwable cause){
		super(message, cause);
	}
	public ResourceException(String message){
		super(message);
	}
	public ResourceException(Throwable cause){
		super(cause);
	}
}