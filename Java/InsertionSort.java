private void insertionSort(int[] Arr, boolean ascending) {
	int temp, j;
	for (int i = 1; i < Arr.length; i++) {
		temp = Arr[i];
		j = i - 1;
		while (j >= 0 && ((Arr[j] > temp && ascending) || (Arr[j] < temp && !ascending))) {
			Arr[j + 1] = Arr[j];
			j--;
		}
		Arr[j + 1] = temp;
	}
}
