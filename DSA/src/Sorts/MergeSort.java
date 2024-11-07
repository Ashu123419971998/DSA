package Sorts;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] arr1, int[] arr2)
    {
       int i=0;
       int j=0;
       int k=0;
       int length=arr1.length+arr2.length;
       int[] result=new int[length];
       while(i<arr1.length&&j<arr2.length)
       {
           if(arr1[i]<arr2[j])
           {
               result[k]=arr1[i];
               i++;
           }
           else {
               result[k]=arr2[j];
               j++;
           }
           k++;
       }
       while(i<arr1.length)
       {
           result[k]=arr1[i];
           i++;
           k++;
       }
        while(j<arr2.length)
        {
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }
    public static int[] mergeSort(int[] array)
    {
        if(array.length==1)
        {
            return array;
        }
        int mid=(array.length)/2;
        int[] left=mergeSort(Arrays.copyOfRange(array,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(array,mid,array.length));
        return merge(left,right);
    }
    public static void main(String[] args)
    {
        int[] array={3,1,4,2};

        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
