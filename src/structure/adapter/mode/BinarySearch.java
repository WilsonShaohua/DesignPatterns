package structure.adapter.mode;

public class BinarySearch {
	public int binarySearch(int array[], int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = ((low + high) >> 1);
			int midValue = array[mid];
			if (midValue < key) {
				low = mid + 1;
			} else if (midValue > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
