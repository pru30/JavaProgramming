package com.java.test;
import com.java.Node;
import  com.java.SingleLinkedList.SingleLinkedList;
import com.java.StackImplementation.StackUsingLinkList;
/**
 * Created by pnishcha on 6/4/2016.
 */
public class TestStackImplementation {


    public static void main(String args[]){
        StackUsingLinkList stack = new StackUsingLinkList();
        stack.push("Praveen");
        stack.push("Shivani");
        stack.push("Prashi");
        stack.push("nana");
        stack.sll.display();
        Node whatPopped = stack.pop();
        whatPopped = stack.pop();
        System.out.println("what popped:"+ " " + whatPopped.data);
        int position = stack.seek("Shivani");
        System.out.println("where is Shivani:"+ " " + position);

    }
}
