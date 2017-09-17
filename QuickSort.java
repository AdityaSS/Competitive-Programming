import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 7, 2, 1, 6, 8, 5, 3, 4 };
		sort(0, a.length - 1, a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int start, int end, int[] a) {
		if (start < end) {
			int pivot = partition(start, end, a);
			sort(start, pivot - 1, a);
			sort(pivot + 1, end, a);
		}
	}

	private static int partition(int start, int end, int[] a) {

		int pivot = end;
		int j = 0;
		int temp = 0;
		for (int i = 0; i < end; i++) {
			if (a[i] < a[pivot]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}

		temp = a[j];
		a[j] = a[pivot];
		a[pivot] = temp;
		return j;

	}

}
