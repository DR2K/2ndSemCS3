package Algorithms.Programs36;// Java3620.java
// This program sorts a list of integers with the Merge Sort.
// This program compares sorting with three types of number
// lists:  random, sorted ascending and sorted descending


import java.util.*;


public class Java3620
{

	public static void main(String args[])  
	{
		System.out.println("\nJava3620.java\n");
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

		IntList20 x = new IntList20(choice,size);
//		x.displayList();
		
		//////////
		time.startClock();
		x.mergeSort(0,size-1);
		time.stopClock();
		//////////
		
//		x.displayList();
		System.out.println(time);
		System.out.println();
	}
	
	

}



class IntList20
{
	
	private int[] intArray;
	private int[] tempArray;
	
	
	public IntList20(int choice, int size)
	{
		intArray = new int[size];
		tempArray = new int[size];
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
	
	
	public void merge(int first, int mid, int last)
	{
		int p = first;
		int q = mid+1;
		int k = first;
		while (p <= mid && q <= last)
		{
			if (intArray[p] <= intArray[q])
			{
				tempArray[k] = intArray[p];
				p++; 
			}
			else
			{
				tempArray[k] = intArray[q];
				q++;
			}
			k++;
   		}
		while (p <= mid)
		{
			tempArray[k] = intArray[p];
			p++;
			k++;
   		}
		while (q <= last)
		{
			tempArray[k] = intArray[q];
			q++;
			k++;
   		}
		for (int h = first; h <= last; h++)
			intArray[h] = tempArray[h];
	}
	
	
	public void mergeSort(int first, int last)
	{
		if (first < last)
		{
			int mid = (first + last) / 2;
			mergeSort(first,mid);
			mergeSort(mid+1,last);
			merge(first,mid,last);
   		}
	}

   
  	
}


