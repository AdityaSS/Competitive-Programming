/*Count number of occurrences (or frequency) in a sorted array.
 * Method-1 : Use Hashmap and scan the array once simultaneously increase count in HashMap.  Time Complexity--->O(n)
 * Method-2 : Use Binary Search and get the 1'st index and last index of the element and then subtract
 * Time Complexity--->O(logn).
 */
public class CountingSequence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8,8 };
		int num = 2;
		int i = first(arr, 0, arr.length - 1, num);
		int j = last(arr, 0, arr.length - 1, num);
		System.out.println("Count of " + num + " is " + (j - i + 1));
	}

	private static int last(int[] arr, int start, int end, int num) {
		while (start <= end) {
			int middle = (start + end) / 2;
			if ((middle + 1 > arr.length - 1 && num == arr[middle]) || (num == arr[middle] && arr[middle + 1] > num))
				return middle;
			else if (arr[middle] < num) {
				return last(arr, middle + 1, end, num);
			} else {
				return last(arr, 0, middle - 1, num);
			}
		}
		return -1;
	}

	private static int first(int[] arr, int start, int end, int num) {
		while (start <= end) {
			int middle = (start + end) / 2;
			if (middle == 0 || num == arr[middle] && arr[middle - 1] < num)
				return middle;
			else if (arr[middle] < num) {
				return first(arr, middle + 1, end, num);
			} else {
				return first(arr, 0, middle - 1, num);
			}
		}
		return -1;
	}

}
