class MatrixAdd {

	static int[][] addMatrix (int x[][], int y[][]) {

		int z[][] = new int[x.length][x[0].length];

		for (int i=0; i<x.length; ++i ) {
			
			for (int j=0; j<x[i].length; ++j ) {
				
				z[i][j] = x[i][j] + y[i][j];

			}
		}

		return z;
	}

	static void printMatrix (int p[][]) {
		for (int i=0; i<p.length; ++i ) {
			for (int j=0; j<p[i].length; ++j ) {
				System.out.print (p[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int arr1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int arr2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

		printMatrix(arr1);
		System.out.println();

		printMatrix(arr2);
		System.out.println();

		System.out.println("Sum of Matrices is : ");
		System.out.println();

		int arr3[][] = new int[arr1.length][arr1[0].length];

		arr3 = addMatrix(arr1, arr2);
		printMatrix(arr3);

	}
}