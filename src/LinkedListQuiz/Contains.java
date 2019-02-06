//(c) A+ Computer Science
//www.apluscompsci.com 

//Linked List search program
package LinkedListQuiz;

import static java.lang.System.*;

class TheList1
{
   private ListNode front;
   
   public void add(int value)
   {
   	front = new ListNode(value, front);

   }

	/*
	 * contains will return true if any node contains obj as its value 
	 * contains will return false if no node contains obj as its value
	 */
   public boolean contains(Object obj)
   {
   	ListNode temp = front;
   	while(temp!=null){
		if (obj.equals(temp.getValue()))
			return true;
		temp = temp.getNext();
	}
   	return false;	
   }
}

public class Contains
{
	public static void main( String args[] )
	{
		TheList1 list = new TheList1();
		list.add(11);
		list.add(4);
		list.add(13);
		list.add(3);
		System.out.println(list.contains(13));		//outs true
		System.out.println(list.contains(31));		//outs false
		System.out.println(list.contains(11));		//outs true
		System.out.println(list.contains(3));		//outs true		
		System.out.println(list.contains(2));		//outs false										
	}
}