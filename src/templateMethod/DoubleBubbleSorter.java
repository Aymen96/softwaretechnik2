package templateMethod;

public class DoubleBubbleSorter extends BubbleSorter {
	
	private double[] array;
	/**
	 * Sort array in ascending order.
	 * @param array
	 */
	public void sortAscending(double[] array) {
		this.array = array;
		this.length = array.length;
		
		sortAscending();
	}

	/**
	 * Compare two elements of array.
	 * @param index1
	 * @param index2
	 * @return 	Positive value iff array[index1] is greater than array[index2],
	 * 			Negative value iff array[index1] is smaller than array[index2],
	 * 			Zero iff both elements are the same.
	 */
	@Override
	protected int compareElements(int index1, int index2) {
		return array[index1] - array[index2] < 0 ? -1 :  1;
	}

	/**
	 * Swap elements of array.
	 * @param index1
	 * @param index2
	 */
	@Override
	protected void swapElements(int index1, int index2) {
		double temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	/**
	 * Test template method approach.
	 * @param args
	 */
	public static void main(String args[]) {
		double[] testArray = {3.5, 4.5,4.2, 1};
		new DoubleBubbleSorter().sortAscending(testArray);
		for (double i : testArray) System.out.println(i);
	}
	
}
