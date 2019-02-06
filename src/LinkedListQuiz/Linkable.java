//(c) A+ Computer Science
//www.apluscompsci.com

//Linkable interface
package LinkedListQuiz;

public interface Linkable
{
   Comparable getValue();
   Linkable getNext();
   void setNext(Linkable next);
   void setValue(Comparable value);
}
