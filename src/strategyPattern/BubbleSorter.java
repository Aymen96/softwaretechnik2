package strategyPattern;

public abstract class BubbleSorter {

	private SortStrategy sortStrategy;

	public BubbleSorter(SortStrategy sortStrategy) {
		this.sortStrategy = sortStrategy;
	}

	/**
	 * Sort using bubblesort in ascending order.
	 */
	protected void sortAscending() {
		if (sortStrategy.getLength() <= 1) {
			return;
		}
		
		for (int nextToLast = sortStrategy.getLength() - 2; nextToLast >= 0; nextToLast--) {
			for (int index = 0; index <= nextToLast; index++) {
				if (sortStrategy.compareElements(index, index + 1) > 0)
					sortStrategy.swapElements(index, index + 1);
			}
		}
	}
}