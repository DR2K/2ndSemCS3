package Algorithms.Programs36;// Java3617.java
// This program computes the nth number in a Fibonacci
// sequence with an iterative method.


import java.util.*;


public class Java3617
{
	
	public static void main(String args[]) 
	{
		System.out.println("\nJava3617.java\n");
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
		long nr1 = 1;
   		long nr2 = 1;
   		long nr3 = 1;
   		for (int k = 3; k <= n; k++)
   		{
      		nr3 = nr1 + nr2;
      		nr2 = nr1;
      		nr1 = nr3;
   		}
   		return nr3;
	}
	
}