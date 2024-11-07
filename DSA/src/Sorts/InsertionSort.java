package Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array)
    {
        for(int i=1;i<array.length;i++)
        {
           if(array[i]<array[i-1])
           {
               int k=i;
               while(k>0 && array[k]<array[k-1])
               {
                       int temp=array[k];

                       array[k]=array[k-1];
                       array[k-1]=temp;
                       k--;
               }
           }
        }
    }
    public static void main(String[] args)
    {
        int[]array={4,2,6,5,1,3};
        insertionSort(array);
        System.out.print(Arrays.toString(array));
    }
}
