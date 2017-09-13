</* Here an Array is given, we need to find triplets such that, (index of i < index of j < index of k) and a[i] < a[j] < a[k].
 * Time Complexity---> O(n).  Space Complexity--->O(1)
 */
public class SortedSequence {

	public static void main(String[] args) {
			int[] a = { 12, 11, 10, 5, 6, 2, 30 };
	    //	int a[] = {3,10,7,6,8};
			int var1 = 10000;
			int var2 = 10000;
			int n = 3;
			int min = a[0];
			int j = 0;
			int i;
			for (i = 0; i < a.length - n; i++) {
				if (a[i] < min) {
					min = a[i];
					j = i;
					var1 = 10000;
				} else if (a[i] > min && a[i] > a[j] && a[i] < var1) {
					var1 = a[i];
					j = i;
				}
			}

			for (int k = i; k < a.length; k++) {
				if (a[k] < var1 && (a.length-k>=n)) {
					var1 = a[k];
					j = k;
				} else if (a[k] > min && a[k] > var1) {
					var2 = a[k];
					break;
				}
			}

			if (var1 != 10000 && var2 != 10000) {
				System.out.print(min + " " + var1 + " " + var2);
			} else {
				System.out.println("No triplets.");
			}
		}

}
