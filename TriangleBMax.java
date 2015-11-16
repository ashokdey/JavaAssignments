class TriangleBMax {
	
	static int triangleBMax(int x[][]) {
		int max=x[0][0];

		for (int i=0; i<x.length; ++i ) {

			for (int j=0; j<x[i].length; ++j ) {
				
				if (i>=j && max < x[i][j]) {

					max = x[i][j];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[][] = {
					{10, 20, 180},
					{40, 50, 60},
					{170, 80, 90}
				};

		int maxValue = triangleBMax(arr);
		System.out.println("Max value in lower triangle is : "+ maxValue);		
	}
}