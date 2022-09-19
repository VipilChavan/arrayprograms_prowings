package ArrayPrograms;

public class ReverseArray {
	public static void main (String[] args)
	{
		int[] x={10,20,30,40,50};
			
		System.out.print("Element before reverse order:");
		
		for(int i=0;i<x.length;i++) 
		{
			System.out.print(x[i]+ " ");		
		}
		System.out.println("\n\nElement before reverse order:");
		for(int i=x.length-1;i>=0;i--) 
		{
			System.out.print(x[i]+ " ");		
		}
		
	}

}
