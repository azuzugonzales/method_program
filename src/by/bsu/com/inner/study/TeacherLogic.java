package by.bsu.com.inner.study;
public class TeacherLogic {
	public void excludeProcess(int rectorId, String nameStudent){
		AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
		
		System.out.println("Student: " + nameStudent
							+ " expelled:" + teacher.excludeStudent(nameStudent));
	}
}