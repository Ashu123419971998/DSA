package Sorts;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            int min=i;
            for(int j=i+1;j<array.length;j++)
            {
               if(array[min]>array[j])
               {
                   min=j;
               }
            }
            if(min!=i)
            {
                int temp=array[min];
                array[min]=array[i];
                array[i]=temp;
            }
        }
    }
    public static void main(String[] args)
    {
        int[]array={4,2,6,5,1,3};
        selectionSort(array);
        System.out.print(Arrays.toString(array));
    }
}
