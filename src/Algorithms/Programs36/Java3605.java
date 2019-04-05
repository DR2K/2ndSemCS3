package Algorithms.Programs36;// Java3605.java
// This program measures the time necessary to remove the
// first element from an array.


import java.util.*;


public class Java3605
{
	public static void main(String args[])
	{
		System.out.println("\nJava3605.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array Size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		// displayList(list);
		
		//////////
		time.startClock();
		removeFirstElement(list);
		time.stopClock();
		//////////
		
		// displayList(list);
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


	public static void removeFirstElement(int[] list)
	{
		for (int k = 0; k < list.length-1; k++)
		{
			list[k] = list[k+1];
		}
		list[list.length-1] = 0;
	}
	
	
	public static void displayList(int[] list)
	{
		for (int k = 0; k < list.length; k++)
			System.out.print(list[k] + "    ");
		System.out.println("\n\n");
	}
	
	
}
	
