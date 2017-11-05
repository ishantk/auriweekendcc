import java.io.FileNotFoundException;
import java.io.IOException;

import com.auribises.exceptions.ThrowThrowsDemo;

/*Topics: 
	Syso
	Serialization
*/
class A{
	void throwSome() throws IOException{
		throw new IOException();
	}
}

class B extends A{
	void throwSome() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
}

class PPrintStream{
	void pprintln(String message){
		System.out.println(message);
	}
}

class SSystem{

	static PPrintStream oout = new PPrintStream();	
}

public class QuerySession {

	
	
	public static void main(String[] args) {
		
		SSystem.oout.pprintln("Be Exceptional!!");
		

	}

}
