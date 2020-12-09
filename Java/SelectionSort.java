private void selectionSort(int[] Arr, boolean ascending) {
	int temp;
	for (int i = 0; i < Arr.length - 1; i++) {
    	for (int j = i + 1; j < Arr.length; j++) {
        	if ((Arr[i] > Arr[j] && ascending) || (Arr[i] < Arr[j] && !ascending)) {
            	temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
			}
		}
	}
}
