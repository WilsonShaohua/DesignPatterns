package structure.adapter.mode;

public class QuickSort {
	public int[] quickSort(int[] array) {
		sort(array, 0, array.length - 1);
		return array;
	}

	private void sort(int array[], int left, int right) {
		int q = 0;
		if (left < right) {
			q = partition(array, left, right);
			sort(array, left, q - 1);
			sort(array, q + 1, right);
		}
	}

	private int partition(int array[], int left, int right) {
		int x = array[right];
		int j = left - 1;
		for (int i = left; i < right; i++) {
			if (array[i] <= x) {
				j++;
				swap(array, i, j);
			}
		}
		swap(array, j + 1, right);
		return j + 1;
	}

	private void swap(int[] array, int i, int j) {
		int t = array[j];
		array[j] = array[i];
		array[i] = t;

	}

}
