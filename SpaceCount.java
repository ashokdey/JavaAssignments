class SpaceCount {

	static int countSpaces (String s) {

		int counter =0;

		for (int i=0; i<s.length(); ++i ) {

			if(s.charAt(i) == ' '){
				++counter;
			}
		}
		return counter;
	}

	public static void main(String... s ) {

		int numberOfSpaces = countSpaces("I am  an   Indian !");
		System.out.println("Number of spaces = " + numberOfSpaces);	

	}
}