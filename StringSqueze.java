class StringSqueze {

	static String squezeTheString (String s) {

		String newString = "";

		for(int i=0; i<s.length(); ++i) {

			if (s.charAt(i) != ' ') {
				newString+= s.charAt(i);
			}
		}
		return newString;
	}

	public static void main (String... s ) {

		String test = squezeTheString("India is a good country");
		System.out.println(test);
	}


}