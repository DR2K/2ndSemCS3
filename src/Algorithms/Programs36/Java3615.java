package Algorithms.Programs36;// Java3615.java
// This program demonstrates an efficient <mergeSort> method by using
// a temporary array that is only constructed once.


import java.util.*;


public class Java3615
{
	public static void main(String args[])  
	{
		System.out.println("\nJava3615.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter array size  ===>>  ");
		int size = input.nextInt();
		IntList15 x = new IntList15(size);
		// x.displayList();
		
		//////////
		time.startClock();
		x.mergeSort(0,size-1);
		time.stopClock();
		//////////
		
		// x.displayList();
		System.out.println(time);
		System.out.println();
	}
	
	

}



class IntList15
{
	
	private int[] intArray;
	private int[] tempArray;
	
	
	public IntList15(int size)
	{
		intArray = new int[size];
		tempArray = new int[size];
		Random rand = new Random(1234);
		for (int k = 0; k < size; k++)
		{
			int rndInt = rand.nextInt(9000) + 1000;
			intArray[k] = rndInt;
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
