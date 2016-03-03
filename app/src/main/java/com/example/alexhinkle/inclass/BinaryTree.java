package com.example.alexhinkle.inclass;

/**
 * Created by AlexHinkle on 3/3/16.
 */

public class BinaryTree

{
    public Node binaryTreeRoot = null;
    public Node leftLeaf = null;
    public Node rightLeaf = null;



    public void setBinaryTreeRoot(int payload)
    {

        if(binaryTreeRoot == null) {
            System.out.println("Empty Tree");
            binaryTreeRoot.setPayloadBT(payload);
        }
        else if(binaryTreeRoot != null)
        {
           System.out.println("Binary tree root full");
        }
    }
    public void addBTLeaf(int payload)
    {

        if(binaryTreeRoot.getPayloadBT() < payload)
        {
            rightLeaf.setPayloadBT(payload);

        }
        else if(binaryTreeRoot.getPayloadBT() > payload)
        {
            leftLeaf.setPayloadBT(payload);
        }
    }


}
