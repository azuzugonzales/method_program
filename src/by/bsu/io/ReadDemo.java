package by.bsu.io;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadDemo{
	public static void main(String[] args){
		String file = "data\\file.txt";
		File f = new File(file);
		int b, count = 0;
		FileReader is = null;
		// FileInputStream is = null; 	alternative
		try{
			is = new FileReader(f);
			// is = new FileInputStream(f);
			while((b = is.read()) != -1){
				System.out.print((char) b);
				count++;
			}
			System.out.print("\n count byte = " + count);
		} catch(IOException e){
			System.err.println("error file: " + e);
		} finally{
			try{
				if(is != null){
					is.close();
				}
			} catch(IOException e){
				System.err.println("error close: " + e);
			}
		}
	}
}