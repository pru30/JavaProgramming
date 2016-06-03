package com.java.StackImplementation;
import com.java.SingleLinkedList.SingleLinkedList;
import com.java.Node;
/**
 * Created by pnishcha on 6/3/2016.
 */

/**
 * Implement Stack using Link List
 * Stack is FIFO ADT
 * operation push/Pop/Seek
 * Top pointer
**/
public class StackUsingLinkList {
    SingleLinkedList sll = new SingleLinkedList();

    public Node pop()
    {
        if(sll.head == null)
        {
            return null;
        }
        else
        {
            Node nodeToBeReturned = sll.head;
            sll.head = nodeToBeReturned.link;
            return nodeToBeReturned;
        }
    }
}
