package TestOrdenacion;

import java.util.*;
class QuickSort {
    //selects last element as pivot, pi using which array is partitioned.
    int partition(long[] intArray, int low, int high) {
        int pi = (int) intArray[high];
        int i = (low-1); // smaller element index
        for (int j=low; j<high; j++) {
            // check if current element is less than or equal to pi
            if (intArray[j] <= pi) {
                i++;
                // swap intArray[i] and intArray[j]
                long temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // swap intArray[i+1] and intArray[high] (or pi)
        long temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;

        return i+1;
    }


    //routine to sort the array partitions recursively
    void quick_sort(long[] intArray, int low, int high) {
        if (low < high) {
            //partition the array around pi=>partitioning index and return pi
            int pi = partition(intArray, low, high);

            // sort each partition recursively
            quick_sort(intArray, low,  (pi-1));
            quick_sort(intArray, (pi+1), high);
        }
    }
}