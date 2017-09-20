/* Arrange given numbers to form the biggest number. Given array {3, 6, 2, 1, 15, 4}, find the biggest number possible.
 * Here we are first arranging the array in the Lexological Sort by using comparable. Then we arrange from decreasing to 
 * increasing order.  
 */

import java.util.Arrays;

public class LexologicalSort {

	public static void main(String[] args) {

		int[] a = { 3, 6, 2, 1, 15, 4 };
		String[] list = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			list[i] = Integer.toString(a[i]);
		}
		Comparable_QuickSort.QuickSort(0, list.length-1, list);
		System.out.println(Arrays.toString(list));
		String result = "";
		for(int i = list.length-1;i>=0;i--){
			result += list[i];
		}
         System.out.println(result);
	}
	
	public static class Comparable_QuickSort {

		public static void QuickSort(int start, int end, @SuppressWarnings("rawtypes") Comparable[] list) {
			if (start < end) {
				int pivot = partition(start, end, list);
				QuickSort(start, pivot - 1, list);
				QuickSort(pivot + 1, end, list);
			}
			
		}

		@SuppressWarnings("unchecked")
		private static int partition(int start, int end, @SuppressWarnings("rawtypes") Comparable[] list) {
			int pivot = end;
			int j = start;
			Comparable<String> temp = "";
			for (int i = start; i < end; i++) {
				if (list[i].compareTo(list[pivot])<0) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
					j++;
				}
			}

			temp = list[j];
			list[j] = list[pivot];
			list[pivot] = temp;
			return j;
			
		}
	}


}
