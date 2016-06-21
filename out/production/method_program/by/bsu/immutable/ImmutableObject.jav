package by.bsu.immutable;
public class ImmutableObject {
	private String name;
	private int id;
	public ImmutableObject(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getName(){
		return name;
	}
	public int getId(){
		return id;
	}
}