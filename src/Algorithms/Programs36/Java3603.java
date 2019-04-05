package Algorithms.Programs36;// Java3603.java
// This program measures the time necessary to count and display integers.


import java.util.*;


public class Java3603
{
	
	public static void main(String args[])
	{
		System.out.println("\nJava3603.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter an integer  ===>>  ");
		int count = input.nextInt();
		
		//////////
		time.startClock();
		counter(count);
		time.stopClock();
		//////////
		
		System.out.println();
		System.out.println(time);
	}

	public static void counter (int n)
	{
		for (int k = 1;  k <= n; k++)
			System.out.print(k + "\t");
   	}


}
