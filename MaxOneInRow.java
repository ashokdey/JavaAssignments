class MaxOneInRow {

	static int maxOneInRow(int x[][]) {

		int max = 0;
		int row = 0;

		for (int i=0; i<x.length; ++i ) {
			int countCurrent =0;

			for (int j=0; j<x[i].length; ++j ) {
				if (x[i][j] == 1) {
					++countCurrent;
				}
			}

			if ( countCurrent > max) {
				max = countCurrent;
				row = i;
			}
			else {
				row = i-1;
			}			
		}

		return row;
	}

	public static void main(String[] args) {
		
		int arr[][] = {
					{0, 0, 1, 1, 1},
					{0, 0, 0, 1, 1},
					{0, 0, 0, 0, 1},
					{1, 1, 1, 1, 1},
					{0, 0, 0, 0, 0}
				};

		int rowIndex = maxOneInRow(arr);
		System.out.println(rowIndex + " has maximum 1s");
	}
}



