class SequenceCount {
	
	static void countSequence (String s) {

		StringBuffer sb = new StringBuffer(s);
		char checkChar;

		for (int i=0; i<s.length(); ++i) {

			checkChar = sb.charAt(i);

			if (sb.charAt(i) != '0'){

				int counter =1;
				for (int j=i+1; j<s.length(); ++j) {

					if (sb.charAt(j) == checkChar) {
						++counter;
						sb = replaceCharAt(sb, j, '0');
					}
				}
				System.out.println (checkChar +"  ==>  "+ counter);
			}
		}

	}

	static StringBuffer replaceCharAt (StringBuffer sb, int pos, char value) {

		char bufferCharacter[] = new char[sb.length()];

		for (int i=0; i<sb.length(); ++i ) {
			bufferCharacter[i] = sb.charAt(i);	
		}

		bufferCharacter[pos] = value;

		String bufferString = new String(bufferCharacter);
		StringBuffer sbNew = new StringBuffer(bufferString);

		return sbNew;

	}

	public static void main(String... s) {

		String test = "aabdcaabbbcdddeaabbbddd";
		countSequence(test);
	}
}