package dataStructures.Stacks;

import dataStructures.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(1);
        stack.print();
       System.out.println(stack.pop().value);
       System.out.println(stack.pop().value);
        System.out.println("hello");
    }
}
