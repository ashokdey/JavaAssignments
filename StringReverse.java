class StringReverse {

	static String reverseString (String s) {

		int j=0;
		char[] newString = new char[s.length()];

		for(int i = s.length()-1; i>=0; --i) {

			newString[j] = s.charAt(i);
			++j;
		}

		String newS = new String(newString);

		return newS;
	}

	static String reverseString2 (String s) {

		String reverse = "";

		for(int i = s.length()-1; i>=0; --i) {

			reverse += s.charAt(i);
	
		}
		return reverse;
	}

	public static void main(String... s ) {

		String myString = "Java Programming";
		System.out.println("Original string is = "+ myString);
		System.out.println("Revered string is = "+ reverseString(myString));

		String myString2 = "Malayalam";
		System.out.println("Revered string is = "+ myString2);
		System.out.println("Revered string is = "+ reverseString2(myString2));

	}
}