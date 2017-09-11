/* Here after a Sorted Array was Rotated, then we do Binary Search on Array to find element.
 * The difference here is, we select a pivot
 * Then we do binary search in respected sub-array.
 * So array was{1,2,3,4,5,6,7}-----> after rotation it became {3,4,5,6,7,1,2} and in this array we look for 1.  
 */
public class BinarySearchPivot_RotatedArray {

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 7, 1, 2 };
		int find = 1;
		int low = 0;
		int high = a.length - 1;
		int pivot = findpivot(a, low, high);
		if (a[pivot] > a[0] && a[0] < find) {
			System.out.println("Index of " + find + " is : " + BinarySearch(a, 0, pivot - 1, find));
		} else {
			System.out.println("Index of " + find + " is : " + BinarySearch(a, pivot + 1, a.length - 1, find));
		}
	}

	private static int BinarySearch(int[] a, int i, int j, int k) {
		int low = i;
		int high = j;
		int middle = (low + high) / 2;
		if (a[middle] == k) {
			return middle;
		} else if (a[middle] > k) {
		return	BinarySearch(a, low, middle - 1, k);
		} else {
		return	BinarySearch(a, middle + 1, high, k);
		}
          
	}

	private static int findpivot(int[] a, int low, int high) {
		int mid = low + (high - low) / 2;
		if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
			return mid;
		} else if (a[mid] < a[mid + 1] && a[mid] > a[mid - 1]) {
			return findpivot(a, mid + 1, a.length - 1);
		} else  if(a[mid] < a[mid - 1] && a[mid]<a[mid+1]) {
			return mid-1;
		} else {
			return findpivot(a,0,mid-1);
		}
		
	}
}
