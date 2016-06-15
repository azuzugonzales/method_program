package by.bsu.com.construction;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

class Resource{
	public Resource(String filename) throws FileNotFoundException{
		// more code
	}
}
class ConcreteResource extends Resource{
	public ConcreteResource(String name) throws FileNotFoundException{
		super(name);
		// more code
	}
	public ConcreteResource() throws IOException{
		super("file.txt");
		// more code
	}
	public ConcreteResource(String name, int mode){
		super(name);
	}
	public ConcreteResource(String name, int mode, String type) throws ParseException {
		super(name);
		// more code
	}
}