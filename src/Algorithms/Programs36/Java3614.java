package Algorithms.Programs36;// Java3614.java
// This program demonstrates the Merge Sort program.
// Note that it is a combination of an "iterative" <merge> and a recursive merge sort method.
// This <mergeSort> implementation suffers an execution penalty
// because a local, temporary, array is created and destroyed
// many times.


import java.util.*;


public class Java3614
{
	public static int temp[] = new int[2000000];
	
	public static void main(String args[]) 
	{
		System.out.println("\nJava3614.java\n");
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
		mergeSort(list, 0, list.length-1);
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
	
	
	public static void merge(int list[], int first, int mid, int last)
	{
		int n = list.length;
		int temp[] = new int[2 * n];
		int p = first;
		int q = mid+1;
		int k = first;
		while (p <= mid && q <= last)
		{
			if (list[p] <= list[q])
			{
				temp[k] = list[p];
				p++; 
			}
			else
			{
				temp[k] = list[q];
				q++;
			}
			k++;
   		}
		while (p <= mid)
		{
			temp[k] = list[p];
			p++;
			k++;
   		}
		while (q <= last)
		{
			temp[k] = list[q];
			q++;
			k++;
   		}
		for (int h = first; h <= last; h++)
			list[h] = temp[h];
	}


	
	
	public static void mergeSort(int list[], int first, int last)
	{
		if (first < last)
		{
			int mid = (first + last) / 2;
			mergeSort(list,first,mid);
			mergeSort(list,mid+1,last);
			merge(list,first,mid,last);
   		}
	}

  	

}





