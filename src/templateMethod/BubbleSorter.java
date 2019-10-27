package templateMethod;

public abstract class BubbleSorter {

	protected int length;

	public BubbleSorter() {
		super();
	}

	protected abstract void swapElements(int index1, int index2);

	protected abstract int compareElements(int index1, int index2);

	/**
	 * Sort using bubblesort.
	 */
	protected void sortAscending() {
		if (length <= 1) {
			return;
		}
		
		for (int nextToLast = length - 2; nextToLast >= 0; nextToLast--) {
			for (int index = 0; index <= nextToLast; index++) {
				if (compareElements(index, index + 1) > 0)
					swapElements(index, index + 1);
			}
		}
	}
}