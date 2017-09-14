/* This is Implementation of Kadanes's Algorithm. In this algorithm we need to find the contiguous subarray which gives us maximum
 * sum. Suppose a[] = {-2, -3, 4, -1, -2, 1, -5, -3}, here starting from index 2 and ending at index 6 gives us maximum sum of 7.
 * Time Complexity--->O(n),  Space Complexity--->O(1). Note that the sum should always be positive.
 */
public class KadaneAlgorithm {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -6, 2, 1, 5, -3 };
		int sum = 0;
		int temp = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < a.length; i++) {
			if(sum == 0) start = i;
			sum = sum + a[i];
			
			if (sum > temp) {
				temp = sum;
				end = i;
			} else if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(temp + "\n" + "Start index : " + start + "\nEnd index : " + end);
	}
}
