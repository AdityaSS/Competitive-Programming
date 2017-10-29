/* Here an unsorted array and a sum is given, we need to find the sub array such that the sum of the sub array is equal  
 * to given sum. If no such sub array exists we will return not found else we will retun starting index and ending index.
 * Time Complexity------> O(2N)=O(n).
 */
public class findsubarray {

	public static void main(String[] args) {
		int[] a = {15, 2, 4, 8, 9, 5, 10, 1};
        String s = sum(a,1);
        System.out.println(s);
	}

	private static String sum(int[] a,int n) {
		
		int start = 0;
		int sum= 0 ;
		int end = -1;
		while(start <a.length || end<a.length){
			
			if(sum < n){
				end++;
				sum += a[end];
				
			}
			if(sum > n){
				sum = sum-a[start];
				start++;
			}
			if(sum==n){
				return "Start:" + start+"  end : "+end;
			}
		}
		return "Not Found";
		
	}

}
