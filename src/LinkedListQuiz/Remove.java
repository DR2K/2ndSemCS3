//(c) A+ Computer Science
//www.apluscompsci.com

//Linked List remove program
package LinkedListQuiz;

import static java.lang.System.*;

class TheList {
    private ListNode front;

    public void add(int value) {
        front = new ListNode(value, front);
    }

    /*
     * remove will remove the 1st occurrence of value
     * remove will not remove multiple occurrences of value
     */
    public void remove(int value) {
        ListNode temp = front;
        ListNode prev = front;
        boolean done = false;
        if (front != null) {
            if (front.getValue().equals(value))
                front = front.getNext();
            else
                while (temp != null && !done) {
                    temp = temp.getNext();
                    if (temp.getValue().equals(value)) {
                        prev.setNext(temp.getNext());
                        done = true;
                    }
                    prev = prev.getNext();

                }
        }
        //write the code for method remove
        //check for null
        //check for 1st node
        //process remaining nodes

    }

    public String toString() {
        String list = "";
        ListNode temp = front;
        while (temp != null) {
            list += temp.getValue() + " ";
            temp = temp.getNext();
        }
        return list;
    }
}

public class Remove {
    public static void main(String args[]) {
        TheList list = new TheList();
        list.add(11);
        list.add(4);
        list.add(13);
        list.add(3);
        System.out.println(list);    //outs 3 13 4 11
        list.remove(4);
        System.out.println(list);  //outs 3 13 11
        list.remove(13);
        System.out.println(list);  //outs 3 11
        list.remove(11);
        System.out.println(list);  //outs 3
        list.remove(3);
        System.out.println(list);  //outs nothing
        list.remove(5);
        System.out.println(list);  //outs nothing
    }
}