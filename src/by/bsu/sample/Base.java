package by.bsu.sample;
class Base{
	public static void go(){
		System.out.println("method from Base");
	}
}
class Sub extends Base{
	public static void go(){
		System.out.println("method from Sub");
	}
}
class Runner{
	public static void main(String[] args){
		Base ob = new Sub();
		ob.go();
	}
}