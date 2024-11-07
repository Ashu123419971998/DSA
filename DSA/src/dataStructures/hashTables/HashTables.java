package dataStructures.hashTables;

import java.util.ArrayList;

public class HashTables {
    private int size=7;
    private Node[] dataMap;
    class Node
    {
        String key;
        int value;
        Node next;
        Node(String key,int value)
        {
            this.key=key;
            this.value=value;
        }
    }
    public HashTables()
    {
        dataMap=new Node[size];
    }
    public void print()
    {
        for(int i=0;i<dataMap.length;i++)
        {
            Node temp=dataMap[i];
            while(temp!=null)
            {
                System.out.println(temp.key+" : "+temp.value);
                temp=temp.next;
            }
        }
    }
    private int hash(String key)
    {
        int hash=0;
        char[] array=key.toCharArray();
        for(int i=0;i<array.length;i++)
        {
            int ascii=array[i];
            hash=(hash+ascii*23)%size;
        }
        return hash;
    }
    public void set(String key, int value)
    {
        int index=hash(key);
        Node node=new Node(key,value);
        if(dataMap[index]==null)
        {
            dataMap[index]=node;
        }
        else
        {
            Node temp=dataMap[index];
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
        }
    }
    public int get(String key)
    {
        int index=hash(key);
        Node temp=dataMap[index];
        while(temp!=null)
        {
            if(temp.key.equals(key))
            {
                return temp.value;
            }
            temp=temp.next;
        }
        return 0;
    }
    public ArrayList<String> keys()
    {
        ArrayList<String> keys=new ArrayList<>();
        for(int i=0;i<dataMap.length;i++)
        {
            Node temp=dataMap[i];
            while(temp!=null)
            {
                keys.add(temp.key);
                temp=temp.next;
            }
        }
        return keys;
    }
}
