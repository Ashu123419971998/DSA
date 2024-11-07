package dataStructures.doublyLinkedList;

public class DoublyLinkedList {
   Node head;
   Node tail;
   int length;
     class Node
    {
        Node next;
        Node prev;
        int value;
        Node(int value)
        {
            this.value=value;
        }
    }

    public DoublyLinkedList(int value)
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
           tail=node;
           head=node;
       }
       else {
           tail.next = node;
           node.prev = tail;
           tail = node;
       }
       length++;
    }
    public Node removeLast()
    {
        if(length==0) return null;
        Node temp=tail;
        if(length==1) {
            head = null;
            tail = null;
        }
        else {
            tail=tail.prev;
            tail.next=null;
        }
       temp.prev=null;
        length--;
        return temp;
    }
    public void prepend(int value)
    {
        Node node=new Node(value);
        if(length==0)
        {
            head=node;
            tail=node;
        }
        else {
            node.next=head;
            head.prev=node;
            head=node;
        }
        length++;
    }
    public Node removeFirst()
                {
        if(length==0) return null;
        Node temp=head;
        if(length==1)
        {
            head=null;
            tail=null;
        }
        else {
            head=head.next;
            head.prev=null;
        }
        temp.next=null;
        length--;
        return temp;
    }
    public Node get( int index)
    {
        if(index<0 || index >length-1) return null;
        Node temp = head;
        if(index<=length/2) {
            int n = 0;
            while (n != index) {
                temp = temp.next;
                n++;
            }
        }
        else {
            temp = tail;
            int n = length-1;
            while (n != index) {
                temp = temp.prev;
                n--;
            }
        }
        return temp;
    }
    public boolean set(int index, int value)
    {
       Node n= get(index);
       if(n!=null) {
           n.value = value;
           return true;
       }
       return false;
    }
    public boolean insert(int index, int value)
    {
        if(index<0 || index>length) return false;
        if(index==0)
        {
            prepend(value);
            return true;
        }
        else if(index==length)
        {
            append(value);
            return true;
        }
        else {
            Node node=new Node(value);
            Node n = get(index);
            if (n != null) {
                n.prev.next = node;
                node.prev = n.prev;
                node.next = n;
                n.prev = node;
                length++;
                return true;
            }
        }
        return false;
    }
    public Node remove(int index)
    {
        if(index<0 || index >length-1) return null;
        if(index==0)
        {
            return removeFirst();
        }
        else if(index==length-1)
        {
            return removeLast();
        }
        else {
            Node r=get(index);
            r.prev.next=r.next;
            r.next.prev=r.prev;
            r.prev=null;
            r.next=null;
            length--;
            return r;
        }
    }
}
