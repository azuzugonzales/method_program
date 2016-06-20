package by.bsu.packing;
public class UnpackDemo{
	public static void main(String[] args){
		String nameJar = "pack\\example.jar";
		String destinationPath = "d:\\document\\workspace\\method_program\\unpack";
		new UnPackJar().unpack(destinationPath, nameJar);
	}
}