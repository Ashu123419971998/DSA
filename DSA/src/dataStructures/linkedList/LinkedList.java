package dataStructures.linkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
         int value;
         Node next;
         Node (int value)
        {
            this.value=value;
        }
    }
   public LinkedList(int value)
    {
        Node node=new Node(value);
        head=node;
        tail=node;
        length=1;
    }
   public void print()
   {
       Node t=head;
       while(t!=null)
       {
          System.out.println(t.value);
          t=t.next;
       }
   }
   public void append(int value)
   {
       Node node=new Node(value);
       if(length==0)
       {
        head=node;
        tail=node;
       }
       else
       {
         tail.next=node;
         tail=node;
       }
       length++;
   }
   public Node removeLast()
   {
       Node t=head;
       if(length==0)
       {
           return null;
       }
       else if(length==1)
       {
           head=null;
           tail=null;
           length--;
           return t;
       }
       else {
           while (t.next != tail) {
               t = t.next;
           }
           Node temp = tail;
           t.next = null;
           tail = t;
           length--;
           return temp;
       }
   }
   public void pretend(int value)
   {
       Node node=new Node(value);
       if(length==0)
       {
           head=node;
           tail=node;
       }
       else {
           node.next = head;
           head = node;
       }
       length++;
   }
   public Node removeFirst()
   {
       if(length==0) return null;
       Node t= head;
       head=head.next;
       length--;
       if(length==0)
       {
           tail=null;
       }
       return t;
   }
   public Node get(int index)
   {
       int k=0;
       Node t=head;
       if(index<0 || index>length-1) return null;
       while(k!=index)
       {
           t=t.next;
           k++;
       }
       return t;
   }
   public boolean insert(int index,int value)
   {
       Node node=new Node(value);
       if(index< 0|| index>length) return false;
       if(index==0)
       {
           pretend(value);
       }
       else if(index==length)
       {
           append(value);
       }
       else {
           Node temp=get(index-1);
           node.next=temp.next;
           temp.next=node;
           length++;
       }

       return true;
   }
   public boolean set(int index,int value)
   {
       Node temp=get(index);
       if(temp!=null)
       {
           temp.value=value;
           return true;
       }
       return false;
   }
   public Node remove(int index)
   {
       if(index<0 || index >length-1)
           return null;
       else if(index==0)
           return removeFirst();
       else if(index==length-1)
          return removeLast();
       else
       {
           Node temp=get(index-1);
           Node r=temp.next;
           temp.next=r.next;
           r.next=null;
           length--;
           return r;
       }

   }
   public void reverse()
   {
       Node temp=head;
       head=tail;
       tail=temp;
       Node before=null;
       for(int i=0;i<length;i++)
       {
           Node after=temp.next;
           temp.next=before;
           before=temp;
           temp=after;
       }

   }

}
