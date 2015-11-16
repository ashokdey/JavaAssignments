class TriangleBSum {

	static int triangleBSum(int x[][]) {
		int sum=0;

		for (int i =0; i<x.length; ++i ) {

			for (int j=0; j<x[i].length; ++j ) {

				if (i>=j) {

					sum+= x[i][j];					
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[][] = {
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}
				};

		int sum = triangleBSum(arr);

		System.out.println("Sum of lower Traingle = " + sum);
	}
}