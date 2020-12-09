private void bubbleSort(int[] Arr, boolean ascending) {
    boolean swap = true;
    int bottom = Arr.length - 1;
    int temp;
	while (swap) {
        swap = false;
		for (int j = 0; j < bottom; j++) {
			if ((Arr[j] > Arr[j + 1] && ascending) || (Arr[j] < Arr[j + 1] && !ascending)) {
                swap = true;
                temp = Arr[j];
                Arr[j] = Arr[j + 1];
            	Arr[j + 1] = temp;
        	}
        }
    	bottom--;
	}
}
