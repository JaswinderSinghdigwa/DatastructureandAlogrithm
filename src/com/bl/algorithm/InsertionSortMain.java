package com.bl.algorithm;

public class InsertionSortMain {
    public static void main(String args[]) {
    
        int[] arr = { 12, 11, 13, 5, 6 };
 
        InsertionSort insertsort = new InsertionSort();
        insertsort.sort(arr);
        insertsort.printArray(arr);
    }
} 

