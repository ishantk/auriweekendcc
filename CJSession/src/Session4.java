class Block{
	
	static{
		System.out.println("This is static Block1");
	}
	
	{
		System.out.println("This is Block1");
	}
	
	Block(){
		System.out.println("This is Block Constructor");
	}
	
	{
		System.out.println("This is Block2");
	}
	
	static{
		System.out.println("This is static Block2");
	}
}

public class Session4 {
	
	static{
		System.out.println("Static Block of Session4");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		Block b1 = new Block();
		Block b2 = new Block();
	}

}
