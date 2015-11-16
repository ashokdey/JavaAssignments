class TriangleAMax {
	
	static int triangleAMax(int x[][]) {
		int max=x[0][0];

		for (int i=0; i<x.length; ++i ) {

			for (int j=0; j<x[i].length; ++j ) {
				
				if (i<=j && max < x[i][j]) {

					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[][] = {
					{10, 20, 180},
					{40, 150, 60},
					{70, 80, 90}
				};

		int maxValue = triangleAMax(arr);
		System.out.println("Max value in upper triangle is : "+ maxValue);		
	}
}