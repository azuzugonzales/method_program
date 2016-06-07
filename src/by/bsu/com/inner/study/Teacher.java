package by.bsu.com.inner.study;
public class Teacher extends AbstractTeacher{
	public Teacher(int id){
		super(id);
	}
	@Override
	public boolean excludeStudent(String name){
		return false;
	}
}