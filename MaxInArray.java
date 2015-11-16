class MaxInArray {

	static int maxInArray(int x[]) {
		int i=0, max = x[0];

		while ( i < x.length ) {
			if (x[i] > max ) {
				max = x[i];
			}
			++i;
		}
		return max;
	}

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};

		int a = maxInArray(arr);

		System.out.println(a);

		}
}