/*Here array is divided into 2 parts. Suppose you need to rotate the array by 3 elements, so 1 part is from 0 to 2(0,1,2).
 * Second part is from 3 to n-1. Then call rotate function recursively. Time Complexity O(n).
 */          

public class ArrayRotation {
	public static void main (String[] args) {    
		int[] a = {1,2,3,4,5,6,7};
		rotate(a,0,1);
		rotate(a,2,a.length-1);
		rotate(a,0,a.length-1);
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
	}

	private static void rotate(int[] a, int start,int end) {
		 int temp;
		 while(start<end){
		 temp = a[start];
		 a[start] = a[end];
		 a[end] = temp;
		 start++;
		 end--;
		 }
	}
}
