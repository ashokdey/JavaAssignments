class FindDigit {

	static boolean isDigitPresent(String s) {

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
		if (counter > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String... s) {
		
		String a = "Programming2 is fun.";
		
		System.out.println();
		System.out.println("String is => "+ a);

		if (isDigitPresent(a)) {
			System.out.println("Digit present in String => "+ a);
		}
		else {
			System.out.println("No digits in String => "+ a);
		}

	}
}