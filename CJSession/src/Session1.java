
public class Session1 {

	public static void main(String[] args) {
		
		System.out.println("Hello World...");

		int i = 10; // Single Value Container
		//int j = 10,20; // Multi Value Container -> error
		
		
		int[] j = {10,20,30,40,50}; // Multi Value Container -> Array | Homogeneous in Nature
		int[] j1 = new int[]{10,20,30,40,50};
		
		
		int[] j2 = new int[10];
		
		int i1,i2;
		i1 = 10;
		i2 = 20;
		
		int j3[],j4[],j9[];
		int[] j5,j6,j7;
		j3 = new int[5];
		j4 = new int[50];
		
		System.out.println("i is: "+i);
		
		// j is a reference variable
		System.out.println("j is: "+j);
		
		
		int k = i; // Value Copy
		
		int[] l = j; // Reference Copy
		
		System.out.println("k is: "+k);
		System.out.println("l is: "+l);
		
		
		int[] a = new int[5];
		// Write into array
		a[0] = 10;
		a[3] = 120;
		
		//for(i=0;i<a.length;i++){
		//	System.out.println(a[i]);
		//}
		
		//Enhanced For Loop | Read the Array
		for(int elm : a){
			System.out.println(elm);
		}
		
		
		int[][] arr = {
						{10,20,30},
						{10,20},
						{10,20,30,40},
						{10},
						{10,20,30,40,50}
					  };
		
		System.out.println("arr is: "+arr);
		System.out.println("arr length is: "+arr.length);
		
		System.out.println("arr[0] is: "+arr[0]);
		System.out.println("arr[0] length is: "+arr[0].length);
		
		System.out.println(arr[0][0]);
		
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr[x].length;y++){
				System.out.print(arr[x][y]+"   ");
			}
			System.out.println();
		}
		
		int[][][] arr1 = {
								{
									{10,20,30},
									{10,20}
					  			},
								{
									{10,20,30,40},
									{10},
									{10,20,30,40,50}
								}
						};
		
		
		int[][] arr2 = new int[3][5];
		int[][] arr3 = new int[3][];
		arr3[0] = new int[10];
		arr3[2] = new int[100];
		arr3[3] = new int[1000];
		
	}
	
	// ND Array is a collection of N-1D Arrays
	// 5 D Array find the largest number's index

	
	
}
