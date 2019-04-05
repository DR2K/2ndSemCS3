package Algorithms.Programs36;// Java3606.java
// This program measures the time necessary to remove the
// last element from an array.


import java.util.*;


public class Java3606
{
	public static void main(String args[]) 
	{
		System.out.println("\nJava3606.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array Size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		//displayList(list);
		
		///////////
		time.startClock();
		removeLastElement(list);
		time.stopClock();
		//////////
		
		//displayList(list);
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


	public static void removeLastElement(int[] list)
	{
		list[list.length-1] = 0;
	}
	
	
	public static void displayList(int[] list)
	{
		for (int k = 0; k < list.length; k++)
			System.out.print(list[k] + "    ");
		System.out.println("\n\n");
	}
	
	
}
	



