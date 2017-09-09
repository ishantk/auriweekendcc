// Textually Describe our Object i.e. a BOX using class
class User{
	
	//Attributes | Property of Object
	private String name;
	String email;
	String password;
	char gender;
	int age;
	String address;	
	
	// Method
	
	// Setter
	void setName(String n){
		name = n;
	}
	
	// Getter
	String getName(){
		return name;
	}
}


public class Session2 {

	public static void main(String[] args) {
		
		int i = 10;
		
		// u is a reference variable
		User u1 = new User();
		User u2 = new User();
		
		User u3 = u1; // Reference Copy
		
		System.out.println("i is: "+i);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		
		// Write the data in Object(Box)
		//u1.name = "John";
		u1.setName("John");
		u1.email = "john@example.com";
		u1.gender = 'M';
		
		//u2.name = "Jennie";
		u2.setName("Jennie");
		u2.email = "jennie@example.com";
		u2.gender = 'F';
		
		// Read from Object
		//System.out.println(u1.name+" - "+u1.gender);
		//System.out.println(u2.name+" - "+u2.gender);
		
		System.out.println(u1.getName()+" - "+u1.gender);
		System.out.println(u2.getName()+" - "+u2.gender);
		
	}

}
