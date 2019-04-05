package Algorithms.Programs36; // Java3609.java
// This program creates a linked list of integers.
// The time is measured to see how long it takes to add a new
// node at the end of the list.


import java.util.*;


public class Java3609
{
	public static void main(String args[]) 
	{
		System.out.println("\nJava3609.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter linked list Size  ===>>  ");
		int size = input.nextInt();
		ListNode09 front = createList(size);
		System.out.println();
		//displayList(front);
		
		//////////
		time.startClock();
		addToEnd(front);
		time.stopClock();
		//////////
		
		//displayList(front);
		System.out.println();
		System.out.println(time);
	}
	
	
	public static ListNode09 createList (int size)
	{
		ListNode09 front = new ListNode09(new Integer(100),null);
		ListNode09 p = front;
		ListNode09 temp = front;
		for (int k = 2; k <= size; k++)
		{
			p = new ListNode09(new Integer(k*100),null);
			temp.setNext(p);
			temp = p;
		}
		return front;
	}
	
	
	public static void displayList(ListNode09 p)
	{
		while (p != null)
		{
			System.out.print(p.getValue() + "\t");
			p = p.getNext();
		}
		System.out.println("\n\n");
	}
	
	
	public static ListNode09 addToEnd(ListNode09 p)
	{
		ListNode09 temp1 = new ListNode09(new Integer(99999),null);
		if (p == null)
			p = temp1;
		else
		{
			ListNode09 temp2 = p;
			while (temp2.getNext() != null)
			{ 
				temp2 = temp2.getNext();
			}
			temp2.setNext(temp1);			
		}
		return p;
	}

  

}


			 

class ListNode09
{
	public ListNode09 (Object initValue, ListNode09 initNext)
	{
		value = initValue;
		next = initNext;
	}
	
	public Object getValue ()						{ return value;			}
	public ListNode09 getNext ()						{ return next;			}
	public void setValue (Object theNewValue)		{ value = theNewValue;  }
	public void setNext (ListNode09 theNewNext)		{ next = theNewNext; 	}
	private Object value;
	private ListNode09 next;
}


