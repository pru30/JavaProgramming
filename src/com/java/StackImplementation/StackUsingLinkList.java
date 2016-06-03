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
    public SingleLinkedList sll;
    public StackUsingLinkList(){
        sll = new SingleLinkedList();
    }

    public Node pop()
    {
        if(sll.head == null)
        {
            return new Node("Stack is Empty!");
        }
        else
        {
            Node nodeToBeReturned = sll.deleteFirst();
            return nodeToBeReturned;
        }
    }

    public void push(String data)
    {
        sll.addFirst(data);
    }

    public int seek(String data)
    {
        return sll.search(data);
    }
}
