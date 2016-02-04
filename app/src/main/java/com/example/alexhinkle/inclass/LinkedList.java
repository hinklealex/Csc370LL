package com.example.alexhinkle.inclass;


import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by AlexHinkle on 1/28/16.
 */
public class LinkedList {
    private Node head;
    private LinearLayout layout;
    private String payload;
    private Node nextNode;


    public LinkedList(String payload)
    {
        this.payload = payload;
        this.nextNode = head;

    }



    public LinkedList(LinearLayout layout)
    {
        this.head = null;
        this.layout = layout;
    }

    public void display()
    {
        //this.layout.removeAllViews();
        if(this.head == null)
        {
            View v = ListCore.inflater.inflate(R.layout.node, null);
            TextView tf = (TextView) v.findViewById(R.id.theValueTF);
            tf.setText("Empty List");
            this.layout.addView(v);
        }
        else
        {
            //display the list in a reasonable format
            this.head.display(this.layout);
        }
        View v = ListCore.inflater.inflate(R.layout.node, null);
        TextView tf = (TextView) v.findViewById(R.id.theValueTF);
        tf.setText("_____________");
        this.layout.addView(v);
    }

    public void addFront(String value)
    {
        //this adds a new Node to the front of the list with payload == value
        Node n = new Node(value);
        n.setNextNode(this.head);
        this.head = n;
    }

    public Node removeFront()
    {
        //this removes and returns the Node that is currently sitting at the
        //front of the list.  The new front of the list, should be the old
        //second node or null in the event it was a 1-list
        Node nodeToReturn = this.head;
        if(this.head != null)
        {
            this.head = this.head.getNextNode();
        }
        nodeToReturn.setNextNode(null);
        return nodeToReturn;
    }

    public void addEnd(String value)
    {
        Node n = new Node(value);

            Node temp = head;
        for(int i = 0; i < 1000; i++)
        {
            if (temp.getNextNode() == null) {


                temp.setNextNode(n);
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
    }



    public Node removeEnd()
    {

        Node nodeToReturn = this.head;
        for(int i = 0; i < 1000; i++)
            if (nodeToReturn.getNextNode() == null) {
                nodeToReturn.setPayload(null);
                break;
            } else {

                nodeToReturn = nodeToReturn.getNextNode();

            }
        return nodeToReturn;
    }
}