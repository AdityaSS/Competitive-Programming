/* Here an Array is given. We need to put all positive integers in odd index and negative number in even index. 
 * Time Complexity--->O(n)  Space--->O(1).
 */

public class OddEven {

	public static void main(String[] args) {
		int[] data = { -1, 2, -3, 4, 5, 6, -7, 8, -9 };
		int pivot = data[0];
		int i = 0;
		int temp;
		for (int j = 0; j < data.length ; j++) {
			if (data[j] < pivot) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
			}
		}
		data[data.length - 1] = data[i];
		data[i] = pivot;
		
		int pos = i+1, neg = 0;
		while (pos < data.length && neg < pos && data[neg] < 0){
			temp = data[neg];
			data[neg] = data[pos];
			data[pos] = temp;
			pos++;
			neg += 2;
			}
		
		for (int k = 0; k < data.length; k++) {
			System.out.print(data[k] + " ");
		}
	}

}
