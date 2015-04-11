package Sorting;
public class BubbleSort {
	/**
	 * bubbleSort				sorts an array of integers using bubble sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] bubbleSort(int[] array) {
		//TODO: S1 implements bubble sort
	  boolean swapped = true;
    int j = 0;
    int tmp;
    while (swapped) {
          swapped = false;
          j++;
          for (int i = 0; i < array.length - j; i++) {                                       
                if (array[i] > array[i + 1]) {                          
                      tmp = array[i];
                      array[i] = array[i + 1];
                      array[i + 1] = tmp;
                      swapped = true;
                }
          }                
    }

    return array;
	}
}
