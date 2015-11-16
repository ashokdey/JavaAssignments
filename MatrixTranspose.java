class MatrixTranspose {

	static int[][] transpose(int x[][]) {

		int z[][] = new int[x.length][x[0].length]; // Creating new array 
													// x.length = 3 and x[0].length = 3
													// therefore int z[][] = new int[3][3]
		for (int i=0; i<x.length; ++i ) {
			for (int j=0; j<x[0].length; ++j ) {
				
				z[i][j] = x[j][i]; // Transposing the matrix x into z 
			}
		}
		return z;
	}


	static void printArray(int x[][]) {
		for (int i=0; i<x.length; ++i ) {
			for (int j=0; j<x[0].length; ++j ) {
				System.out.print(x[i][j] +"\t");
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void main(String[] args) {
		
		int arr1[][] = {{1,2,3}, {4,5,6}, {3,2,1}};
		printArray(arr1);

		int arr2[][] = new int[arr1.length][arr1[0].length];
		arr2 = transpose(arr1);
		printArray(arr2);
	}

}






