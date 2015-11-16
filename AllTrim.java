class AllTrim {

	static String trimAll (String s) {

		String resultString = trimLeft(s);
		resultString = trimRight(resultString);

		return resultString;
	}

	static String trimLeft(String s) {

		int i = 0;
		String result = "";

		while (s.charAt(i) == ' ')
			++i;

		int j= i;

		for (; i<(s.length()); ++i) {
			result+= s.charAt(i);
		}

		return result;
	}

	static String trimRight (String s) {
		
		int i = s.length()-1;

		while (s.charAt(i) == ' ')
			--i;

		char n[] = new char [i+1];

		for (int j=0; j<=i; ++j ) {
			n[j] = s.charAt(j);
		}

		String result = new String(n);

		return result;
	}

	public static void main (String... s ) {

		String a = "     India is the best country.   ";

		System.out.println ();
		System.out.println ("Original string = "+ a);
		System.out.println ();

		System.out.println ("Length of original string = "+ a.length());
		System.out.println ();

		String b = trimAll(a);

		System.out.println ("String after trimming both sides = "+ b);
		System.out.println ();
		
		System.out.println ("Length of string after trimming = "+ b.length());
		System.out.println ();

	}

}