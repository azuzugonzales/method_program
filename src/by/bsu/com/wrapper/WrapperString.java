package by.bsu.com.wrapper;
public class WrapperString {
	private String str;
	public WrapperString(){
		str = new String();
	}
	public WrapperString(String s) {
		str = new String(s);
	}
	public int indexOf(int arg) {
		return arg;
	}
}