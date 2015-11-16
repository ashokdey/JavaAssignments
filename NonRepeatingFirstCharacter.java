class NonRepeatingFirstCharacter {

	static char findNonRepeatingFirstCharacter (String s) {

		char c = '\n';

		for (int i=0;  i<s.length(); ++i) {
			
			c = s.charAt(i);

			if (s.indexOf(c) == s.lastIndexOf(c)) {
				break;
			}
		}

		return c;

	}

	public static void main(String... s) {

		String a = "I love India";
		System.out.println();
		System.out.println("String is == > "+ a);

		System.out.println();
		char c = findNonRepeatingFirstCharacter(a);
		System.out.println("First non repeating char ==> "+ c);
		System.out.println();
		
	}
}