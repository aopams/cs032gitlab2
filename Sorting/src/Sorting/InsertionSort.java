package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		//TODO: S2 implements insertion sort
	  int n = array.length;
    for (int j = 1; j < n; j++) {
        int key = array[j];
        int i = j-1;
        while ( (i > -1) && ( array [i] > key ) ) {
            array [i+1] = array [i];
            i--;
        }
        array[i+1] = key;
    }
    //hello?
		return array;
	}
}
