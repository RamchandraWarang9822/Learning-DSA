public class bubbleSort extends array {

	bubbleSort(int[] arr) {

//		int[] arr;
//
//		array a = new array();
//		arr = a.getArray();

		// Bubble Sort (Sinking Sort):
		// In this sorting algorithm we push the heavy value element to the end of the
		// array.
		// by swapping two elements with each other until the array is sorted

		// Time complexity : O(n^2)

		// Outer loop
		for (int i = 0; i < arr.length; i++) {

			// Inner loop
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {

					// Swapping
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		// Printing Array

		Main m = new Main();

		m.print(arr);

	}

}
