package com.bl.algorithm;

/******************************************************************************
 *  Purpose: Program is for bubble sort of integer.
 *  		 
 *
 *  @author  JaswinderSingh
 *  @version 1.0
 *  @since   01-09-2021
 *
 ******************************************************************************/

public class BubbleSortMain {

	public static void main(String[] args) {
		
		String[] stringarray = { "abc","def","ghi","jkl" };
		System.out.println("Before sorting");
		BubbleSort<String> bubblesort = new BubbleSort<String>();
		bubblesort.printArray(stringarray);
		System.out.println("before sorting");
		bubblesort.bubbleSort(stringarray);
		System.out.println("After sorting");
		bubblesort.printArray(stringarray);
	}

}