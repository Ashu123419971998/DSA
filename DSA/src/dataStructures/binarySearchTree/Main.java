package dataStructures.binarySearchTree;

import java.util.ArrayList;

public class Main {
    public static void main(String args[])
    {
        BinarySearchTree tree=new BinarySearchTree();
        tree.insert(tree.root,47);
        tree.insert(tree.root,21);
        tree.insert(tree.root,76);
        tree.insert(tree.root,18);
        tree.insert(tree.root,27);
        tree.insert(tree.root,52);
        tree.insert(tree.root,82);
        tree.dpthFirstSearch_Inorder(tree.root);
    }
}
