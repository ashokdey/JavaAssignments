class CharCount {

	static int countCharacters (String s) {

		int counter =0;

		for (int i=0; i<s.length(); ++i ) {

			if(s.charAt(i) != ' '){
				++counter;
			}
		}
		return counter;
	}

	public static void main(String... s ) {

		int numberOfChars = countCharacters("I am  an   Indian !");
		System.out.println("Number of characters (without spaces) = " + numberOfChars);	

	}
}