class LeftTrim {

	static String trimLeft(String s) {

		int i = 0;
		String n = "";

		while (s.charAt(i) == ' ')
			++i;

		int j= i;

		for (; i<(s.length()); ++i) {
			n+= s.charAt(i);
		}

		return n;
	}

	public static void main(String... s) {

		String a = "   India is the best country";
		System.out.println ();
		System.out.println ("Original string = "+a);
		System.out.println ("Length of Original string before trimming = "+ a.length());
		System.out.println ();

		String b = trimLeft(a);
		System.out.println ("Trimming....");
		System.out.println ();

		System.out.println("After trimming => ");
		System.out.println (b); 
		System.out.println ();

		System.out.println ("Length of string after trimming = "+ b.length());
		System.out.println ();
	}

}