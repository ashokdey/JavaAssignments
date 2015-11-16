class WordCount {

	static int countTheWords( String s ) {
		
		int count =0;

		for (int i=0; i<s.length(); ++i ) {

			if(
				   (s.charAt(i) == ' ') || (s.charAt(i) == '!') || 
				   (s.charAt(i) == '@') || (s.charAt(i) == '#') || 
				   (s.charAt(i) == '$') || (s.charAt(i) == '%') ||
				   (s.charAt(i) == '^') || (s.charAt(i) == '&') ||
				   (s.charAt(i) == '*') || (s.charAt(i) == '(') ||
				   (s.charAt(i) == ')') || (s.charAt(i) == '{') ||
				   (s.charAt(i) == '}') || (s.charAt(i) == '\'')||
				   (s.charAt(i) == '\"')|| (s.charAt(i) == '|') ||
				   (s.charAt(i) == '[') || (s.charAt(i) == ']') ||
				   (s.charAt(i) == '-') || (s.charAt(i) == '+')
			  )
				++count; // Increase counter for each symbol between the words
		}

		return (count+1);
	}

	public static void main (String... s) {

		int numberOfWords = countTheWords("I am#an-Indian!");
		System.out.println("Number of words = " + numberOfWords);	

	}
}