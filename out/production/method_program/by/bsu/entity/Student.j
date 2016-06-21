package by.bsu.entity;
import java.util.Vector;
public class Student implements Cloneable{
	private int id = 7;
	private String name;
	private int age;
	private Vector<Byte> v = new Vector<Byte>();
	
	public Student clone(){
		Student copy = null;
		try{
			copy = (Student)super.clone();
			copy.v = (Vector<Byte>)v.clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace("Do not realise interface Cloneable !");
		}
		return copy;
	}
}