package Algorithms.Programs36;// Java3604.java
// This program measures the time necessary to identify the
// largest integer in an array of random integers.



import java.util.*;



public class Java3604
{
	
	public static void main(String args[])  
	{
		System.out.println("\nJava3604.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array Size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		
		//////////
		time.startClock();
		findLargest(list);
		time.stopClock();
		//////////
		
		System.out.println();
		System.out.println(time);
	}
	
	
	public static void createList (int[] list, int size)
	{
		Random rand = new Random(1234);
		for (int k = 0; k < size; k++)
		{
			int rndInt = rand.nextInt(9000) + 1000;
			list[k] = rndInt;
		}
	}
	
	
	public static void findLargest(int[] list)
	{
		int largestInt = 0;
		for (int k = 0; k < list.length; k++)
		{
			if (list[k] > largestInt)
				largestInt = list[k];
		}
		System.out.println("Largest integer:  " + largestInt);
	}
			

}

