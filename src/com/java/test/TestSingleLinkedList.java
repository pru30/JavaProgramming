package com.java.test;
import com.java.SingleLinkedList.SingleLinkedList;
import java.lang.*;
/**
 * Created by pnishcha on 6/2/2016.
 */
class Test{
    public void test() {
        SingleLinkedList newList = new SingleLinkedList();
        newList.addFirst("1");
        newList.addLast("2");
        newList.addFirst("3");
        newList.insertAfter("3","4");
        newList.insertBefore("2","0");
        newList.insertMiddle("10");
        newList.display();
    }
}
public class TestSingleLinkedList {
   public  static  void  main(String args[])
   {
       Test tester = new Test();
       tester.test();
   }
}
