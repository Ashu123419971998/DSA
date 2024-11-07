package Sorts;

import java.util.Arrays;

public class QuickSort {
    public static int pivot(int[] array, int start,int end) {
            int pivot = start;
            int swap = start;
            for (int i = pivot+1; i <= end; i++) {
                if (array[i] < array[pivot]) {
                    swap++;
                    int temp = array[swap];
                    array[swap] = array[i];
                    array[i] = temp;
                }
            }
            if(swap!=pivot) {
                int temp = array[swap];
                array[swap] = array[pivot];
                array[pivot] = temp;
            }
        return swap;
}
public static void quickSort(int[] array, int start,int end)
{
    if(start<end) {
        int pivot = pivot(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
}
public static void main(String args[])
{
    int[] array={4,6,1,7,3,2,5};
    quickSort(array,0,array.length-1);
    System.out.println(Arrays.toString(array));
}

}
