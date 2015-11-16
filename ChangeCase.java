class ChangeCase {
	
	static String changeCase (String s ) {

		char tempString[] = new char[s.length()];
		int t;

		for (int i=0; i<s.length(); ++i ) {

			t = ( int ) s.charAt(i);

			if (t >97) {
				t -= 32;
			}
			else {
				t += 32;
			}

			tempString[i] = (char) t;
		}

		String newString = new String(tempString);

		return newString;
	} 

	public static void main( String... s ) {
		String a = "InDiA";
		String b = changeCase(a);

		System.out.println();
		System.out.println("Original String ==> "+a);
		System.out.println();
		System.out.println("Changed String ==> "+b);
		System.out.println();

	} 
}