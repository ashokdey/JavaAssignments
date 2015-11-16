class SingleOccurence {

	static String singleOccur (String s) {

		int len = s.length();
		String finalString = "";
		char checkChar;
		int i = 0;

		System.out.println();
		System.out.println("Processing String...");

		while (i<len) {

			checkChar = s.charAt(i);

			if(i>=len-1)
				break;

			while ((checkChar == s.charAt(++i))  && (i<len-1));

			finalString += checkChar;
			System.out.println(finalString);
						
		}

		return finalString;
	}

	public static void main ( String... s) {

		String test = "nnittinnn";
		
		System.out.println();
		System.out.println("Original String ==> "+ test);

		String result = singleOccur(test);

		System.out.println();
		System.out.println("Final String ==> "+ result);
		System.out.println();

	}
}