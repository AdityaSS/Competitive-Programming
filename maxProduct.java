/* In this algorithm we need to find the contiguous subarray which gives us maximum product.
 * Suppose a[] = {1, -2, -3, 0, 7, -8, -2}, here 1 x -2 x -3 = 6  and 7 x -8 x -2 = 112. So, subarray {7,-8,-2} gives max product.
 * Time Complexity--->O(n),  Space Complexity--->O(1). Note that the sum should always be positive.
 */
public class maxProduct {

	public static void main(String[] args) {
	//	int[] a = { 1, -2, -3, 0, 7, -8, -2 };
	//	int[] a = {-1, -3, -10, 0, 60};
		int[] a = {-2, -3, 0, -2, -40};
		int sum = 1;
		int temp = 0;
		int temp1 = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				sum = sum * a[i];
				if (sum > temp) {
					temp = sum;
				}
			} else {
				sum = 1;
				if (temp1 < temp) {
					temp1 = temp;
				}
			}
		}

		if (temp1 > temp) {
			System.out.println(temp1);
		} else {
			System.out.println(temp);
		}
	}
}
