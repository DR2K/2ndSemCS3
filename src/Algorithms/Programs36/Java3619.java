package Algorithms.Programs36;// Java3619.java
// This program sorts a list of integers with the "Smart" Bubble Sort.
// This program compares sorting with three types of number
// lists:  random, sorted ascending and sorted descending


import java.util.*;


public class Java3619
{

	public static void main(String args[]) 
	{
		System.out.println("\nJava3619.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.println("ENTER NUMBER LIST CONFIGURATION\n");
		System.out.println("  [1]  Random List");
		System.out.println("  [2]  Sorted in Ascending Order");
		System.out.println("  [3]  Sorted in Descending Order\n");
   		System.out.print("Enter Your Choice  ===>>  ");
   		int choice = input.nextInt();
 
		System.out.print("Enter array size   ===>>  ");
		int size = input.nextInt();

		IntList19 x = new IntList19(choice,size);
		// x.displayList();
		
		//////////
		time.startClock();
		x.smartBubbleSort();
		time.stopClock();
		//////////
		
		// x.displayList();
		System.out.println(time);
		System.out.println();
	}
	
	

}



class IntList19
{
	
	private int[] intArray;
	
	
	public IntList19(int choice, int size)
	{
		intArray = new int[size];
		switch (choice)
   		{
      		case 1:
	 			Random rand = new Random(1234);
				for (int k = 0; k < size; k++)
				{
					int rndInt = rand.nextInt(9000) + 1000;
					intArray[k] = rndInt;
				}
	 			break;
      		case 2:
	 			for (int k = 0; k < size; k++)
	 				intArray[k] = 1001 + k;
	 			break;
      		case 3:
	 			for (int k = 0; k < size; k++)
	 				intArray[k] = 1000 + size - k;
	 			break;
      		default:
      			System.out.println("Erroneous Input");
   		}
   	}
	
		
	public void displayList()
	{
		System.out.println();
		for (int k = 0; k < intArray.length; k++)
			System.out.print(intArray[k] + "    ");
		System.out.println("\n\n");
	}
	
	
	public void swap(int a, int b)
	{
		int temp = intArray[a];
		intArray[a] = intArray[b];
		intArray[b] = temp;
	}

	
	public void smartBubbleSort()
	{
   		int p = 0;
   		boolean sorted = false;
   		while (!sorted)
   		{
      		sorted = true;
      		p++;
      		for (int q = 0;  q < intArray.length-p; q++)
	 		if (intArray[q] > intArray[q+1])
	 		{
	 			swap(q,q+1);
	    		sorted = false;
	    	}
	 	}
   }
   
  	
}
