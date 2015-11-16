class FrequencyCountNonRepeating {

	static void frequencyCountNoRepeat (int x[]) {

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

				if (count ==1 )
				System.out.println(x[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {0, 3, 4, 1, 5, 3, 2, 6, 6, 6, 7, 4, 4, 4, 4, 5, 9, 11};

		System.out.println("The non repeating elements are :");
		frequencyCountNoRepeat(arr);
	}
}









