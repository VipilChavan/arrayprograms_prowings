package ArrayPrograms;

public class SwapingOfTwoArrayElements {
	public static void main(String [] args)
	{
	 int [] x={10,20,30,40,50};
	 
	 System.out.print("Original Array is:");
	 for(int i=0;i<x.length;i++)
		 {
			 System.out.print(x[i]+ " "); 
		 }		 
	 
	 int temp=x[0];
	 
	 x[0]=x[x.length-1];
	 
	 x[x.length-1]=temp;
	 
	 System.out.print("\nSwapped Array is:");
	 for(int i=0;i<x.length;i++)
		 {
			 System.out.print(x[i]+ " "); 
		 }		 
	 
	  //System.out.println(Arrays.toString(x));
	  //WE CAN USE THIS TO PRINT ARRAY WHICH CONVERTS ARRAY INTO STRING
	  
	 
	}
}
