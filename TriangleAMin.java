class TriangleAMin {
	
	static int triangleAMin(int x[][]) {
		int min=x[0][0];

		for (int i=0; i<x.length; ++i ) {

			for (int j=0; j<x[i].length; ++j ) {
				
				if (i<=j && min > x[i][j]) {

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
					{70, 80, 90}
				};

		int minValue = triangleAMin(arr);
		System.out.println("Min value in upper triangle is : "+ minValue);		
	}
}