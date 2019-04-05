package Algorithms.Programs36;// Java3610.java
// This program creates a linked list of integers.
// The time is measured to see how long it takes to add a new
// node to the front of the list.


import java.util.*;


public class Java3610
{
	public static void main(String args[])
	{
		System.out.println("\nJava3610.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter linked list Size  ===>>  ");
		int size = input.nextInt();
		ListNode10 front = createList(size);
		System.out.println();
		//displayList(front);
		
		//////////
		time.startClock();
		front = addToFront(front);
		time.stopClock();
		//////////
		
		//displayList(front);
		System.out.println();
		System.out.println(time);
	}
	
	
	public static ListNode10 createList (int size)
	{
		ListNode10 front = new ListNode10(new Integer(100),null);
		ListNode10 p = front;
		ListNode10 temp = front;
		for (int k = 2; k <= size; k++)
		{
			p = new ListNode10(new Integer(k*100),null);
			temp.setNext(p);
			temp = p;
		}
		return front;
	}
	
	
	public static void displayList(ListNode10 p)
	{
		while (p != null)
		{
			System.out.print(p.getValue() + "\t");
			p = p.getNext();
		}
		System.out.println("\n\n");
	}
	
	
	public static ListNode10 addToFront(ListNode10 p)
	{
		ListNode10 temp = new ListNode10(new Integer(9999),null);
		if (p == null)
			p = temp;
		else
		{
			temp.setNext(p);			
			p = temp;
		}
		return p;
	}

  

}


			 

class ListNode10
{
	public ListNode10 (Object initValue, ListNode10 initNext)
	{
		value = initValue;
		next = initNext;
	}
	
	public Object getValue ()						{ return value;			}
	public ListNode10 getNext ()						{ return next;			}
	public void setValue (Object theNewValue)		{ value = theNewValue;  }
	public void setNext (ListNode10 theNewNext)		{ next = theNewNext; 	}
	private Object value;
	private ListNode10 next;
}


