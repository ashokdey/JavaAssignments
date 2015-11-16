class IncDoubleOp {

	static void halfArray(int a[]) {

		for (int i = 0; i<a.length; ++i) {
			if (a[i]>1) {
				a[i]/=2;
			}
		}
	}

	public static void main(String... s) {

		int arr[] = {7,5,8,1,8,6,6,5,3,5,5,2,8,9,9,4,6,9,4,4,1,9,9,2,8,4,7,4,8,8,6,3,9,4,3,4,5,1,9,8,3,8,3,7,9,3,8,4,4,7};

		int i, c=0;
		
		for (i=0; i<arr.length; ++i) {
			
			while (arr[i] > 0 ) {
				
				if (arr[i]%2 == 0) {
					halfArray(arr);
					c++;
				}
				else {
					arr[i]-=1;
					c++;
				}			
			}	
		}
		
		System.out.println("Minimum Opertaions are : "+ c);

		// Printing the final array 
/*
		for (i= 0; i<arr.length; ++i) {
			System.out.print("\t"+ arr[i]);
		}
*/		System.out.println();
	}
}






/*
You have an array with N elements.
Initially, each element is 0.
You can perform the following operations:
Increment operation: Choose one element of the array and increment the value by one.
Doubling operation: Double the value of each element.
You are given a vector <int> desiredArray containing N elements.
Compute and return the smallest possible number of operations needed to change the array from all zeros to desiredArray.

CONSTRAINTS
-desiredArray will contain between 1 and 50 elements, inclusive.
-Each element of desiredArray will be between 0 and 1,000, inclusive.

EXAMPLES

0)
{2, 1}
Returns: 3
One of the optimal solutions is to apply increment operations to element 0 twice and then to element 1 once.
Total number of operations is 3.

1)
{16, 16, 16}
Returns: 7
The optimum solution looks as follows.
First, apply an increment operation to each element.
Then apply the doubling operation four times.
Total number of operations is 3+4=7.

2)
{100}
Returns: 9

3)
{0, 0, 1, 0, 1}
Returns: 2
Some elements in desiredArray may be zeros.

4)
{123, 234, 345, 456, 567, 789}
Returns: 40

5)
{7,5,8,1,8,6,6,5,3,5,5,2,8,9,9,4,6,9,4,4,1,9,9,2,8,4,7,4,8,8,6,3,9,4,3,4,5,1,9,8,3,8,3,7,9,3,8,4,4,7}
Returns: 84



*/