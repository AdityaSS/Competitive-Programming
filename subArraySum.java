/* Here an array is given {1,2,3}. We need to find the sub arrays sum. Sub arrays are {1},{2},{3},{1,2},{2,3},{1,2,3} 
 * Now here we can solve normally but it will take O(n^3) time. But we can solve it in O(n) time.
 * a[i] appears (n-i)*(i+1) times. 1 (i=0) appears  (3-0)* (1) = 3 times.
 * 2 (i=1) appears (n-i)*(i+1) times. (3-1)*(2) = 4 times.
 * 3 (i=2) appears (n-i)*(i+1) times. (3-2)*(3) = 3 times. 
 * So, we need to calculate a[i]*(n-i)*(i+1).
 */
public class subArraySum {

	public static void main(String[] args) {
       
		int[] a = {1,2,3,5,6};
		int n = a.length;
		int total = sum(a,n); 
		System.out.println("Sum of all contiguous subarray is: " + total);
	}

	private static int sum(int[] a, int n) {
		int result = 0;
		
		for(int i = 0;i<a.length;i++){
			result += a[i]*(n-i)*(i+1);
		}
		return result;
	}
}
