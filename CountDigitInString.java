class CountDigitInString {

	static int countDigits(String s) {

		int counter =0;

		for (int i=0; i<s.length(); ++i ) {
			
			if (
				s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' ||
				s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' ||
				s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' ||
				s.charAt(i) == '9'
			   )

				++counter;
		}
		return counter;
	}

	public static void main(String... s) {
		
		String a = "java123 is a good34 language223344";

		System.out.println();
		System.out.println("String => "+ a);
		System.out.println();

		int numberofDigits = countDigits(a);
		System.out.println("Number of digits in string = "+ numberofDigits);
		System.out.println();
	}

}