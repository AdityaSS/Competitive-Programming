/* Here an array is given, we need to find triplets which add upto given sum. If no such triplet is found it will return 
 * false.
 * Method-1---> is to use 3 loops time complexity = O(n^3).
 * Method-2---> Sort array first then use 2 pointers and keep moving them. Time Complexity--->O(n^2)
 */

import java.util.Arrays;

public class findTriplets {
	public static void main(String[] args) {
		int[] a = { 1, 4, 45, 6, 10, 8 };
		int sum = 56;
		Arrays.sort(a);
		System.out.println(find(a, sum));
	}

	private static boolean find(int[] a, int sum) {
		for (int i = 0; i < a.length-2; i++) {
			int l = i + 1;
			int r = a.length - 1;
			while (l < r) {
				if (a[i] + a[l] + a[r] == sum) {
					System.out.println("Triplet is " + a[i] + " " + a[l] + " " + a[r]);
					return true;
				} else if (a[i] + a[l] + a[r] > sum) {
					r--;
				} else if (a[i] + a[l] + a[r] < sum) {
					l++;
				}

			}
		}
		return false;
	}
}
