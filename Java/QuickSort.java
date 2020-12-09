private int pivot(int[] Arr, int low, int high, boolean ascending) {
	int pivotValue = Arr[high];
	int pivotPoint = (low - 1);

	for (int j = low; j < high; j++) {
		if ((Arr[j] < pivotValue && ascending) || (Arr[j] > pivotValue && !ascending)) {
			pivotPoint++;
			int temp = Arr[pivotPoint];
			Arr[pivotPoint] = Arr[j];
			Arr[j] = temp;
		}
	}

	int temp = Arr[pivotPoint + 1];
    Arr[pivotPoint + 1] = Arr[high];
    Arr[high] = temp;

    return pivotPoint + 1;
}

private void quickSort(int[] Arr, int low, int high, boolean ascending) {
	if (low < high) {
    	int p = pivot(Arr, low, high, ascending);
        quickSort(Arr, low, p - 1, ascending);
        quickSort(Arr, p + 1, high, ascending);
	}
}
