import java.util.Arrays;

/*Given an array A[] and a number x, check for pair in A[] with sum as x.
 * Time Complexity -----> O(n).
 * 2 Methods
 * 1. Using HashMap
 * 2. Without HashMap by Sorting.
 */

public class PairCheck {

	public static void main(String[] args) {
		int[] list = { 1, 20, 45, 6, 10, -8 };
		int sum = 16;
		System.out.println(Pairfind(list, sum));
	}

	/*
	 private static String Pairfind(int[] list,int n) { 
	 int sum = n; 
	 String result = null; 
	 HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(); 
	 for (int i = 0; i < list.length; i++) { 
	 int remainder = sum - list[i]; 
	 if (map.containsKey(remainder)) { 
	 result = ("Pair is " + remainder + " and " + list[i]); 
	 } else { 
	 map.put(list[i], list[i]); 
	 }
	 } 
	 return result;
	 }
	 */
	private static String Pairfind(int[] list, int n) {
		int sum = n;
		String result = null;
		Arrays.sort(list);
		int start = 0;
		int end = list.length - 1;
		while (start < end) {
			if (list[start] + list[end] < sum) {
				start++;
			} else if (list[start] + list[end] == sum) {
				result = ("Pair is " + list[start] + " and " + list[end]);
				return result;
			} else if (list[start] + list[end] > sum) {
				end--;
			}
		}
		return result;

	}

}
