private int pivot(int[] Arr, int low, int high, boolean ascending) {
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

    return pivotPoint;
}

private void quickSort(int[] Arr, int low, int high, boolean ascending) {
	if (low < high) {
		int p = pivot(Arr, low, high, ascending);
		quickSort(Arr, low, p - 1, ascending);
		quickSort(Arr, p + 1, high, ascending);
	}
}
