package by.bsu.io;
import java.io.*;
public class WriteRunner{
	public static void main(String[] args){
		String pArray[] = { "2013 ", "Java SE 8" };
		File fbyte = new File("data\\byte.data");
		File fsymb = new File("data\\symbol.txt");
		FileOutputStream fos = null;
		FileWriter fw = null;
		try{
			fos = new FileOutputStream(fbyte);
			fw = new FileWriter(fsymb);
			for(String a : pArray){
				fos.write(a.getBytes());
				fw.write(a);
			}
		} catch(IOException e){
			System.err.println("error write: " + e);
		} finally{
			try{
				if(fos != null){
					fos.close();
				}
				if(fw != null){
					fw.close();
				}
			} catch(IOException e){
				System.err.println("error close stream: " + e);
			}
		}
	}
}