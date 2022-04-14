
public class Sorted {
	public static <T extends Comparable<T>> void cocktailSort(T[] arr) {
		boolean swap;
		do {
			swap = false;
			for (int i = 0; i <= arr.length - 2; i++) {
				if (arr[i].compareTo(arr[i + 1]) == 1) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap = true; 
				}
			}
			if (!swap) {
				break;
			}
			swap = false;
			for (int i = arr.length - 2; i >= 0; i--) {
				if (arr[i].compareTo(arr[i + 1]) == 1) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swap = true;
				}
			}
		} while (swap);

	}
}
