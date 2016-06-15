package by.bsu.com.io;
import java.io.File;
import java.util.Date;
import java.io.IOException;
public class FileTest{
	public static void main(String[] args){
		File fp = new File("data\\FileTest2.java");
		if(fp.exists()){
			System.out.println(fp.getName() + "\texist");
			if(fp.isFile()){
				System.out.println("The Path to the file:\t" + fp.getPath());
				System.out.println("Absolute path:\t" + fp.getAbsolutePath());
				System.out.println("File size:\t" + fp.length());
				System.out.println("Last modified:\t" + new Date(fp.lastModified()));
				System.out.println("File readeble:\t" + fp.canRead());
				System.out.println("File is writable:\t" + fp.canWrite());
				System.out.println("File deleted:\t" + fp.delete());
			}
		} else
			System.out.println("file " + fp.getName() + " does not exist");
		try{
			if(fp.createNewFile()){
				System.out.println("File " + fp.getName() + " create");
			}
		} catch(IOException e){
			System.err.println(e);
		}
		
		File dir = new File("com" + File.separator + "learn");
		if(dir.exists() && dir.isDirectory()){
			System.out.println("directory " + dir.getName() + " exist");
		}
		
		File[] files = dir.listFiles();
		for(int i = 0; i < files.length; i++){
			Date date = new Date(files[i].lastModified());
			System.out.print("\n" + files[i].getPath() + " \t| " + files[i].length() + "\t|" + date);
		}
		File root = File.listRoots()[1];
		System.out.printf("\n%s %,d from %,d free.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
	}
}