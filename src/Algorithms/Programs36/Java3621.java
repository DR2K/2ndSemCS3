package Algorithms.Programs36;// Java3621.java
// This program sorts a list of integers with the Quick Sort.
// This program compares sorting with three types of number
// lists:  random, sorted ascending and sorted descending


import java.util.*;


public class Java3621
{

	public static void main(String args[])  
	{
		System.out.println("\nJava3621.java\n");
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

		IntList21 x = new IntList21(choice,size);
		// x.displayList();
		
		//////////
		time.startClock();
		x.quickSort(0,size-1);
		time.stopClock();
		//////////
		
		// x.displayList();
		System.out.println(time);
		System.out.println();
	}
	
	

}



class IntList21
{
	
	private int[] intArray;
	
	public IntList21(int choice, int size)
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
	
	
	public void quickSort(int first, int last)
	{
		if (first < last)
		{
			int temp = 0;
   			int pivotValue = intArray[first];
   			int pivotIndex = first;

   			for (int k = first+1; k <= last; k++)
   			{
      			if (intArray[k] <= pivotValue)
      			{
	 				pivotIndex++;
	 				temp = intArray[k];
	 				intArray[k] = intArray[pivotIndex];
	 				intArray[pivotIndex] = temp;
      			}
   			}
   			temp = intArray[pivotIndex];
   			intArray[pivotIndex] = intArray[first];
   			intArray[first] = temp;
   			
   			quickSort(first,pivotIndex-1);
      		quickSort(pivotIndex+1,last);
      	}
	}
	
			
}
	
