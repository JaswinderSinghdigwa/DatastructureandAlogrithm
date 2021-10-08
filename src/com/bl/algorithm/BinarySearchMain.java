package com.bl.algorithm;

/**
 * Purpose  - Binary Search the Word from Word List.
 * @author  - JaswinderSingh
 * @version - 16.0
 * @since   - 30-09-2021
 */
public class BinarySearchMain {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "jassi", "monty" };
        String name = "jassi";
        BinarySearch<String> binarysearch = new BinarySearch<String>();
        int result = binarysearch.binarySearch(arr, name);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}