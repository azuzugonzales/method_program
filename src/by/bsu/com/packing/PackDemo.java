package by.bsu.com.packing;
import java.io.FileNotFoundException;
public class PackDemo{
	public static void main(String[] args){
		String dirName = "pack";
		PackJar pj = new PackJar("pack\\example.jar");
		try{
			pj.pack(dirName);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}