class PalindromeString {


	static boolean isPalindrome (String a) {

		String b = reverseString2 (a);

		System.out.println("Original String = "+ a);
		System.out.println ("Reversed String = "+ b);

		boolean check = stringEquals(a,b);

		if (check)
			return true;
		else 
			return false;
	}

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

	static boolean stringEquals (String a, String b) {

		int counter =0;

		if (a.length() == b.length()) {

			for (int i= 0; i<a.length(); ++i ) {
			
			if(a.charAt(i) != b.charAt(i))
				++counter;
			}

			if(counter>0) 
				return false;
			else
				return true;
		} 

		else {
			return false;
		}
	}

	public static void main(String... s) {

		System.out.println (isPalindrome("Hello World"));
		System.out.println (isPalindrome("malayalam"));
		System.out.println (isPalindrome("madam"));

	}
}






