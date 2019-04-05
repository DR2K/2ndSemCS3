package Algorithms.Programs36;// Java3616.java
// This program tests the execution behavior of a triple nested
// loop.  Method <computeSum) adds 1 to sum, each time the
// inner loop is executed.


import java.util.*;


public class Java3616
{
	
	public static void main(String args[]) 
	{
		System.out.println("\nJava3616.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter loop size  ===>>  ");
		int size = input.nextInt();
		
		//////////
		time.startClock();
		long sum = computeSum(size);
		time.stopClock();
		//////////
		
		System.out.println("Sum: " + sum);
		System.out.println();
		System.out.println(time);
	}


	public static long computeSum(int n)
	{
   		long sum = 0;
   		for (int x = 1; x <= n; x++)
      		for (int y = 1; y <= n; y++)
	 			for (int z = 1; z <= n; z++)
	    			sum++;
   		return sum;
	}


}
