import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

class Student implements Serializable{
	
	// Attributes
	transient int roll;
	String name;
	
	//Methods
}

public class SerialiazationDemo {

	volatile long l = 100l;
	
	public static void main(String[] args) {
		
		Integer iRef = new Integer(10);
		AtomicInteger aRef = new AtomicInteger(10);
		
		//Student s1 = new Student();
		//s1.roll = 101;
		//s1.name = "John Watson";
		
		// Student Object Should be Persisted
		try {
			// Serialization
			//File file = new File("/Users/ishantkumar/Downloads/students.dat");
			//FileOutputStream fos = new FileOutputStream(file);
			//ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//oos.writeObject(s1);
			
			//oos.close();
			//fos.close();
			
			//System.out.println("Object Saved");
			
			// De-Serialization
			/*File file = new File("/Users/ishantkumar/Downloads/students.dat");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student s = (Student)ois.readObject();
			System.out.println(s.roll +" - "+s.name);*/
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}

	}

}
