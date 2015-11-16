class FrequencyCount {

	static void frequencyCount (int x[]) {

		for (int i=0; i<x.length; ++i ) {

			if (x[i]==(-1)) {
				continue;
			}

			else {

				int count =1;

				for (int j=i+1; j<x.length; ++j ) {
					
					if (x[i] == x[j]) {
						++count;
						x[j] = -1;
					}
				}
				System.out.println("Frequency of " + x[i] + " is = " + count);
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {0, 1, 2, 3, 4, 1, 1, 5, 2, 3, 2, 6, 6, 6, 7, 4, 4, 4, 4, 5, 9};

		frequencyCount(arr);
	}
}









