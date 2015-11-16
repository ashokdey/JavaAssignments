class VowelCount {

	static int countVowels(String s) {

		int counter =0;

		for (int i= 0; i<s.length(); ++i ) {
			
			if( 
				s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
				s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || 
				s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || 
				s.charAt(i) == 'U' 
			  )
				++counter;
		}
		return counter;
	}

	public static void main(String... s) {
		String testString = "I am an Indian, India is the best country";

		int numberOfvowels = countVowels(testString);

		System.out.println("Number of vowels = "+ numberOfvowels);
	}


}