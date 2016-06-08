package com.java;

/**
 * Created by pnishcha on 6/3/2016.
 */

public class Node {
    public String data;
    public Node link;


    public Node()
    {
        this.data = String.valueOf("");
        this.link = null;
    }
    public Node(String data)
    {
        this.data = data;
        this.link = null;
    }
}