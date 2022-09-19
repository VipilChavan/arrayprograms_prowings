package ArrayPrograms;

public class SumAndAvgOfArray {
	public static void main(String[] args) {   
		 
	       int[] numbers = new int[]{10, 30, 30, 40, 50, 60, 100};
	       //calculate sum of all array elements
	       int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Sum of the array elements is : " + sum);
	        System.out.println("Average of the array elements is : " + average); 
	   }

}
