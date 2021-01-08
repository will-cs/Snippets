private void countSort(int[] arr, int min, int max) {
	int[] counts = new int[max - min];
	for (int i = 0; i < arr.length; i++) {
		counts[arr[i] - min] += 1;
	}

	int slot = 0;
	for (int value = 0; value < counts.length; value++) {
		for (int i = 1; i <= counts[value]; i++) {
			arr[slot] = value + min;
			slot++;
		}
	}
}
