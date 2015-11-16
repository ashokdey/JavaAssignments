class TriangleBMin {
	
	static int triangleBMin(int x[][]) {
		int min=x[0][0];

		for (int i=0; i<x.length; ++i ) {

			for (int j=0; j<x[i].length; ++j ) {
				
				if (i>=j && min > x[i][j]) {

					min = x[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[][] = {
					{10, 20, 30},
					{40, 5, 60},
					{2, 80, 90}
				};

		int minValue = triangleBMin(arr);
		System.out.println("Min value in lower triangle is : "+ minValue);		
	}
}