import java.util.Arrays;

/* In this code an array is given {1, 23, 12, 9, 30, 2, 50}. We need to find the k-largest element.
 * We will implement this using MaxHeap and then we will pop k times.
 * It can also be done using Sort. 
 * Time Complexity--->O(n) making heap and O(klogn) pop function.
 */
public class K_Largest {

	Integer[] Maxheap;
	int current = -1;

	public K_Largest(int n) {
		Maxheap = new Integer[n];

	}

	public void insert(int n) {
		Maxheap[++current] = n;
		heapify(current);

	}

	private void heapify(int k) {
		int current = k;
		int parent = (current - 1) / 2;
		int temp = 0;
		while (parent >= 0 && Maxheap[parent] < Maxheap[current]) {
			temp = Maxheap[current];
			Maxheap[current] = Maxheap[parent];
			Maxheap[parent] = temp;
			current = parent;
			parent = (current - 1) / 2;
		}

	}

	public void pop() {

		System.out.println(Maxheap[0]); // Copying last element to root and then
										// heapify.
		Maxheap[0] = Maxheap[current];
		current--;
		Maxheap[current + 1] = null; //
		int temp;
		int i = 0;
		int leftchild = (2 * i) + 1;
		int rightchild = (2 * i) + 2;

		while (i < current) {

			if (Maxheap[rightchild] != null) {
				if (Maxheap[leftchild] < Maxheap[i] && Maxheap[rightchild] < Maxheap[i]) {
					break;
				} else {
					if (Maxheap[rightchild] >= Maxheap[leftchild]) {
						temp = Maxheap[i];
						Maxheap[i] = Maxheap[rightchild];
						Maxheap[rightchild] = temp;
						i = rightchild;
						if ((2 * i) + 2 <= current) {
							leftchild = (2 * i) + 1;
							rightchild = (2 * i) + 2;
						}
					} else {
						temp = Maxheap[i];
						Maxheap[i] = Maxheap[leftchild];
						Maxheap[leftchild] = temp;
						i = leftchild;
						leftchild = (2 * i) + 1;
						rightchild = (2 * i) + 2;
					}
				}
			} else {
				if (Maxheap[i] < Maxheap[leftchild]) {
					temp = Maxheap[leftchild];
					Maxheap[leftchild] = Maxheap[i];
					Maxheap[i] = temp;
					i = leftchild;
					leftchild = (2 * i) + 1;
					rightchild = (2 * i) + 2;
				} else
					break;
			}

		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 23, 12, 9, 30, 2, 50 };
		int n = a.length;
		K_Largest max = new K_Largest(n);
		for (int i = 0; i < a.length; i++) {
			max.insert(a[i]);
		}

		max.pop();
		max.pop();
		max.pop();

	}

}
