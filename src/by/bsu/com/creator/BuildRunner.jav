package by.bsu.com.creator;

public class BuildRunner{
	public static void main(String[] args){
		Point2DCreator br = new Point3DCreator();
		Point2D p = br.createPoint();
		System.out.println(br.createPoint().x);
		System.out.println(br.createPoint().y);
	}
}