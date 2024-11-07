package dataStructures.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;

    public Heap()
    {
        heap=new ArrayList<>();
    }

    public List<Integer> get()
    {
        return new ArrayList<>(heap);
    }
    public int leftChild(int index)
    {
        return 2*index+1;
    }

    public int rightChild(int index)
    {
        return 2*index+2;
    }

    public int parent(int index)
    {
        return (index-1)/2;
    }

    public void swap(int index1,int index2)
    {
        int temp=heap.get(index1);
        heap.set(index1,heap.get(index2));
        heap.set(index2,temp);
    }

    public void insert(int value)
    {
        heap.add(value);
        if(heap.size()==1)
        {
            return;
        }
        int t=heap.size()-1;
        while(value>heap.get(parent(t)) && t>0)
        {
              swap(t,parent(t));
              t=parent(t);
        }
    }

    public Integer remove()
    {
        if(heap.size()==0)
        {
            return null;
        }
        else if(heap.size()==1)
        {
            return heap.remove(0);
        }
        int result=heap.get(0);
        heap.set(0,heap.remove(heap.size()-1));
        sinkDown(0);
        return result;
    }
    public void sinkDown(int t)
    {
        while(t<heap.size()&&leftChild(t)<heap.size()&&rightChild(t)<heap.size()
                &&(heap.get(t)<heap.get(leftChild(t)) || heap.get(t)<heap.get(rightChild(t))))
        {
            if(heap.get(leftChild(t))<heap.get(rightChild(t)))
            {
                swap(t,rightChild(t));
                t=rightChild(t);
            }
            else {
                swap(t,leftChild(t));
                t=leftChild(t);
            }
        }
        return;
    }
}
