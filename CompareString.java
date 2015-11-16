class CompareString {

	static int compareString (String a, String b) {

		int len1 = a.length();
		int len2 = b.length();
		int difference = 0;

		if (len1 == len2) {

			for (int i=0; i<len1; ++i ) {
				
				difference += a.charAt(i) - b.charAt(i); 
			}

			return difference;

		}
		else {
			return (len1 - len2);
		}
	}

	static void checkString (String a, String b) {

		System.out.println();
		System.out.println("String a => "+ a);
		System.out.println("String b => "+ b);
		System.out.println("Comparing strings....");
		System.out.println();

		int difference = compareString(a,b);

		if (difference > 0) {
			System.out.println("String a is large.");
		}
		else if (difference < 0) {
			System.out.println("String b is large.");
		}
		else {
			System.out.println("Both the strings are equal.");
		}
		System.out.println();
	}

	public static void main(String... s) {
		
		String a = "India is a good country.";
		String b = "India is a good country.";

		checkString(a,b);

		/*------------------------------------------------------------*/

		a = "India is the best country.";
		b = "India is a good country.";

		checkString(a,b);

		/*------------------------------------------------------------*/

	 	a = "India is a good country.";
	 	b = "India is a GOOD country.";

		checkString(a,b);

		/*------------------------------------------------------------*/

		a = "India is a GOOD Country.";
		b = "India is a good country.";

		checkString(a,b);

		/*------------------------------------------------------------*/

	}
}