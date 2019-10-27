package strategyPattern;

public class DoubleSortStrategy implements SortStrategy {

	private double[] array;
	
	@Override
	public int compareElements(int index1, int index2) {
		return array[index1] - array[index2] > 0 ? 1 : - 1;
	}

	@Override
	public void swapElements(int index1, int index2) {
		double temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	@Override
	public int getLength() {
		return array.length;
	}

}
