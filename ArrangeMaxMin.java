/* Here a Sorted Array is given {1,2,3,4,5,6}. You need to arrange such that it becomes {6,1,5,2,4,3}.
 * Time Complexity = O(n), Space Complexity = O(n).
 */
public class ArrangeMaxMin {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int max = a.length - 1;
		int min = 0;
		int[] temp = new int[a.length];
		int count = 0;
		while (min <= max ) {
			temp[count++] = a[max--];
			if(count < 7){
				temp[count++] = a[min++];	
			}
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		
	}

}
