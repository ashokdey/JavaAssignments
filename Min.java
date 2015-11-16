class Min {

	static int minNumber (int x[]) {

		int min = x[0];

		for (int i=0; i<x.length; ++i ) {

			if (x[i]<min) {
				min = x[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 45, 40, 1, 31, 99, 0, -1};

		int minNum = minNumber(arr);

		System.out.println("The array elements are :");

		for (int i=0; i<arr.length; ++i ) {
			System.out.print(arr[i]+"\t");
		}

		System.out.println("\nThe minimum number is : "+ minNum);
	}
}