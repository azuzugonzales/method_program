package by.bsu.serial;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.FileNotFoundException;
import java.io.NotSerializableException;
public class Serializator{
	public boolean serialization(Student s, String fileName){
		boolean flag = false;
		File f = new File(fileName);
		ObjectOutputStream ostream = null;
		try{
			FileOutputStream fos = new FileOutputStream(f);
			if(fos != null){
				ostream = new ObjectOutputStream(fos);
				ostream.writeObject(s);
				flag = true;
			}
		} catch(FileNotFoundException e){
			System.err.println("File can not be created: " + e);
		} catch(NotSerializableException e){
			System.err.println("Class does not support serialization: " + e);
		} catch(IOException e){
			System.err.println(e);
		} finally{
			try{
				if(ostream != null){
					ostream.close();
				}
			} catch(IOException e){
				System.err.println("error close stream");
			}
			return flag;
		}
		
	}
	public Student deserialization(String fileName) throws InvalidObjectException{
		File fr = new File(fileName);
		ObjectInputStream istream = null;
		try{
			FileInputStream fis = new FileInputStream(fr);
			istream = new ObjectInputStream(fis);
			Student st = (Student) istream.readObject();
			return st;
		} catch(ClassNotFoundException ce) {
			System.err.println("Class does not exist: " + ce);
		} catch(FileNotFoundException e){
			System.err.println("File for deserialization does not exist: " + e);
		} catch(InvalidClassException ioe){
			System.err.println("Version mismatch classes: " + ioe);
		} catch(IOException ioe){
			System.err.println("Total I/O error: " + ioe);
		} finally{
			try{
				if(istream != null){
					istream.close();
				}
			} catch(IOException e){
				System.err.println("error close stream ");
			}
		}
		throw new InvalidObjectException("object is not restored");
	}
}