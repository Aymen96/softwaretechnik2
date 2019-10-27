package messyCode;

public class IntegerBubbleSorter {
	private int[] array;
	
	/**
	 * Sort array in ascending order.
	 * @param array
	 */
	public void sortAscending(int[] array) {
		this.array = array; 
		if(array.length <= 1) {
			return;
		}
		
		for (int nextToLast = array.length - 2; nextToLast >= 0; nextToLast--) {
			for (int index = 0; index <= nextToLast; index++) {
				if (compareElements(index, index + 1) > 0 )
					swapElements(index, index + 1);
			}
		}
	}
	
	private int compareElements(int index1, int index2) {
		return array[index1] - array[index2];
	}

	private void swapElements(int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	public static void main(String args[]) {
		int[] testArray = {3, 4, 1};
		new IntegerBubbleSorter().sortAscending(testArray);
		for(int i: testArray) System.out.println(i);
	}
}

