package dataStructures.Stacks;

public class Stack {

    Node top;
    int height;
    class Node
    {
      Node next;
      int value;
      Node(int value)
      {
          this.value=value;
      }
    }
   public Stack(int value)
   {
       Node node=new Node(value);
       top=node;
       height=1;
   }
   public void print()
   {
       Node temp=top;
       while(temp!=null)
       {
           System.out.println(temp.value);
           temp=temp.next;
       }
   }
   public void push(int value)
   {
       Node node=new Node(value);
       node.next=top;
       top=node;
       height++;
   }
   public Node pop()
   {
       if(height==0) return null;
       Node temp=top;
       top=top.next;
       temp.next=null;
       height--;
       return temp;
   }
}
