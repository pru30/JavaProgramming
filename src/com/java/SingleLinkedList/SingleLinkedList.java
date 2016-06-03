package com.java.SingleLinkedList;
import java.lang.String;
import com.java.Node;
/**
 * Created by pnishcha on 5/21/2016.
 */


public class SingleLinkedList{
    public Node head;

    public SingleLinkedList()
    {
        this.head = null;
    }

    public void addFirst(String data)
    {
        Node node = new Node(data);
        node.link = this.head;
        this.head = node;
    }

    public void addLast(String data)
    {
        Node curr = this.head;
        while (curr.link != null)
        {
            curr = curr.link;
        }

        //add new node
        Node node = new Node(data);
        curr.link = node;
    }

    public Node deleteFirst()
    {
        Node toBeDeleted = this.head;
        this.head = toBeDeleted.link;
        return  toBeDeleted;
    }

    public Node deleteLast()
    {
        Node curr = this.head;
        Node prev = null;
        while (curr.link != null)
        {
            prev = curr;
            curr = curr.link;
        }
        if(prev != null)
        {
            prev.link = null;
        }
        else
        {
            this.head = null;
        }
        return curr;
    }

    public void insertAfter(String match, String data)
    {
        Node curr = this.head;
        while (curr != null && !curr.data.equals(match))
        {
            curr = curr.link;
        }
        if(curr == null)
        {
            return;
        }
        else if (curr.link == null) {
            Node newNode = new Node(data);
            curr.link = newNode;
        }
        else
        {
            Node newNode = new Node(data);
            newNode.link = curr.link;
            curr.link = newNode;
        }
    }

    public void insertBefore(String match,String data)
    {
        Node curr = this.head;
        Node prev = curr;
        while (curr != null && !curr.data.equals(match))
        {
            prev = curr;
            curr = curr.link;
        }
        if(curr == null)
        {
            return;
        }
        else if (curr == head) {
            Node newNode = new Node(data);
            curr.link = head;
            head = newNode;
        }
        else
        {
            Node newNode = new Node(data);
            newNode.link = curr;
            prev.link = newNode;
        }
    }

    public void insertMiddle(String data)
    {
        Node fast = this.head, slow = this.head;
        if(this.head == null)
        {
            Node newNode = new Node(data);
            this.head = newNode;
            return;
        }
        while (fast.link != null)
        {
            fast = fast.link.link;
            slow = slow.link;
        }

        Node newNode = new Node(data);
        newNode.link = slow.link;
        slow.link = newNode;
    }

    public void display()
    {
        Node curr = this.head;
        int index = 0;
        System.out.println("Linked List:");

        while (curr != null)
        {
            index++;
            System.out.print(index + " : " + curr.data);
            System.out.print("\t");
            curr = curr.link;
        }

    }
}
