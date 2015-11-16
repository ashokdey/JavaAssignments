class Max1 {

	static int minNumberIn2D (int x[][]) {

		int min = x[0][0];

		for (int i=0; i<x.length; ++i ) {
			
			for (int j=0; j<x[i].length; ++j ) {
				
				if (x[i][j]>min) {
					min = x[i][j];
				}
			}
		}

		return min;
	}

	static void printArray(int x[][]) {

		for (int i=0; i<x.length; ++i ) {

			for (int j=0; j<x[i].length; ++j ) {

				System.out.print(x[i][j] + "\t");
			}

			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		int arr[][] = {
						{1, 2, 3},
						{10, 20, 30},
						{35, 20, 10}
						};

		int minNum = minNumberIn2D(arr);
		printArray(arr);

		System.out.println("The minimum number is : "+ minNum);
	}
}