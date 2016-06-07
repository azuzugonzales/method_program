package by.bsu.com.exam;
public class Runner {
	public static void main(String[] args) {
		Exam<Double> md1 = new Exam<Double>(71.41D, "Progr");
		Exam<Double> md2 = new Exam<Double>(71.45D, "Progr");
			System.out.println(md1.equalsToMark(md2));
			Exam<Integer> mi = new Exam<Integer>(71, "Progr");
	}
}