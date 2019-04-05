package Algorithms.Programs36;// Java3611.java
// This program helps to illustrate the behavior of the Bubble Sort.
// Method <sortOneOnly> is the inner comparison loop of the Bubble
// Sort, which only places one array element in the correct location.


import java.util.*;


public class Java3611
{
	public static void main(String args[]) 
	{
		System.out.println("\nJava3611.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array size  ===>>  ");
		int size = input.nextInt();
		int[] list = new int[size];
		createList(list,size);
		System.out.println();
		// displayList(list);
		
		//////////
		time.startClock();
		sortOneOnly(time,list);
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


	public static void displayList(int[] list)
	{
		for (int k = 0; k < list.length; k++)
			System.out.print(list[k] + "    ");
		System.out.println("\n\n");
	}
	

  	public static void sortOneOnly(TimeTest time, int[] list)
	{
   		for ( int q = 0;  q < list.length-1; q++)
   		{
   			time.delay(1);
			if (list[q] > list[q+1])
			{
				int temp = list[q];
				list[q] = list[q+1];
				list[q+1] = temp;
			}
		}
	}
	

}


