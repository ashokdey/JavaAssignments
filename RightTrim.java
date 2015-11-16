class RightTrim {

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

	public static void main(String... s) {

		String a = "India is best country    ";

		System.out.println();
		System.out.println ("Original string before trimming = "+ a);
		System.out.println();

		System.out.println ("Length of Original string before trimming = "+ a.length());
		System.out.println();

		String b = trimRight(a);

		System.out.println("Final string = "+b);
		System.out.println();

		System.out.println("Length of final string = "+b.length());
		System.out.println();

	}
}