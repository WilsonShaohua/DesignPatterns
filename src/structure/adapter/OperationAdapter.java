package structure.adapter;

public class OperationAdapter implements ScoreOperation {
	private QuickSort sortObject;
	private BinarySearch searchObject;
	
	public OperationAdapter() {
		sortObject = new QuickSort();
		searchObject = new BinarySearch();
	}
	
	@Override
	public int[] sort(int[] array) {
		return sortObject.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		return searchObject.binarySearch(array, key);
	}

}
