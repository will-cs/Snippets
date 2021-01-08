private void quickSortHelper(int[] Arr, int low, int high, boolean ascending) {
	if (low < high) {
		int pivotValue = Arr[high];
		int pivotPoint = (low - 1);
		int temp;

		for (int i = low; i < high; i++) {
			if ((Arr[i] < pivotValue && ascending) || (Arr[i] > pivotValue && !ascending)) {
				pivotPoint++;
				temp = Arr[pivotPoint];
				Arr[pivotPoint] = Arr[i];
				Arr[i] = temp;
			}
		}

		pivotPoint++;
		temp = Arr[pivotPoint];
		Arr[pivotPoint] = Arr[high];
		Arr[high] = temp;

		quickSortHelper(Arr, low, pivotPoint - 1, ascending);
		quickSortHelper(Arr, pivotPoint + 1, high, ascending);
	}
}

private void quickSort(int[] Arr, boolean ascending) {
	quickSortHelper(Arr, 0, Arr.length - 1, ascending);
}
