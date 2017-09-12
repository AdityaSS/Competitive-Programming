/* Given an array {1,-1,3,2,-7,-5,11,6}. Arrange numbers such as all positive numbers appear first but in same order and all negative
 * numbers come at the end in same order
 * Output---> {1,3,2,11,6,-1,-7,-5}
 * Time Complexity = 3.O(n)
 */
public class ArrangeNumbersinOrder {
	public static void main(String args) {
		int[] a = { 1, -1, 3, 2, -7, -5, 11, 6 };
		int[] temp = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
               temp[j] = a[i];
               j++;
			}
		}
		
		for(int i = 0;i<a.length;i++){
			if(a[i]<0){
				temp[j] = a[i];
				j++;
			}
		}
		
		for(int i = 0;i<a.length;i++){
			a[i] = temp[i];
			System.out.print(a[i] + " ");
		}
	}
}
