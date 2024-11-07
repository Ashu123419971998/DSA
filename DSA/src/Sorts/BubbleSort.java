package Sorts;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            boolean swap=false;
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        int[]array={4,2,6,5,1,3};
        bubbleSort(array);
        System.out.print(Arrays.toString(array));
    }
}
