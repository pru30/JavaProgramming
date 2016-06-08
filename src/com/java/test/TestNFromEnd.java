package com.java.test;
import com.java.Node;
import com.java.SingleLinkedList.SingleLinkedList;
import com.java.careermonk.NFromEnd;

/**
 * Created by pnishcha on 6/7/2016.
 */
public class TestNFromEnd {

    public static void main(String args[]) {
        NFromEnd nFromEnd = new NFromEnd();
        for(int idx = 1;idx< 10;idx++)
        {
            nFromEnd.sll.addLast(String.valueOf(idx));
        }
        Node test = nFromEnd.nthFromEnd(2);
        System.out.println("nth from end: " + test.data);
    }


}
