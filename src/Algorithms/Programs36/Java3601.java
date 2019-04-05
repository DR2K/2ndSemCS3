package Algorithms.Programs36;// Java3601.java
// This program uses a <TimeTest> class, which displays the elapsed time
// in hh:mm:ss.fractions for executing some program code.


import java.util.*;
import java.text.DecimalFormat;


public class Java3601
{
	public static void main(String args[])
	{
		System.out.println("\nJava3601.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest01 time = new TimeTest01();
		System.out.print("Press <Enter> to start the clock  ===>>  ");
		input.nextLine();
		
		//////////
		time.startClock();
		System.out.println();
		System.out.print("Press <Enter> to stop the clock   ===>>  ");
		input.nextLine();
		time.stopClock();
		//////////
		
		System.out.println();
		System.out.println(time);
		System.out.println();
	}
}
		


class TimeTest01
{
	
	private long startNanos;	// tick count at the start of the test
	private long endNanos;		// tick count at the end of the test
	private long nanos;			// elapsed number of ticks
	private long hours;			// elapsed hours
	private long minutes;		// elapsed minutes
	private long seconds;		// elapsed seconds
	private long fractions;		// elapsed fractions of a second
	
	public TimeTest01()
	{
		startNanos = 0;
		endNanos = 0;
		nanos = 0;
		hours = 0;
		minutes = 0;
		seconds = 0;
		fractions = 0;
	}
	
	public void startClock()
	{
		startNanos = System.nanoTime();
	}


	public void stopClock()  
	{
		endNanos = System.nanoTime();
		computeTime();
	}
	
	
	public void delay(long n)
	{
		n = n * 1000000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}
			
	
	private void computeTime()
	{
		nanos = endNanos - startNanos;
		hours = nanos / 3600000000000L;
		long leftOver = nanos % 3600000000000L;
		minutes = leftOver / 60000000000L;
		leftOver = leftOver % 60000000000L;
		seconds = leftOver / 1000000000L;
		fractions = leftOver % 1000000000L;
	}
	
	public String toString()
	{
		DecimalFormat twos = new DecimalFormat("00");
		DecimalFormat nines = new DecimalFormat("000000000");
		String temp = twos.format(hours) + ":";
		temp = temp + twos.format(minutes) + ":";
		temp = temp + twos.format(seconds) + ".";
		temp = temp + nines.format(fractions);
		return temp;
	}

}



			 