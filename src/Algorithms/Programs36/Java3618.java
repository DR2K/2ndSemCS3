package Algorithms.Programs36;// Java3618.java
// This program computes the nth number in a Fibonacci
// sequence with a recursive method.


import java.util.*;


public class Java3618
{
	
	public static void main(String args[])  
	{
		System.out.println("\nJava3618.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter Fibonacci number  ===>>  ");
		int n = input.nextInt();
		
		//////////
		time.startClock();
		long fibo = computeFibo(n);
		time.stopClock();
		//////////
		
		System.out.println("Fibonacci number " + n + " is " + fibo);
		System.out.println();
		System.out.println(time);
	}


	public static long computeFibo(int n)
	{
   		long fiboNr = 1;
   			if (n == 1 || n == 2)
      			return fiboNr;
   		else
      		return computeFibo(n-1) + computeFibo(n-2);
	}
 	
}