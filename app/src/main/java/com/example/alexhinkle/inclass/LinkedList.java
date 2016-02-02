package com.example.alexhinkle.inclass;

import android.widget.LinearLayout;

/**
 * Created by AlexHinkle on 1/28/16.
 */
public class LinkedList {
    private Node head;
    private Node next;
    private LinearLayout layout;

    public LinkedList(LinearLayout layout) {
        this.head = null;
        this.layout = layout;
    }

    public void display() {
        if (this.head == null) {
            System.out.println("Empty List");
        } else {
            System.out.println("here");
            //display the list in a reasonable format
        }
    }

    public void addFront(String value) {
        if(head == null)
        {
            head = new Node(value);
        }
        else
        {
            Node temp = new Node(value);

            head = temp;


        }
        //this adds a new Node to the front of the list with payload == value

    }

    public Node removeFront()
    {
        if(head != null)
        {
            head = null;
        }
        //this removes and returns the Node that is currently sitting at the
        //front of the list.  The new front of the list, should be the old
        //second node or null in the event it was a 1-list
        return null;
    }
}