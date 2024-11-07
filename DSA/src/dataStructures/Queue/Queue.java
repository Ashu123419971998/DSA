package dataStructures.Queue;

public class Queue {
   Node first;
   Node last;
   int length;
    class Node
    {
        Node next;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }
   public Queue(int value)
    {
        Node node=new Node(value);
        first=node;
        last=node;
        length=1;
    }
    public void print()
    {
        Node temp=first;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void enqueue(int value)
    {
        Node node=new Node(value);
        if(length==0)
        {
            first=node;
            last=node;
        }
        else
        {
            last.next=node;
            last=node;
        }
        length++;
    }
    public Node dequeue()
    {
        if(length==0) return null;
        Node temp=first;
        first=first.next;
        if(length==1)
        {
            last=null;
        }
        temp.next=null;
        length--;
        return temp;
    }
}
