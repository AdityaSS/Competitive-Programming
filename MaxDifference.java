import java.util.Arrays;

/* Given an Array a[], we would like to find the maximum difference sum that can be obtained from it. {1,2,4,8} is array given
 * So, max sum can be obtained as |1-8|+|8-2|+|2-4|+|4-1| = 18 (Here we are considering circular array.
 * Time Complexity--->O(nlgn). Space Complexity--->O(n).
 */
public class MaxDifference {

	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 8 };
		Arrays.sort(a);
		int max = a.length - 1;
		int min = 0;
		int count = 0;
		int[] temp = new int[a.length];
		while(min <= max){                // this arranges array as(1,8,2,4)       1min,1max,2min,2max...so on.
           temp[count++] = a[min++];
           if(count < a.length)
           temp[count++] = a[max--];
		}
		int sum = 0;
		for(int i = 0;i<temp.length;i++){
			if(i<a.length-1){
			sum += Math.abs(temp[i] - temp[i+1]);
			}else{
				sum += Math.abs(temp[temp.length-1] - temp[0]);
			}
		}
		
		System.out.println("Sum is : " + sum);
	}

}
