package dataStructures.binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
     Node root;

    class Node
    {
        int value;
        Node right;
        Node left;
        public Node(int value)
        {
            this.value=value;
        }
    }

    public Node insert(Node currNode,int value)
    {
        if(root==null)
        {
            Node node =new Node(value);
            root=node;
            return root;
        }
        if(currNode==null) return new Node(value);
        if(value<currNode.value) {
            currNode.left=insert(currNode.left,value);
        }
        else if(value>currNode.value){
            currNode.right=insert(currNode.right,value);
        }
        return currNode ;
    }
    public boolean contains(Node currNode,int value)
    {
        if(currNode==null)
            return false;
        if(currNode.value==value)
            return true;
        if(value<currNode.value)
            return contains(currNode.left,value);
        else
            return contains(currNode.right,value);
    }
    public void print(Node temp)
    {
        if(temp!=null)
        System.out.println(temp.value);
        else
            return;
        print(temp.left);
        print(temp.right);
    }
    public Node delete(Node currNode, int value)
    {
        if(currNode==null)
        {
         return null;
        }
        if(value<currNode.value)
            currNode.left=delete(currNode.left,value);
        else if(value>currNode.value)
            currNode.right= delete(currNode.right,value);
        else {
             if (currNode.left == null && currNode.right == null) {
                 return null;
            }
            else if (currNode.left != null && currNode.right == null) {
                 currNode= currNode.left;
                }
            else if (currNode.left == null && currNode.right != null) {
                 currNode= currNode.right;
                }
            else {
                    int n=minvalue(currNode.right);
                    currNode.value = n;
                 currNode.right=delete(currNode.right,n);
                }
        }
        return currNode;
    }
    public int minvalue(Node currNode)
    {
        if(currNode.left==null)
        {
            return currNode.value;
        }
        return minvalue(currNode.left);
    }
    public ArrayList<Integer> breadthFirstSearch()
    {
        Node temp=root;
        Queue<Node> queue=new LinkedList<>();
        ArrayList<Integer> result=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            temp=queue.remove();
            result.add(temp.value);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return result;
    }
    public void dpthFirstSearch_Preorder(Node CurrNode)
    {
        if(CurrNode==null)
            return;

        System.out.println(CurrNode.value);
        dpthFirstSearch_Preorder(CurrNode.left);
        dpthFirstSearch_Preorder(CurrNode.right);
    }
    public void dpthFirstSearch_Postorder(Node CurrNode)
    {
        if(CurrNode==null)
            return;
        dpthFirstSearch_Postorder(CurrNode.left);
        dpthFirstSearch_Postorder(CurrNode.right);
        System.out.println(CurrNode.value);
    }
    public void dpthFirstSearch_Inorder(Node CurrNode)
    {
        if(CurrNode==null)
            return;
        dpthFirstSearch_Inorder(CurrNode.left);
        System.out.println(CurrNode.value);
        dpthFirstSearch_Inorder(CurrNode.right);
    }
}
